import java.util.Scanner;

public class Day23_MoveNegatives {

    public static void move(int data[]) {
        int j = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] < 0) {
                int temp = data[i];
                data[i] = data[j];
                data[j] = temp;
                j++;
            }
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

        move(data);

        System.out.print("Modified Array: ");
        display(data);
        sc.close();
    }
}