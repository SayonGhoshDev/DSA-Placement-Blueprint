import java.util.Scanner;

public class Day04_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String originalString = sc.nextLine();
        int totalLength = originalString.length();
        System.out.println("Total Length: " + totalLength);

        String reversedString = "";

        for (int i = totalLength - 1; i >= 0; i--) {
            reversedString = reversedString + originalString.charAt(i);
        }

        if (originalString.equalsIgnoreCase(reversedString)) {
            System.out.println("Is Palindrome: YES");
        } else {
            System.out.println("Is Palindrome: NO");
        }

        sc.close();
    }
}