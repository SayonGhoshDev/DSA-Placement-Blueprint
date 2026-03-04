import java.util.Scanner;

public class Day22_Sort012 {

    public static void sortColors(int data[]) {
        int low = 0;
        int mid = 0;
        int high = data.length - 1;

        while (mid <= high) {
            if (data[mid] == 0) {
                int temp = data[low];
                data[low] = data[mid];
                data[mid] = temp;
                low++;
                mid++;
            } else if (data[mid] == 1) {
                mid++;
            } else {
                int temp = data[mid];
                data[mid] = data[high];
                data[high] = temp;
                high--;
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

        System.out.print("Enter elements (0, 1, 2): ");
        for (int i = 0; i < n; i++) {
            data[i] = sc.nextInt();
        }

        sortColors(data);

        System.out.print("Sorted Array: ");
        display(data);
        sc.close();
    }
}