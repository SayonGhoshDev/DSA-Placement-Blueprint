import java.util.Scanner;

public class Day21_ReverseArray {

    public static void reverse(int data[]) {
        int start = 0;
        int end = data.length - 1;
        while (start < end) {
            int temp = data[start];
            data[start] = data[end];
            data[end] = temp;
            start++;
            end--;
        }
    }

    public static void display(int data[]) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
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

        reverse(data);

        System.out.print("Reversed Array: ");
        display(data);
        sc.close();
    }
}