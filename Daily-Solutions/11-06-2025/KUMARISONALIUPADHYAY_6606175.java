import java.util.Scanner;

public class KUMARISONALIUPADHYAY_6606175 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        System.out.print("Enter a number: ");
        int n = scan.nextInt();
        // Store the original number
        int original_num= n;
        int digits = 0;
        int temp = n;
        while (temp > 0) {
            digits++;
            //this remove the last digit
            temp = temp / 10;
        }
        int sum = 0;
        temp = n;
        while (temp > 0) {
            //it will store last digit 
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp = temp / 10;
        }

        // Checking if the sum equals the original number
        if (sum == original_num) {
            System.out.println(original_num + " is an Armstrong number.");
        } else {
            System.out.println(original_num + " is NOT an Armstrong number.");
        }

        scan.close();
    }
}
