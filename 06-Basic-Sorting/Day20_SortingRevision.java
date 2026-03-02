import java.util.*;

public class Day20_SortingRevision {

    public static void display(int data[], String algo) {
        System.out.print(algo + " Sorted Array: ");
        for(int i=0; i<data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public static void bubble(int data[]) {
        for(int i=0; i<data.length-1; i++) {
            for(int j=0; j<data.length-i-1; j++) {
                if(data[j] > data[j+1]) {
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
    }

    public static void recursiveBubble(int data[], int row, int col) {
        if (row == 0) return;
        if (col < row) {
            if (data[col] > data[col + 1]) {
                int temp = data[col];
                data[col] = data[col + 1];
                data[col + 1] = temp;
            }
            recursiveBubble(data, row, col + 1);
        } else {
            recursiveBubble(data, row - 1, 0);
        }
    }

    public static void selection(int data[]) {
        for(int i=0; i<data.length-1; i++) {
            int minIdx = i;
            for(int j=i+1; j<data.length; j++) {
                if(data[minIdx] > data[j]) {
                    minIdx = j;
                }
            }
            int temp = data[minIdx];
            data[minIdx] = data[i];
            data[i] = temp;
        }
    }

    public static void recursiveSelection(int data[], int row, int col, int maxIdx) {
        if (row == 0) return;
        if (col < row) {
            if (data[col] > data[maxIdx]) {
                recursiveSelection(data, row, col + 1, col);
            } else {
                recursiveSelection(data, row, col + 1, maxIdx);
            }
        } else {
            int temp = data[maxIdx];
            data[maxIdx] = data[row - 1];
            data[row - 1] = temp;
            recursiveSelection(data, row - 1, 0, 0);
        }
    }

    public static void insertion(int data[]) {
        for(int i=1; i<data.length; i++) {
            int key = data[i];
            int pointer = i - 1;
            while(pointer >= 0 && data[pointer] > key) {
                data[pointer+1] = data[pointer];
                pointer--;
            }
            data[pointer+1] = key;
        }
    }

    public static void recursiveInsertion(int data[], int n) {
        if (n <= 1) return;
        recursiveInsertion(data, n - 1);
        int key = data[n - 1];
        int pointer = n - 2;
        while (pointer >= 0 && data[pointer] > key) {
            data[pointer + 1] = data[pointer];
            pointer--;
        }
        data[pointer + 1] = key;
    }

    public static void conquer(int arr[], int si, int mid, int ei) {
        int merged[] = new int[ei - si + 1];
        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;

        while(idx1 <= mid && idx2 <= ei) {
            if(arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }
        
        while(idx1 <= mid) merged[x++] = arr[idx1++];
        while(idx2 <= ei) merged[x++] = arr[idx2++];
        
        for(int i=0, j=si; i<merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void divide(int arr[], int si, int ei) {
        if(si >= ei) return;
        int mid = si + (ei - si) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conquer(arr, si, mid, ei);
    }

    public static int partition(int arr[], int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {
            while (arr[i] <= pivot && i <= high - 1) i++;
            while (arr[j] > pivot && j >= low + 1) j--;
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }

    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pIndex = partition(arr, low, high);
            quickSort(arr, low, pIndex - 1);
            quickSort(arr, pIndex + 1, high);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int data[] = new int[n];

        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            data[i] = sc.nextInt();
        }
        System.out.println();

        int bData[] = Arrays.copyOf(data, n);
        bubble(bData);
        display(bData, "Bubble");

        int rbData[] = Arrays.copyOf(data, n);
        recursiveBubble(rbData, n - 1, 0);
        display(rbData, "Recursive Bubble");

        int sData[] = Arrays.copyOf(data, n);
        selection(sData);
        display(sData, "Selection");

        int rsData[] = Arrays.copyOf(data, n);
        recursiveSelection(rsData, n, 0, 0);
        display(rsData, "Recursive Selection");

        int iData[] = Arrays.copyOf(data, n);
        insertion(iData);
        display(iData, "Insertion");

        int riData[] = Arrays.copyOf(data, n);
        recursiveInsertion(riData, n);
        display(riData, "Recursive Insertion");

        int mData[] = Arrays.copyOf(data, n);
        divide(mData, 0, n - 1);
        display(mData, "Merge");

        int qData[] = Arrays.copyOf(data, n);
        quickSort(qData, 0, n - 1);
        display(qData, "Quick");

        sc.close();
    }
}