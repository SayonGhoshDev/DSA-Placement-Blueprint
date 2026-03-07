import java.util.Scanner;

public class Day25_MinJumps {

    public static void minJumps(int data[]) {
        if (data.length <= 1) {
            System.out.println("Minimum jumps: 0");
            return;
        }
        if (data[0] == 0) {
            System.out.println("Minimum jumps: -1");
            return;
        }

        int maxReach = data[0];
        int step = data[0];
        int jump = 1;

        for (int i = 1; i < data.length; i++) {
            if (i == data.length - 1) {
                System.out.println("Minimum jumps: " + jump);
                return;
            }

            maxReach = Math.max(maxReach, i + data[i]);
            step--;

            if (step == 0) {
                jump++;
                if (i >= maxReach) {
                    System.out.println("Minimum jumps: -1");
                    return;
                }
                step = maxReach - i;
            }
        }
        System.out.println("Minimum jumps: -1");
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

        minJumps(data);
        sc.close();
    }
}