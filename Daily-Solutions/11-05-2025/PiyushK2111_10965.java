import java.util.Scanner;
public class CountWord{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Taking a string as an input.
        System.out.println("Enter a sentence:");
        String a= scanner.nextLine();
        //Declaring a variable that keeps check on the number of words.
        int count = 0;
        boolean in = false;
        //Checking no. of spaces.
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (c != ' ' && !in) {
                // New words starts.
                in= true;
                count++;
            } else if (c == ' ') {
                // The current word ends now.
                in = false;
            }
        }
        System.out.println("No. of words: " + count);
    }
}