
import java.util.Scanner;

public class Problem_03_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        long n = sc.nextInt();

        long fact = 1;
        if (n < 0) {
            System.out.println("For negative numbers factorial does not exist");
        } else {
            for (long i = 1; i <= n; i++) {
                fact *= i;
            }
            System.out.println("Factorial of " + n + " is:  = " + fact);
        }

        sc.close();
    }
}
// ...existing code...
