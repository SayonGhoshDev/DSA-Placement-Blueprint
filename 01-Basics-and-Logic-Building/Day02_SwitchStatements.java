import java.util.Scanner;

public class Day02_SwitchStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstnum = sc.nextInt();

        System.out.print("Enter second number: ");
        int secondnum = sc.nextInt();

        System.out.print("Enter operator (+, -, *, /, %): ");
        String operator = sc.next();

        switch (operator) {
            case "+": System.out.println("Addition Result: " + (firstnum + secondnum)); 
            break;
            
            case "-": System.out.println("Subtraction Result: " + (firstnum - secondnum)); 
            break;
            
            case "*": System.out.println("Multiplication Result: " + (firstnum * secondnum)); 
            break;
            
            case "/": 
                if (secondnum != 0) {
                    System.out.println("Division Result: " + (firstnum / secondnum)); 
                } else {
                    System.out.println("Error: Division by Zero is not allowed!");
                }
            break;
            
            case "%": 
                if (secondnum != 0) {
                    System.out.println("Remainder: " + (firstnum % secondnum)); 
                } else {
                    System.out.println("Error: Division by Zero is not allowed!");
                }
            break;

            default: System.out.println("Invalid Operator! Please use +, -, *, /, or %");
            break;
        }

        sc.close();
    }
}