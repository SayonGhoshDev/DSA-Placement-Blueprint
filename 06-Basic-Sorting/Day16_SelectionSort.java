import java.util.Scanner;

public class Day16_SelectionSort {
    
    public static void display(int[] data) {
        for(int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] data = new int[size];

        System.out.print("Enter the elements: ");
        for (int i = 0; i < size; i++) {
            data[i] = sc.nextInt();
        }

        for(int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for(int j = i + 1; j < size; j++) {
                if(data[j] < data[minIndex]) {
                    minIndex = j;
                }
            }
            
            int tempVal = data[minIndex];
            data[minIndex] = data[i];
            data[i] = tempVal;
        }

        System.out.print("Sorted Array (Selection Sort): ");
        display(data);
        sc.close();
    }
}