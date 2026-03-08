import java.util.Scanner;
import java.util.Arrays;

public class Day26_MergeSortedArrays {

    public static void merge(int arr1[], int arr2[]) {
        int n = arr1.length;
        int m = arr2.length;
        int left = n - 1;
        int right = 0;

        while (left >= 0 && right < m) {
            if (arr1[left] > arr2[right]) {
                int temp = arr1[left];
                arr1[left] = arr2[right];
                arr2[right] = temp;
                left--;
                right++;
            } else {
                break;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }

    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of first array: ");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        System.out.print("Enter sorted elements of first array: ");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int m = sc.nextInt();
        int arr2[] = new int[m];
        System.out.print("Enter sorted elements of second array: ");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        merge(arr1, arr2);

        System.out.print("Merged arrays: ");
        display(arr1);
        display(arr2);
        System.out.println();
        
        sc.close();
    }
}