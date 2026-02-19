import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Day09_ListAndStack {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(1, 15);
        System.out.println("ArrayList: " + list);

        Stack<String> stack = new Stack<>();
        stack.push("Lion");
        stack.push("Dog");
        System.out.println("Stack: " + stack);
        System.out.println("Top Element: " + stack.peek());
    }
}