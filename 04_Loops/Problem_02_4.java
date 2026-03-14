
import java.util.Scanner;

public class Problem_02_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sumEven = 0, sumOdd = 0;
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "  It is a Even Number");
                sumEven += i;
            } else {
                System.out.println(i + "  It is Odd Number");
                sumOdd += i;

            }
        }
        System.out.println("Sum of Even Number is : " + sumEven);
        System.out.println("Sum of odd Number is : " + sumOdd);
        sc.close();

    }
}
