import java.util.Scanner;

public class KUMARISONALIUPADHYAY_6606175 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = scan.nextInt();
        scan.close();

        int result = fibonacci(n);
        System.out.println("The " + n + "th Fibonacci number is: " + result);
    }

    public static int fibonacci(int n) {
        if (n == 0) return 0;  // Base case F(0)
        if (n == 1) return 1;  // Base case F(1)

        int a = 0;  // F(0)
        int b = 1;  // F(1)
        int c = 0;  // To store F(n)

        for (int i = 2; i <= n; i++) {
            c = a + b;  // F(n) = F(n-1) + F(n-2)
            a = b;      // Move forward
            b = c;
        }
        return c;
    }
}
