import java.util.Scanner;
import java.util.ArrayList;

public class Day28_CommonInThreeArrays {

    public static void findCommon(int arr1[], int arr2[], int arr3[]) {
        int i = 0, j = 0, k = 0;
        ArrayList<Integer> result = new ArrayList<>();

        while (i < arr1.length && j < arr2.length && k < arr3.length) {
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                if (result.size() == 0 || result.get(result.size() - 1) != arr1[i]) {
                    result.add(arr1[i]);
                }
                i++;
                j++;
                k++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr3[k]) {
                j++;
            } else {
                k++;
            }
        }

        System.out.print("Common elements: ");
        if (result.size() == 0) {
            System.out.print("None");
        } else {
            for (int val : result) {
                System.out.print(val + " ");
            }
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        System.out.print("Enter sorted elements of first array: ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];
        System.out.print("Enter sorted elements of second array: ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.print("Enter size of third array: ");
        int n3 = sc.nextInt();
        int arr3[] = new int[n3];
        System.out.print("Enter sorted elements of third array: ");
        for (int i = 0; i < n3; i++) {
            arr3[i] = sc.nextInt();
        }

        findCommon(arr1, arr2, arr3);
        sc.close();
    }
}