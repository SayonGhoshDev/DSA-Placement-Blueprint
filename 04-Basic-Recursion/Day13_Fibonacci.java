import java.util.Scanner;

public class Day13_Fibonacci {
    public static void printFib(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        
        int c = a + b;
        System.out.print(c + " ");
        
        printFib(b, c, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of terms for Fibonacci Series: ");
        int n = sc.nextInt();
        
        System.out.print("Fibonacci Series: ");
        if (n >= 1) {
            System.out.print(0 + " ");
        }
        if (n >= 2) {
            System.out.print(1 + " ");
        }
        if (n > 2) {
            printFib(0, 1, n - 2);
        }
        System.out.println();
        
        sc.close();
    }
}