// Problem: Nth-Fibonacci Term
// Date: 11-08-2025
// Author: Gopal Kovachi
// GitHub: gopal0410
// ERP ID: 6605901

// Approach-1:
// In Approach-1, I just initialized two variables first, and second and set their values as 0 and 1 respectively.
// Then I used for loop and added the elements of first and second and swapped as needed
// Time Complexity: O(n)
// Space Complexity: O(1)
// Approach-2:
// For the second approach, I used recursion and did the same thing as approach 1.
// Two functions were made for this approach. One that calculated the sum recursively till the final nth term is reached and one that calls the recursive function.
// Time Complexity: O(n)
// Space Complexity: O(n)
// Approach:
// I used a mathematical equation known as Binet's Equation to directly find the nth fibonacci term.
// Time Complexity: O(1)
// Space Complexity: O(1)
import java.util.*;

public class gopal0410_6605901 {

    //Gets the user input
    public int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        try { //This is in case the user enters anything that is not a number.
            int n = scanner.nextInt();
            if (n < 0) { //Case for handling negative inputs.
                System.out.println("Negative integers are invalid inputs. ");
                return -1;
            }
            return n;
        } catch (Exception e) { //System output for when the user inputs anything not a string.
            System.out.println(e + " - Please enter an integer between 0 and 30");
        }
        return -1;
    }

    //The function uses a for loop for finding the nth fibonacci term
    public int fibonacciUsingForLoop(int n) {
        if (n < 0) { //Checks if the user input is negative.
            return -1;
        }
        if (n == 0) { //Checks if the user input is 0.
            return 0;
        }
        if(n == 1){
            return 1;
        }
        int first = 0, second = 1;
        int sum = 0;
        //Here the for loop runs from 2 as we already know the 0th and 1st term of the fibonacci series which are stored in variables: first, and second.
        for (int i = 2; i <= n; i++) {
            sum = first + second; //Gets the next term of the fibonacci series
            first = second; //Moves the position forward such that the last two elements are added for the next term.
            second = sum; //Sets the new term as a part of the series which will be used for finding the next term.
        }
        return sum;
    }

    //This function uses recursion to find the nth term of the fibonacci series.
    public int fibonacciUsingRecursion(int first, int second, int n) {
        if (n == -1) { //Checks if the user input is negative.
            return -1;
        }
        if (n == 0) { //Checks if n = 0. This indicates that total n iterations has passed and now we have the nth term.
            return first; //This returns the nth element of the series.
        }
        //This part is same as in the function that used the for loop for finding the term.
        int sum = first + second;
        first = second;
        second = sum;
        return fibonacciUsingRecursion(first, second, n - 1); //Calling itself again till the nth term is found and returned
    }

    //This function calls the main recursive function with the first and second elements as 0, and 1 respectively.
    public int fibonacciUsingRecursionCall(int n) {
        int first = 0, second = 1;
        return fibonacciUsingRecursion(first, second, n);
    }

    //This function uses the Binet's formula.
    //This formual basically gives the nth fibonacci term directly using just a formula.
    public int fibonacciUsingArithmetic(int n) {
        if (n < 0) { //Checks if the user input is invalid.
            return -1;
        }
        //  (1 - √5)^n - (1 - √5)^n
        //  ------------------------
        //          2^n * √5
        return (int) Math.floor((Math.pow(1 + Math.sqrt(5), n) - Math.pow(1 - Math.sqrt(5), n)) / (Math.pow(2, n) * Math.sqrt(5)));
    }

    public static void main(String[] args) {
        gopal0410_6605901 reference = new gopal0410_6605901();
        int n = reference.getUserInput();
        System.out.println(reference.fibonacciUsingForLoop(n));
        System.out.println(reference.fibonacciUsingRecursionCall(n));
        System.out.println(reference.fibonacciUsingArithmetic(n));
    }
}
