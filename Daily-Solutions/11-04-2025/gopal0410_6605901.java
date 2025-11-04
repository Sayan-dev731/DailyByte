
// Problem: Spooky-Case
// Date: 11-04-2025
// Author: Gopal Kovachi
// GitHub: gopal0410
// ERP ID: 6605901

// Approach:
// 1. Check if the string is empty and return empty string if true.
// 2. Initialize character count variable to ensure that only the 2nd character is being capitalized.
// 3. Running a for loop so that all required characters are updated.
// 4. Implementing if statements and appending to a new StringBuilder variable 'spooky'

// Time Complexity: O(n)
// Space Complexity: O(n)

public class gopal0410_6605901{
    public String spooky_case(String normal){
        if(normal == ""){
            return "";
        }
        StringBuilder spooky = new StringBuilder("");
        int char_count = 0; //For making sure that the 2nd character is capitalized
        for(int i = 0; i < normal.length(); i++){
            if(normal.charAt(i) == '-' || normal.charAt(i) == '_'){ //Checks if the character is hyphen or underscore
                spooky.append("~"); //Replaces ~ in place of hyphens or underscore
                char_count = 0;
                continue;
            }
            if(char_count == 1){ //Checks if it is the 1st character after the first capitalized character
                spooky.append(normal.charAt(i)); //Appends the character normally
                char_count = 0;
                continue;
            }
            if(char_count == 0){ //Checks if it is the 1st character itself
                spooky.append(Character.toUpperCase(normal.charAt(i))); //Appends the character in uppercase
                char_count++;
            }
        }
        return spooky.toString();
    }
    public static void main(String[] args) {
        gopal0410_6605901 reference = new gopal0410_6605901();
        reference.spooky_case("___");
    }
}