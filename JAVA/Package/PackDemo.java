package Package;

import java.util.Scanner;

public class PackDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Trigonometric Operations
        System.out.println("Enter an angle (in degrees):");
        int angle = scanner.nextInt();
        Trig trig = new Trig(angle);
        System.out.println("Sine: " + trig.getSine());
        System.out.println("Cosine: " + trig.getCosine());
        System.out.println("Tangent: " + trig.getTangent());
        System.out.println("Secant: " + trig.getSecant());
        System.out.println("Cosecant: " + trig.getCosecant());
        System.out.println("Cotangent: " + trig.getCotangent());

        // Arithmetic Operations
        System.out.println("Enter two numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        Arithmetic arithmetic = new Arithmetic();
        System.out.println("Addition: " + arithmetic.add(num1, num2));
        System.out.println("Subtraction: " + arithmetic.subtract(num1, num2));
        System.out.println("Multiplication: " + arithmetic.multiply(num1, num2));
        System.out.println("Division: " + arithmetic.divide(num1, num2));

        // Statistics Operations
        System.out.println("Enter a list of numbers (separated by spaces):");
        scanner.nextLine();  // Consume newline
        String[] numbersStr = scanner.nextLine().split(" ");
        int[] numbers = new int[numbersStr.length];
        for (int i = 0; i < numbersStr.length; i++) {
            numbers[i] = Integer.parseInt(numbersStr[i]);
        }
        Stat stat = new Stat();
        System.out.println("Minimum: " + stat.min(numbers));
        System.out.println("Maximum: " + stat.max(numbers));
        System.out.println("Count: " + stat.count(numbers));
        System.out.println("Sum: " + stat.sum(numbers));
        System.out.println("Average: " + stat.average(numbers));

        scanner.close();
    }
}
