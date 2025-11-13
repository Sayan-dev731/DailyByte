// Problem: Decimal to Binary Conversion
// Date: 11-09-2025
// Author: Gopal Kovachi
// GitHub: gopal0410
// ERP ID: 6605901

// Approach:
// Taking the remainder and placing it in position in the string.
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
        if (number < 0) { //Uses the built-in function to return the binary for 0 or less
            return twosComplement(number);
        }
        if (number == 0) {
            return "0000";
        }
        StringBuilder binary = new StringBuilder();
        while (number != 0) { //Keeps the loop running till 0 is reached.
            //This here uses the bitwise OR operation to check the Least significant bit (the bit representing 1) and appends if the bit is 0 or 1.
            binary.append(number & 1);
            number = number >> 1; //Since, we already appended the last bit, we shift the bits to the right and continue the operation.
        }
        return binary.reverse().toString(); //The binary is in reverse form, so we use the reverse function for the original binary number.
    }

    //This function is used in case there is a negative number as the input.
    public String twosComplement(int number) {
        StringBuilder binary = new StringBuilder(decimalToBinary(number * -1)); //We need the number's positive binary form so we make a string builder with its +ve counterpart.
        StringBuilder result = new StringBuilder(); //This contains the complement of the original number.
        for (int i = binary.length() - 1; i >= 0; i--) { //This loop runs till all the positive binary elements are iterated through and values are appended to the complement.
            if (binary.charAt(i) == '0') { //If the bit is 0, we add 1
                result.append('1');
            } else { //If the bit is 1, we add 0.
                result.append('0');
            }
        }
        result.append('1'); //Apparently, the first bit in the binary number represents the sign of the number. 1 indicates -ve sign while 0 indicates +ve sign. And since this function is only called when the number is negative, I already appended a 1 at the beginning.
        result = result.reverse(); //This reverses the complement as we only added the elements at the end.
        int carry = 1; //Since, we are supposed to add 1 to the complement of the number, I already initialized the carry as 1. This acted as the 1 that we were supposed to add.
        for (int i = result.length() - 1; i >= 0; i--) {
            if (result.charAt(i) == '1' && carry == 1) { //Checks if the bit is 1 and carry is also 1
                result.setCharAt(i, '0'); //Sets the element at i to be 0. The carry remains the same.
                carry = 1;
            } else if (result.charAt(i) == '0' && carry == 1) {//Checks if the bit is 0 but the carry is 1.
                result.setCharAt(i, '1');//Sets the element at i to be 1.
                carry = 0;//The value of carry is changed as its value is processed.
            }
        }
        return result.toString();

    }

    public static void main(String[] args) {
        gopal0410_6605901 reference = new gopal0410_6605901();
        int number = reference.getUserInput();
        System.out.println(reference.decimalToBinary(number));
    }
}
