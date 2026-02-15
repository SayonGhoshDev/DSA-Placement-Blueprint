import java.util.Scanner;

public class Day05_While_Loops_and_Do_While_Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            
            int sum = 0;
            int temp = n;

            while (n > 0) {
                int lastDigit = n % 10;
                sum = sum + lastDigit;
                n = n / 10;
            }

            System.out.println("Sum of digits: " + sum);

            System.out.print("Do you want to continue? (1 for Yes / 0 for No): ");
            choice = sc.nextInt();
            System.out.println();

        } while (choice == 1);

        System.out.println("Program Terminated.");
        sc.close();
    }
}