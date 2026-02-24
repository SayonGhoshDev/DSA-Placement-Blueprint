import java.util.*;

public class Day14_MajorityElement {
    public static void majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        boolean found = false;
        for (int key : map.keySet()) {
            if (map.get(key) > n / 3) {
                System.out.println(key);
                found = true;
            }
        }
        
        if (!found) {
            System.out.println("No majority element found.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        
        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
        System.out.println("Majority Elements (appears more than " + (n / 3) + " times): ");
        majorityElement(nums);
        
        sc.close();
    }
}