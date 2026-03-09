import java.util.Scanner;

public class Day27_CountInversion {

    public static int mergeAndCount(int data[], int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int leftArr[] = new int[n1];
        int rightArr[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArr[i] = data[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArr[j] = data[mid + 1 + j];
        }

        int i = 0, j = 0, k = left, swaps = 0;

        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                data[k++] = leftArr[i++];
            } else {
                data[k++] = rightArr[j++];
                swaps += (n1 - i);
            }
        }

        while (i < n1) {
            data[k++] = leftArr[i++];
        }

        while (j < n2) {
            data[k++] = rightArr[j++];
        }

        return swaps;
    }

    public static int mergeSortAndCount(int data[], int left, int right) {
        int count = 0;
        if (left < right) {
            int mid = (left + right) / 2;

            count += mergeSortAndCount(data, left, mid);
            count += mergeSortAndCount(data, mid + 1, right);
            count += mergeAndCount(data, left, mid, right);
        }
        return count;
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

        int inversions = mergeSortAndCount(data, 0, data.length - 1);
        System.out.println("Total Inversions: " + inversions);
        
        sc.close();
    }
}