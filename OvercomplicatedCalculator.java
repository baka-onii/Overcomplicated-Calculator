import java.util.Scanner;

class CannotDivideByZeroException extends Exception
{
	public CannotDivideByZeroException(String message)
	{
		super(message);
	}
}

class InvalidInputException extends Exception
{
	public InvalidInputException(String message)
	{
		super(message);
	}
}
class MaxMultiplierReachedException extends Exception
{
	public MaxMultiplierReachedException(String message)
	{
		super(message);
	}
}
class MaxInputException extends Exception
{
	public MaxInputException(String message)
	{
		super(message);
	}
}

class Calculator
{
	Scanner sc = new Scanner(System.in);
	private int num1, num2;
	private char operator;
	
	public static float divide(float a, float b) throws CannotDivideByZeroException {
        if (b == 0) {
            throw new CannotDivideByZeroException("You can't divide by zero!");
        }
        return a / b;
    }

    public static float multiply(float a, float b) throws MaxMultiplierReachedException {
        if (a > 7000 || b > 7000) {
            throw new MaxMultiplierReachedException("Multiplier limit exceeded.");
        }
        return a * b;
    }

    public static float add(float a, float b) throws MaxInputException {
        if (a > 10000 || b > 10000) {
            throw new MaxInputException("Input is too large.");
        }
        return a + b;
    }
    
    public static float sub(float a, float b) throws MaxInputException {
    	if (a > 10000 || b > 10000) {
    		throw new MaxInputException("Input is too large.");
    	}
    	return a - b;
    }
	
	public void run()
	{
		while(true)
		{
			
			System.out.println("Enter number 1: ");
			float num1 = sc.nextFloat();
		
			System.out.println("Enter operation (+, -, *, /): ");
			char operator = sc.next().charAt(0);

			System.out.println("Enter number 2: ");
			float num2 = sc.nextFloat();
			
			System.out.print("Output: ");
			
			switch(operator)
			{
			case '+':
				try {
				    float result = Calculator.add(num1, num2);
				    System.out.println(result);
				} catch (MaxInputException e) {
				    System.out.println("Error: " + e.getMessage());
				}
				break;
				
			case '-':
				try {
				    float result = Calculator.add(num1, num2);
				    System.out.println("Result: " + result);
				} catch (MaxInputException e) {
				    System.out.println("Error: " + e.getMessage());
				}
				break;
				
			case '*':
				try {
				    float result = Calculator.multiply(num1, num2);
				    System.out.println("Result: " + result);
				} catch (MaxMultiplierReachedException e) {
				    System.out.println("Error: " + e.getMessage());
				}
				break;
				
			case '/':
				try {
				    float result = Calculator.divide(num1, num2);
				    System.out.println("Output: " + result);
				} catch (CannotDivideByZeroException e) {
				    System.out.println("Error: " + e.getMessage());
				}
				break;
			}
		
		System.out.println("Operation Finished!\n");
		System.out.println("New Operation Started...\n\n");
			
		}
	}
}


public class OvercomplicatedCalculator {

	public static void main(String[] args) {
		
		final String BOLD = "\u001B[1m";
        final String RESET = "\u001B[0m";
		System.out.println(BOLD +
                "   ____                                          _ _           _           _    _____      _            _       _             \n" +
                "  / __ \\                                        | (_)         | |         | |  / ____|    | |          | |     | |            \n" +
                " | |  | |_   _____ _ __ ___ ___  _ __ ___  _ __ | |_  ___ __ _| |_ ___  __| | | |     __ _| | ___ _   _| | __ _| |_ ___  _ __ \n" +
                " | |  | \\ \\ / / _ \\ '__/ __/ _ \\| '_ ` _ \\| '_ \\| | |/ __/ _` | __/ _ \\/ _` | | |    / _` | |/ __| | | | |/ _` | __/ _ \\| '__|\n" +
                " | |__| |\\ V /  __/ | | (_| (_) | | | | | | |_) | | | (_| (_| | ||  __/ (_| | | |___| (_| | | (__| |_| | | (_| | || (_) | |   \n" +
                "  \\____/  \\_/ \\___|_|  \\___\\___/|_| |_| |_| .__/|_|_|\\___\\__,_|\\__\\___|\\__,_| \\_____|\\__,_|_|\\___|\\__,_|_|\\__,_|\\__\\___/|_|   \n" +
                "                                          | |                                                                                 \n" +
                "                                          |_|                                                                                 " +
                RESET + "\n \n");
		
		Calculator calc = new Calculator();
		calc.run();
	}

}
