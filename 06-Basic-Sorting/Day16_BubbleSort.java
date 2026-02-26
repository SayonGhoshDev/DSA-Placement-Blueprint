import java.util.Scanner;

public class Day16_BubbleSort {
    
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
            for(int j = 0; j < size - i - 1; j++) {
                if(data[j] > data[j+1]) {

                    int tempVal = data[j];
                    data[j] = data[j+1];
                    data[j+1] = tempVal;
                }
            }
        }

        System.out.print("Sorted Array (Bubble Sort): ");
        display(data);
        sc.close();
    }
}