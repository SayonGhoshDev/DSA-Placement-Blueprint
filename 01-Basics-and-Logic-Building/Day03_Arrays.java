import java.util.Scanner;

public class Day03_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        
        System.out.println("Enter " + size + " elements: ");
        int numbers[] = new int[size];
        
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        
        System.out.print("Enter the target element to search: ");
        int x = sc.nextInt();

        boolean isFound = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                System.out.println("\nOutput: Target element " + x + " found at index " + i);
                isFound = true; 
                break; 
            }
        }

        if (isFound == false) {
            System.out.println("\nOutput: Target element " + x + " not found in the array!");
        }
        
        sc.close();
    }
}