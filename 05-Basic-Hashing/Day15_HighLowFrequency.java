import java.util.*;

public class Day15_HighLowFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        
        int maxFreq = 0;
        int minFreq = n + 1; 
        int maxElement = 0;
        int minElement = 0;
        
        for (int key : map.keySet()) {
            int count = map.get(key);
            
            if (count > maxFreq) {
                maxFreq = count;
                maxElement = key;
            }
            if (count < minFreq) {
                minFreq = count;
                minElement = key;
            }
        }
        
        System.out.println("Highest Frequency Element: " + maxElement + " (appears " + maxFreq + " times)");
        System.out.println("Lowest Frequency Element: " + minElement + " (appears " + minFreq + " times)");
        
        sc.close();
    }
}