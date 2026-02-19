import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Day09_SetOperations {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(32);
        hashSet.add(21);
        hashSet.add(32);
        System.out.println("HashSet: " + hashSet);

        Set<Integer> treeSet = new TreeSet<>(hashSet);
        System.out.println("TreeSet (Sorted): " + treeSet);
    }
}