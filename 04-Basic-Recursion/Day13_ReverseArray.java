import java.util.Scanner;

public class Day13_ReverseArray {
    public static void reverseArray(int[] arr, int idx, int n) {
        if (idx >= n / 2) {
            return;
        }
        
        int temp = arr[idx];
        arr[idx] = arr[n - 1 - idx];
        arr[n - 1 - idx] = temp;
        
        reverseArray(arr, idx + 1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        reverseArray(arr, 0, n);
        
        System.out.print("Reversed Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        sc.close();
    }
}