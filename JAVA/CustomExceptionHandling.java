// Custom Exception for TooLongAddition
class TooLongAdditionException extends Exception {
    public TooLongAdditionException() {
        super("Addition result exceeds 1000");
    }
}

// Custom Exception for Negative Answer
class NegativeAnswerException extends Exception {
    public NegativeAnswerException() {
        super("Subtraction result is negative");
    }
}

// Custom Exception for TooLongMultiplication
class TooLongMultiplicationException extends Exception {
    public TooLongMultiplicationException() {
        super("Multiplication result exceeds 5000");
    }
}

public class CustomExceptionHandling {
    private int num1;
    private int num2;

    // Constructor
    public CustomExceptionHandling(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Add method
    public int add() throws TooLongAdditionException {
        int result = num1 + num2;
        if (result > 1000) {
            throw new TooLongAdditionException();
        }
        return result;
    }

    // Subtract method
    public int subtract() throws NegativeAnswerException {
        int result = num1 - num2;
        if (result < 0) {
            throw new NegativeAnswerException();
        }
        return result;
    }

    // Multiply method
    public int multiply() throws TooLongMultiplicationException {
        int result = num1 * num2;
        if (result > 5000) {
            throw new TooLongMultiplicationException();
        }
        return result;
    }

    // Divide method
    public double divide() {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return (double) num1 / num2;
    }

    public static void main(String[] args) {
        CustomExceptionHandling calculator = new CustomExceptionHandling(900, 200);

        try {
            System.out.println("Addition: " + calculator.add());
        } catch (TooLongAdditionException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Subtraction: " + calculator.subtract());
        } catch (NegativeAnswerException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Multiplication: " + calculator.multiply());
        } catch (TooLongMultiplicationException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Division: " + calculator.divide());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
