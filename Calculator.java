import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("This is a calculator that will help you to Add Substract Divide and Multiply numbers.");
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
		System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
		System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not possible. Give a different number.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }

        System.out.println("The Result for the choosen operator is: " + result);
        System.out.print("We are delighted to provide you with our esteemed services: ");
        scanner.close();
    }
}