#include <iostream>
#include <string>


class Calculator{
    float a, b;
    std::string operation;

    public:
        Calculator(float num1, float num2)
            : a(num1), b(num2)
        {
            std::cout << "Enter your operation: (Name)" << std::endl;
            std::cout << "0. Addition \t 1. Subtration \t 2. Multiplication \t 3. Division \t 4. Modulo \t 5. Percentage (Earned and Total)" << std::endl;
            std::cin >> operation;
        }
       
        float PerformCalculation(){
            if (operation == "Addition") {
                return a + b;
            } else if (operation == "Subtraction") {
                return a - b;
               
            } else if (operation == "Multiplication") {
                return a * b;
               
            } else if (operation == "Division") {
                if (b != 0) {
                    return a / b;
                } else {
                    std::cout << "Divide by Zero error" << std::endl;
                    return 0;
                }
               
            } else if (operation == "Modulo") {
                return (int)a % (int)b;
               
            } else if (operation == "Percentage") {
                return a * 100 / b;
               
            } else {
                std::cout << "Check ya spelling doofus" << std::endl;
                return 0;
            }
        }
       
        void displayAnswer(){
            std::cout << PerformCalculation() << std::endl;
        }
};

int main() {
    bool state = true;
    std::string a, b;
    std::cout << "Chad Calculator" << std::endl;
    while(state){
        std::cout << "Enter Numbers with Enter: (Enter 'quit' to exit)" << std::endl;
        std::cin >> a;
        if (a == "quit"){
            state = false;
            break;
        }
        std::cin >> b;
        Calculator answer(std::stof(a), std::stof(b));
        answer.displayAnswer();
    }

    return 0;
}
