import java.util.Scanner;

public class Day11_PrintOneToN {
    public static void printAscending(int n) {
        if (n == 0) return;
        printAscending(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printAscending(n);
        sc.close();
    }
}