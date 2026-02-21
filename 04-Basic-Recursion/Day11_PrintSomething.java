import java.util.Scanner;

public class Day11_PrintSomething {
    public static void print(int n) {
        if (n == 0) return;
        System.out.println("Sayon is a Good Boy!");
        print(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
        sc.close();
    }
}