import java.util.Scanner;
import java.util.Arrays;

public class Day24_MinimizeHeights {

    public static void minimizeDiff(int data[], int k) {
        if (data.length <= 1) {
            System.out.println("Difference: 0");
            return;
        }

        Arrays.sort(data);
        int n = data.length;
        int ans = data[n - 1] - data[0];

        int tempMin, tempMax;

        for (int i = 1; i < n; i++) {
            if (data[i] - k < 0) {
                continue;
            }
            tempMin = Math.min(data[0] + k, data[i] - k);
            tempMax = Math.max(data[n - 1] - k, data[i - 1] + k);
            ans = Math.min(ans, tempMax - tempMin);
        }

        System.out.println("Minimum difference: " + ans);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int data[] = new int[n];

        System.out.print("Enter elements (heights): ");
        for (int i = 0; i < n; i++) {
            data[i] = sc.nextInt();
        }

        System.out.print("Enter the value of K: ");
        int k = sc.nextInt();

        minimizeDiff(data, k);
        sc.close();
    }
}