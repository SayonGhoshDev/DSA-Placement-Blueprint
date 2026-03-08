import java.util.Scanner;

public class Day26_KadanesAlgo {

    public static void findMaxSum(int data[]) {
        long maxSum = Long.MIN_VALUE;
        long currSum = 0;

        for (int i = 0; i < data.length; i++) {
            currSum += data[i];
            
            if (currSum > maxSum) {
                maxSum = currSum;
            }
            
            if (currSum < 0) {
                currSum = 0;
            }
        }
        System.out.println("Maximum contiguous sum: " + maxSum);
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

        findMaxSum(data);
        sc.close();
    }
}