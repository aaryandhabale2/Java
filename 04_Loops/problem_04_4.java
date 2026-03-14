
import java.util.Scanner;

public class problem_04_4 {
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number : ");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", n, i, n * i);
        }

        sc.close();
    }
}
