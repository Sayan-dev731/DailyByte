// Problem: Word Counter
// Date: 11-05-2025
// Author: Gopal Kovachi
// GitHub: gopal0410
// ERP ID: 6605901

// Approach-1: Using built-in function and creating an array of words which were separated by spaces and returning its length
// Approach-2: Counting spaces in the sentences and using if statement for sentences which have multiple spaces between words
// For using split function
// Time Complexity: O(n)
// Space Complexity: O(n)

// For using space count
// Time Complexity: O(n)
// Space Complexity: O(1)

import java.util.Scanner;

public class gopal0410_6605901 {

    public int wordCount_usingSplit(String sentence) {
        if (sentence.length() == 0) { //Checks if the sentence is empty
            return 0;
        }
        String[] words = sentence.split(" "); //Splits the sentence by spaces and stores in words array
        return words.length; //Size of words
    }

    public int wordCount_usingSpace(String sentence) {
        if (sentence.length() == 0) { //Checks if the sentence is empty
            return 0;
        }
        int count = 1; //Counts spaces

        //In case the first character is a space, we need to make sure that it does not count the 1st word as the 2nd word
        if (sentence.charAt(0) == ' ') {
            count--;
        }
        for (int i = 1; i < sentence.length() - 1; i++) {
            if (sentence.charAt(i) == ' ') {
                if (sentence.charAt(i + 1) == ' ') { //This checks if the next character is also a space. This ensures that the result for sentences with multiple spaces leads to a correct result.
                    continue;
                }
                count++; //Increment count when a character that is not space is found
            }
        }
        return count;
    }

    public static void main(String[] args) {
        gopal0410_6605901 reference = new gopal0410_6605901();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your sentence : ");
        String sentence = scan.nextLine();
        System.out.println(reference.wordCount_usingSpace(sentence));
    }
}
