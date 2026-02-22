import java.util.Scanner;

public class Day12_Factorial {
    public static int calcFactorial(int n) {

        if (n == 1 || n == 0) {
            return 1;
        }
        
        int fact_nm1 = calcFactorial(n - 1);
        
        int fact_n = n * fact_nm1;
        
        return fact_n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int result = calcFactorial(n);
        System.out.println("The Factorial of " + n + " is: " + result);
        sc.close();
    }
}