import java.util.Scanner;

public class KUMARISONALIUPADHYAY_6606175 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scan.nextLine();

        // Convert to lowercase and remove spaces
        str = str.toLowerCase().replaceAll("[^a-z0-9]", "");

        // Reverse the str
        String rev = new StringBuilder(str).reverse().toString();

        // Checking if original and reversed are same
        if (str.equals(rev)) {
            System.out.println("True It's a palindrome!");
        } else {
            System.out.println("False Not a palindrome.");
        }

        scan.close();
    }
} 