import java.util.Scanner;

public class Day18_RecursiveSelectionSort {
    
    public static void selection(int[] arr, int row, int col, int maxIdx) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            if (arr[col] > arr[maxIdx]) {
                selection(arr, row, col + 1, col);
            } else {
                selection(arr, row, col + 1, maxIdx);
            }
        } else {
            int temp = arr[maxIdx];
            arr[maxIdx] = arr[row - 1];
            arr[row - 1] = temp;
            selection(arr, row - 1, 0, 0);
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

        selection(data, n, 0, 0);

        System.out.print("Sorted: ");
        for (int val : data) {
            System.out.print(val + " ");
        }
        System.out.println();
        sc.close();
    }
}