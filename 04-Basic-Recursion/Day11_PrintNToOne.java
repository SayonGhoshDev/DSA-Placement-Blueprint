import java.util.Scanner;

public class Day11_PrintNToOne {
    public static void printDescending(int n) {
        if (n == 0) return;
        System.out.println(n);
        printDescending(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDescending(n);
        sc.close();
    }
}