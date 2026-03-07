import java.util.Scanner;

public class Day25_FindDuplicate {

    public static void findDuplicate(int data[]) {
        int slow = data[0];
        int fast = data[0];

        do {
            slow = data[slow];
            fast = data[data[fast]];
        } while (slow != fast);

        fast = data[0];
        while (slow != fast) {
            slow = data[slow];
            fast = data[fast];
        }

        System.out.println("Duplicate element is: " + slow);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size (N+1): ");
        int n = sc.nextInt();
        int data[] = new int[n];

        System.out.print("Enter elements (values from 1 to N): ");
        for (int i = 0; i < n; i++) {
            data[i] = sc.nextInt();
        }

        findDuplicate(data);
        sc.close();
    }
}