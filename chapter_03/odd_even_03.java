import java.util.Scanner;

public class odd_even_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("it is an Even Number");

        } else {
            System.out.println("it is an odd Nmuber");
            sc.close();
        }
    }
}
