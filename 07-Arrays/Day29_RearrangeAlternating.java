import java.util.Scanner;

public class Day29_RearrangeAlternating {

    public static void rightRotate(int arr[], int outOfPlace, int cur) {
        int temp = arr[cur];
        for (int i = cur; i > outOfPlace; i--) {
            arr[i] = arr[i - 1];
        }
        arr[outOfPlace] = temp;
    }

    public static void rearrange(int arr[]) {
        int n = arr.length;
        int outOfPlace = -1;

        for (int i = 0; i < n; i++) {
            if (outOfPlace >= 0) {
                if ((arr[i] >= 0 && arr[outOfPlace] < 0) || (arr[i] < 0 && arr[outOfPlace] >= 0)) {
                    rightRotate(arr, outOfPlace, i);
                    
                    if (i - outOfPlace >= 2) {
                        outOfPlace = outOfPlace + 2;
                    } else {
                        outOfPlace = -1;
                    }
                }
            }

            if (outOfPlace == -1) {
                if ((arr[i] >= 0 && i % 2 == 0) || (arr[i] < 0 && i % 2 == 1)) {
                    outOfPlace = i;
                }
            }
        }
    }

    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter elements (mix of positive and negative): ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        rearrange(arr);

        System.out.print("Rearranged array: ");
        display(arr);
        
        sc.close();
    }
}