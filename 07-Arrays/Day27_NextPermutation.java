import java.util.Scanner;

public class Day27_NextPermutation {

    public static void nextPermutation(int data[]) {
        int n = data.length;
        int i = n - 2;

        while (i >= 0 && data[i] >= data[i + 1]) {
            i--;
        }

        if (i >= 0) {
            int j = n - 1;
            while (data[j] <= data[i]) {
                j--;
            }
            int temp = data[i];
            data[i] = data[j];
            data[j] = temp;
        }

        int left = i + 1;
        int right = n - 1;
        while (left < right) {
            int temp = data[left];
            data[left] = data[right];
            data[right] = temp;
            left++;
            right--;
        }
    }

    public static void display(int data[]) {
        for (int k = 0; k < data.length; k++) {
            System.out.print(data[k] + " ");
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

        nextPermutation(data);

        System.out.print("Next Permutation: ");
        display(data);
        sc.close();
    }
}