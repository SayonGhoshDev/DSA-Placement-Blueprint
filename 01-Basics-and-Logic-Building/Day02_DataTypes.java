import java.util.Scanner;

public class Day02_DataTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---------------------------------------------------");
        System.out.println("JAVA PRIMITIVE DATA TYPE LAB REPORT");
        System.out.println("---------------------------------------------------");

        System.out.println("\n1. Suffix Specifics:");
        float floatValue = 3.14159f;
        System.out.println("Float Value         : " + floatValue);
        
        double doubleValue = 3.141592653589793;
        System.out.println("Double Value        : " + doubleValue);

        System.out.println("\n2. Byte Overflow Experiment:");
        byte maxByte = 127;
        System.out.println("Initial Byte        : " + maxByte);
        
        byte overflowedByte = (byte) (maxByte + 1);
        System.out.println("After +1            : " + overflowedByte + " (Cycle Complete!)");

        System.out.println("\n3. Explicit Casting (Data Loss):");
        double originalDouble = 99.99;
        System.out.println("Original Double     : " + originalDouble);
        
        int convertedInt = (int) originalDouble;
        System.out.println("Converted Int       : " + convertedInt);

        System.out.println("\n4. Character Arithmetic:");
        char initialChar = 'A';
        System.out.println("Original Char       : " + initialChar);
        
        char nextChar = (char) (initialChar + 1);
        System.out.println("After Adding 1      : " + nextChar);

        System.out.println("\n---------------------------------------------------");
        sc.close();
    }
}