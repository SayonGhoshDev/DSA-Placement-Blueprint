import java.util.Scanner;
import java.util.HashSet;

public class Day29_SubarrayZeroSum {

    public static boolean hasZeroSum(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (arr[i] == 0 || sum == 0 || set.contains(sum)) {
                return true;
            }
            set.add(sum);
        }
        return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (hasZeroSum(arr)) {
            System.out.println("Subarray with 0 sum exists.");
        } else {
            System.out.println("No subarray with 0 sum exists.");
        }
        
        sc.close();
    }
}