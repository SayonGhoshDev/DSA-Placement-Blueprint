import java.util.Scanner;

public class Day08_DigitOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int temp = n, count = 0, rev = 0;

        do {
            count++;
            temp /= 10;
        } while(temp > 0);
        System.out.println("Total Digits: " + count);

        temp = n;
        while(temp > 0) {
            rev = (rev * 10) + (temp % 10);
            temp /= 10;
        }
        System.out.println("Reversed Number: " + rev);
        sc.close();
    }
}