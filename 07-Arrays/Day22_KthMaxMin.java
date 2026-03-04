import java.util.Scanner;
import java.util.Arrays;

public class Day22_KthMaxMin {

    public static void findKth(int data[], int k) {
        Arrays.sort(data);
        System.out.println("Kth Minimum: " + data[k - 1]);
        System.out.println("Kth Maximum: " + data[data.length - k]);
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

        System.out.print("Enter K: ");
        int k = sc.nextInt();

        findKth(data, k);
        sc.close();
    }
}