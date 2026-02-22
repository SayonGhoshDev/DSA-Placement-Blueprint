import java.util.Scanner;

public class Day12_SumOfN {
    public static void printSum(int i, int n, int sum) {

        if (i == n) {
            sum += i;
            System.out.println("The sum of first " + n + " numbers is: " + sum);
            return;
        }
        
        sum += i; 
        printSum(i + 1, n, sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        
        printSum(1, n, 0); 
        
        sc.close();
    }
}