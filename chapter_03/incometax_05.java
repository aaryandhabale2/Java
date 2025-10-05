import java.util.Scanner;

public class incometax_05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Income");
        int income = sc.nextInt();

        if (income < 500000) {
            System.out.println("0% Tax");
        } else if ((income < 500000) && (income > 1000000)) {
            System.out.println("20% Tax");
        } else {
            System.out.println("30% Tax");
        }

        sc.close();
    }
}
