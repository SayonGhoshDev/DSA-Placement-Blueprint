import java.util.Scanner;

public class Day23_UnionIntersection {

    public static void findUnion(int arr1[], int arr2[]) {
        int i = 0, j = 0;
        System.out.print("Union: ");
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
            } else if (arr2[j] < arr1[i]) {
                System.out.print(arr2[j] + " ");
                j++;
            } else {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
        }
        
        while (i < arr1.length) {
            System.out.print(arr1[i] + " ");
            i++;
        }
        while (j < arr2.length) {
            System.out.print(arr2[j] + " ");
            j++;
        }
        System.out.println();
    }

    public static void findIntersection(int arr1[], int arr2[]) {
        int i = 0, j = 0;
        System.out.print("Intersection: ");
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr1[i]) {
                j++;
            } else {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
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

        findUnion(arr1, arr2);
        findIntersection(arr1, arr2);
        
        sc.close();
    }
}