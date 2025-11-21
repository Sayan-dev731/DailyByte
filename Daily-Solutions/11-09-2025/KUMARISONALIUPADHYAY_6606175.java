import java.util.Scanner;

public class KUMARISONALIUPADHYAY_6606175 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = scan.nextInt();

        if (n < 0) {
            System.out.println("Invalid input! Please enter positive number.");
        } else if (n == 0) {
            System.out.println("Binary Representation = 0");
        } else {
            System.out.println("Binary Representation = " + toBinary(n));
        }

        scan.close();
    }

    // Recursive method without helper method
    public static String toBinary(int n) {
        if (n == 0) {          // Base case
            return "";
        }
        return toBinary(n / 2) + (n % 2);   // Recursive call + remainder
    }
}
