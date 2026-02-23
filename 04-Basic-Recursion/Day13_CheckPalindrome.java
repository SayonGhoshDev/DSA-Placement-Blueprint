import java.util.Scanner;

public class Day13_CheckPalindrome {
    public static boolean isPalindrome(String str, int idx) {
        if (idx >= str.length() / 2) {
            return true;
        }
        
        if (str.charAt(idx) != str.charAt(str.length() - 1 - idx)) {
            return false;
        }
        
        return isPalindrome(str, idx + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string to check Palindrome: ");
        String str = sc.next();
        
        boolean result = isPalindrome(str, 0);
        
        if(result) {
            System.out.println(str + " is a Palindrome.");
        } else {
            System.out.println(str + " is NOT a Palindrome.");
        }
        
        sc.close();
    }
}