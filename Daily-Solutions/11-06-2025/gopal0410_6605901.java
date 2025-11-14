
// Problem: Armstrong Number
// Date: 11-06-2025
// Author: Gopal Kovachi
// GitHub: gopal0410
// ERP ID: 6605902
// Approach-1:
// For approach 1, I simply divided the number and took its remainder.
// Then, I used the Math.pow function to raise its power to the number of digits in the original number.
// Then, I kept adding the number raised to some power to the sum variable.
// I also made sure that the original number is safe for comparison that is done later.
// Time Complexity: O(n)
// Space Complexity: O(1)
// Approach-2:
// For approach 2, I converted the number to string and then iterated the string.
// Then, I used the ASCII code of the integer and subtracted it by 48 to give the original number and raised that number to the required power.abstract 
// Time Complexity: O(n)
// Space Complexity: O(n)
// Approach-3:
// For approach 3, I tried spicing things up a bit by using recursion.
// I basically did the same thing that I did in approach 1 but used a recursion in this case.
// I had to create an object variable for this, and also create a constructor for initializing the object variable.
// Time Complexity: O(n)
// Space Complexity: O(n)
//
import java.util.*;

public class gopal0410_6605901 {

    private int sum; //Declaring an object variable. This was initialized for proper functioning of the checking function that used recursion.

    public gopal0410_6605901() {
        this.sum = 0; //Setting the value of sum to 0. The digits raised to some power will be added here.
    }

    //This function takes in user input
    public int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int userInput = scanner.nextInt();
        if (userInput < 0) { //This checks if a number is less than 0. I made it such that when the functions using basic arithmetic is used, it does not ignore the negative value and will not return true for negative integers.
            userInput = 10;
        }
        return userInput;
    }

    //This functions checks the equality between the original number and the number we get after adding its digits raised to some power
    public boolean checkingEquality(int num1, int num2) {
        if (num1 == num2) {
            return true;
        } else {
            return false;
        }
    }

    //This function returns the length of the number which is used as power when adding.
    public int getLengthOfNumber(int number) {
        int length = 0;
        while (number != 0) { //Checks if the number is 0. After n iterations, where n is the number of digits, the loop will end.
            number = number / 10; //Changes the number by removing its last digit
            length++;
        }
        return length;
    }

    //This function checks if a number is armstrong or not using basic arithmetic.
    public boolean armstrongNumberUsingDivision(int number) {
        int sumOfDigits = 0; //Variable where the new integer which is the sum of the digits will be stored.
        int temporaryVariable = number; //We need the original value later for comparison, so I initialized a new variable in which the operations are performed.
        int power = getLengthOfNumber(number);
        while (temporaryVariable != 0) {
            int remainder = temporaryVariable % 10; //Takes in the last digit of the number
            sumOfDigits += Math.pow(remainder, power); //The remainder is raised to its required power and then added.
            temporaryVariable = temporaryVariable / 10; //Removes the last digit of the number.
        }
        return checkingEquality(number, sumOfDigits);
    }

    //This function converts the original number to a string and then checks if the number is armstrong.
    public boolean armstrongNumberUsingString(int number) {
        int sumOfDigits = 0;
        int power = getLengthOfNumber(number);
        String numberInString = Integer.toString(number); //Converts the integer to string
        for (int i = 0; i < numberInString.length(); i++) {
            //Adds the number raised to the required power. Subtracts 48 from the original character number.
            //ASCII Code of 0, 1, 2, 3, ... 9 are 48, 49, ... 57
            //Subtracting the digit's ASCII code with 48 gives the original number.
            sumOfDigits += Math.pow(numberInString.charAt(i) - 48, power);
        }
        return checkingEquality(number, sumOfDigits);
    }

    //This function implements recursion for getting the sum of digits which is checked for armstrong in another function.
    public int sumOfDigitsUsingRecursion(int number, int power) {
        if (number == 0) { //Checks if the number is 0 and also acts as a recursion breaker.
            return this.sum;//Returns sum. This sum is the object variable initialized at the beginning.
        }
        this.sum += Math.pow(number % 10, power);
        return sumOfDigitsUsingRecursion(number / 10, power); //Calls itself with one digit less and the power required.
    }

    //This function compares the original number with the sum we get after using recursion.
    public boolean armstrongNumberCheckRecursion(int number) {
        this.sum = 0; //Resetting the sum to 0. This makes sure that if the same object is used twice, the previous answer of the sum does not cause conflict with the new one.
        int sumOfDigits = sumOfDigitsUsingRecursion(number, getLengthOfNumber(number)); //Getting the sum of digits of the number using recursion.
        return checkingEquality(sumOfDigits, number);
    }

    public static void main(String[] args) {
        gopal0410_6605901 reference = new gopal0410_6605901();
        int userInteger = reference.getUserInput();
        System.out.println(reference.armstrongNumberCheckRecursion(userInteger));
        System.out.println(reference.armstrongNumberUsingDivision(userInteger));
        System.out.println(reference.armstrongNumberUsingString(userInteger));
    }
}
