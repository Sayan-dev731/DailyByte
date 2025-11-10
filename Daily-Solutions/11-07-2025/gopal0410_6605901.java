// Problem: Palindrome String
// Date: 11-07-2025
// Author: Gopal Kovachi
// GitHub: gopal0410
// ERP ID: 6605901

// Approach-1:
// For approach-1, I used two pointers. One pointer pointed to the starting index while the other to the ending index.
// Then I used a while loop which stopped only when the two pointers crossed each other.
// I also added conditions for ignoring the non-alphabetical characters.
// Time Complexity: O(n)
// Space Complexity: O(1)
// Approach-2:
// For approach-2, I pushed the alphabets in a stack and then popped each character individually while also comparing with the original string's characters.
// I added some conditions for ignoring the non-alphabetic characters.
// Time Complexity: O(n)
// Space Complexity: O(n)
import java.util.*;

public class gopal0410_6605901 {

    //Takes the string which the user will input and returns it.
    public String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your string : ");
        String userString = scanner.nextLine();
        return userString;
    }

    //Here, two pointers are initialized and iterated towards the middle of the string while checking with each other if they are different.
    //If they are different then the function will return false.
    //Some conditions were used to ignore the non-alphabetical characters.
    public boolean palindromeStringUsingTwoPointers(String userString) {
        int startPointer = 0;
        int endPointer = userString.length() - 1;
        while (startPointer <= endPointer) { //Makes sure that the loop stop after all the front and back characters are compared.
            if (!(Character.isAlphabetic(userString.charAt(startPointer)))) { // This if statement only runs if the character is a non-alphabetical character.
                startPointer++; //This will increase the pointer by 1 thus ignoring the non-alphabetical character.
                continue; //We don't know if the endPointer also points to a character, so we can't compare them unless we know that both of them are alphabets. Thus we ignore the remaining loop.
            } else if (!(Character.isAlphabetic(userString.charAt(endPointer)))) { //Same as before but the character at the endPointer is checked.
                endPointer--; //Decrements the pointer by 1 in case of a non-alphabetical character.
                continue; //Same as explained in startPointer.
            }
            if (Character.toLowerCase(userString.charAt(startPointer)) != Character.toLowerCase(userString.charAt(endPointer))) { //This checks if both the characters are unequal.
                return false; //Returns false in case both are different.
            }
            startPointer++; //Increase the startPointer by 1 to continue the iteration.
            endPointer--; //Decreases the endPointer by 1 to continue the iteration.
        }
        return true; //This runs only after all the characters are checked making sure that the character is a palindrome.
    }

    //This function uses a stack and checks by popping the top element and comparing it with the userString's character
    public boolean palindromeStringUsingStack(String userString) {
        Stack<Character> characterStack = new Stack<Character>(); //Stack initialization.
        for (int i = 0; i < userString.length(); i++) { //This loop is used to store the alphabets of the string in a stack.
            if (Character.isAlphabetic(userString.charAt(i))) { //Checks if the character is an alphabet
                characterStack.push(Character.toLowerCase(userString.charAt(i))); //Pushes the character to the stack in lowercase to make the comparison case-insensitive.
            }
        }
        //This loop is used for comparison
        for (int i = 0; i < userString.length(); i++) {
            //This if block is used to ignore the non-alphabetical characters.
            if (!Character.isAlphabetic(userString.charAt(i))) {
                continue;
            }
            char poppedCharFromStack = characterStack.pop(); //Top element is removed and stored.
            if (poppedCharFromStack != Character.toLowerCase(userString.charAt(i))) { //Stored character from stack is compared with the Original String's character.
                return false; //Returns false if the characters are not equal
            }
        }
        return true; //Returns true if all the iterated characters were equal thus showing that the string is a palindrome.
    }

    public static void main(String[] args) {
        gopal0410_6605901 reference = new gopal0410_6605901();
        String userString = reference.getUserInput();
        System.out.println(reference.palindromeStringUsingStack(userString));
        System.out.println(reference.palindromeStringUsingTwoPointers(userString));
    }
}
