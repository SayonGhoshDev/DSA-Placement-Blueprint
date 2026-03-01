import java.util.Scanner;

public class Day19_RecursiveInsertionSort {
    
    public static void display(int data[]) {
        for(int i=0; i<data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public static void insertion(int data[], int n) {
        if (n <= 1) {
            return;
        }

        insertion(data, n - 1);

        int key = data[n - 1];
        int pointer = n - 2;

        while (pointer >= 0 && data[pointer] > key) {
            data[pointer + 1] = data[pointer];
            pointer--;
        }
        data[pointer + 1] = key;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int data[] = new int[n];

        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            data[i] = sc.nextInt();
        }

        insertion(data, n);

        System.out.print("Sorted Array: ");
        display(data);
        sc.close();
    }
}