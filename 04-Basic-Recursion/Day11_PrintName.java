import java.util.Scanner;

public class Day11_PrintName {
    public static void printMyName(int n, String name) {
        if (n == 0) return;
        System.out.println(name);
        printMyName(n - 1, name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printMyName(n, "Sayon");
        sc.close();
    }
}