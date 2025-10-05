import java.util.Scanner;

public class Problem_01_3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number  :");
        int number = sc.nextInt();

        if ((number % 2) == 0) {
            System.out.println("It is Even no");
        } else {
            System.out.println("It is odd no");
            sc.close();
        }

    }
}
