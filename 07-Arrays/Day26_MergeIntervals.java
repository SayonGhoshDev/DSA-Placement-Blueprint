import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Day26_MergeIntervals {

    public static void merge(int intervals[][]) {
        if (intervals.length <= 1) {
            return;
        }

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<int[]> result = new ArrayList<>();
        
        int[] currentInterval = intervals[0];
        result.add(currentInterval);

        for (int[] interval : intervals) {
            int currentEnd = currentInterval[1];
            int nextBegin = interval[0];
            int nextEnd = interval[1];

            if (currentEnd >= nextBegin) {
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            } else {
                currentInterval = interval;
                result.add(currentInterval);
            }
        }

        System.out.print("Merged Intervals: ");
        for (int[] res : result) {
            System.out.print("[" + res[0] + ", " + res[1] + "] ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of intervals: ");
        int n = sc.nextInt();
        int intervals[][] = new int[n][2];

        System.out.println("Enter start and end of each interval:");
        for (int i = 0; i < n; i++) {
            intervals[i][0] = sc.nextInt();
            intervals[i][1] = sc.nextInt();
        }

        merge(intervals);
        sc.close();
    }
}