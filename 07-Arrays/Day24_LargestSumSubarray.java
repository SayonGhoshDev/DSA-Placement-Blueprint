import java.util.Scanner;

public class Day24_LargestSumSubarray {

    public static void maxSubarraySum(int data[]) {
        int maxSoFar = data[0];
        int currentMax = data[0];

        for (int i = 1; i < data.length; i++) {
            currentMax = Math.max(data[i], currentMax + data[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }
        System.out.println("Largest sum contiguous subarray: " + maxSoFar);
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

        maxSubarraySum(data);
        sc.close();
    }
}