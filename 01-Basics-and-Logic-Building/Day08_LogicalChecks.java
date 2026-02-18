import java.util.Scanner;

public class Day08_LogicalChecks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        boolean isPrime = n > 1;
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) { isPrime = false; break; }
        }
        System.out.println(n + " is Prime? " + isPrime);

        int temp = n, rev = 0;
        while(temp > 0) {
            rev = (rev * 10) + (temp % 10);
            temp /= 10;
        }
        System.out.println("Is Palindrome? " + (n == rev));
        sc.close();
    }
}