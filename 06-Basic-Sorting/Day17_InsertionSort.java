import java.util.Scanner;

public class Day17_InsertionSort {
    
    public static void display(int data[]) {
        for(int i=0; i<data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
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

        for(int i=1; i<data.length; i++) {
            int key = data[i];
            int pointer = i - 1;
            while(pointer >= 0 && data[pointer] > key) {
                data[pointer+1] = data[pointer];
                pointer--;
            }
            data[pointer+1] = key;
        }

        System.out.print("Sorted Array: ");
        display(data);
        sc.close();
    }
}