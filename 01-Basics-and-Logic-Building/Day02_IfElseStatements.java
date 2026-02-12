import java.util.Scanner;

public class Day02_IfElseStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        if (marks >= 95 && marks <= 100) {
            System.out.println("Grade A - Excellent");
            System.out.println("Wow! You are a Topper!");
        } else if (marks >= 90 && marks < 95) {
            System.out.println("Grade A - Excellent");
        } else if (marks >= 80 && marks <= 89) {
            System.out.println("Grade B - Very Good");
        } else if (marks >= 70 && marks <= 79) {
            System.out.println("Grade C - Good");
        } else if (marks >= 60 && marks <= 69) {
            System.out.println("Grade D - Can do better");
        } else if (marks >= 40 && marks <= 59) {
            System.out.println("Grade E - Just Passed");
        } else if (marks >= 0 && marks < 40) {
            System.out.println("Fail - Needs Hard Work");
        } else {
            System.out.println("Invalid Input! Marks should be between 0 and 100.");
        }

        sc.close();
    }
}