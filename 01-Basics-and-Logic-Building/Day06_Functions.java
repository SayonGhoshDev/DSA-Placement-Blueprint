import java.util.Scanner;

public class Day06_Functions {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void printGreeting(String name) {
        System.out.println("Hello, " + name + "! Welcome to Java Methods.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.next();
        printGreeting(name);

        System.out.println("--- Calculator using Methods ---");
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int sum = add(num1, num2);
        int diff = subtract(num1, num2);
        int product = multiply(num1, num2);

        System.out.println("Addition Result: " + sum);
        System.out.println("Subtraction Result: " + diff);
        System.out.println("Multiplication Result: " + product);

        sc.close();
    }
}