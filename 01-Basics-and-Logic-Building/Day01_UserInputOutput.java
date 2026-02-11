import java.util.Scanner;

public class Day01_UserInputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--- PLEASE ENTER YOUR DETAILS ---");
        
        System.out.print("Enter your Name     : ");
        String studentName = sc.nextLine();

        System.out.print("Enter your Age      : ");
        int age = sc.nextInt();

        System.out.print("Enter your Semester : ");
        int semester = sc.nextInt();

        System.out.print("Enter Target LPA    : ");
        float salary = sc.nextFloat();

        System.out.println("\n\n---------------------------------------");
        System.out.println("           STUDENT ID CARD             ");
        System.out.println("---------------------------------------");
        System.out.println("* Name         : " + studentName);
        System.out.println("* Age          : " + age);
        System.out.println("* Semester     : " + semester);
        System.out.println("* Target LPA   : " + salary);
        System.out.println("---------------------------------------");

        sc.close();
    }
}