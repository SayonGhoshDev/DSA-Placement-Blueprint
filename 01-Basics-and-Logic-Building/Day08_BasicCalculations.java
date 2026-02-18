import java.util.Scanner;

public class Day08_BasicCalculations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        int sum = 0, i = 1;
        while(i <= n) {
            sum += i;
            i++;
        }
        System.out.println("Sum of 1 to " + n + " is: " + sum);

        long fact = 1;
        for(int j = 1; j <= n; j++) {
            fact *= j;
        }
        System.out.println("Factorial of " + n + " is: " + fact);
        sc.close();
    }
}