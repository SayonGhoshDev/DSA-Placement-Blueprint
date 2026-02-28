import java.util.Scanner;

public class Day18_RecursiveBubbleSort {
    
    public static void bubble(int[] arr, int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            if (arr[col] > arr[col + 1]) {
                int temp = arr[col];
                arr[col] = arr[col + 1];
                arr[col + 1] = temp;
            }
            bubble(arr, row, col + 1);
        } else {
            bubble(arr, row - 1, 0);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] data = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            data[i] = sc.nextInt();
        }

        bubble(data, n - 1, 0);

        System.out.print("Sorted: ");
        for (int val : data) {
            System.out.print(val + " ");
        }
        System.out.println();
        sc.close();
    }
}