import java.util.Scanner;

public class Day24_RotateArray {

    public static void rotate(int data[]) {
        if (data.length <= 1) {
            return;
        }
        int last = data[data.length - 1];
        for (int i = data.length - 1; i > 0; i--) {
            data[i] = data[i - 1];
        }
        data[0] = last;
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

        rotate(data);

        System.out.print("Rotated Array: ");
        display(data);
        sc.close();
    }
}