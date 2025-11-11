// Problem: Decimal to Binary Conversion
// Date: 11-09-2025
// Author: Gopal Kovachi
// GitHub: gopal0410
// ERP ID: 6605901

// Approach:
// Taking the last bit of the number by using & operation and placing it in position in the string.
// Time Complexity: O(log n)
// Space Complexity: O(log n)
import java.util.*;

public class gopal0410_6605901 {

    //Takes in user input
    public int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int number = scanner.nextInt();
        return number;
    }

    public String decimalToBinary(int number) {
        if (number <= 0) { //Uses the built-in function to return the binary for 0 or less
            return Integer.toBinaryString(number);
        }
        StringBuilder binary = new StringBuilder();
        while (number != 0) { //Keeps the loop running till 0 is reached.
            //This here uses the bitwise OR operation to check the Least significant bit (the bit representing 1) and appends if the bit is 0 or 1.
            binary.append(number & 1);
            number = number >> 1; //Since, we already appended the last bit, we shift the bits to the right and continue the operation.
        }
        return binary.reverse().toString(); //The binary is in reverse form, so we use the reverse function for the original binary number.
    }

    public static void main(String[] args) {
        gopal0410_6605901 reference = new gopal0410_6605901();
        int number = reference.getUserInput();
        System.out.println(reference.decimalToBinary(number));
    }
}
