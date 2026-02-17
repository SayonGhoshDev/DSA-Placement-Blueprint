import java.util.Scanner;

public class Day07_TimeComplexityDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Time Complexity Demo ---");
        
        int n = 5;

        System.out.println("1. O(1) Constant Time Operation:");
        System.out.println("Result: " + (n * 10));
        System.out.println();

        System.out.println("2. O(N) Linear Time Loop:");
        for (int i = 1; i <= n; i++) {
            System.out.println("Iteration: " + i);
        }
        System.out.println();

        System.out.println("3. O(N^2) Nested Loops:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("(" + i + "," + j + ") ");
            }
            System.out.println();
        }

        System.out.println("\n4. O(log N) Logarithmic Loop:");
        int temp = 100;
        int steps = 0;
        while (temp > 0) {
            System.out.println("Value: " + temp);
            temp = temp / 2;
            steps++;
        }
        System.out.println("Total Steps for 100: " + steps);

        sc.close();
    }
}