
import java.util.Scanner;

public class Calculator_10 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of A : ");
        int A = sc.nextInt();
        System.out.print("Enter the value of B : ");
        int B = sc.nextInt();
        System.out.println("Enter the operator");
        char operator = sc.next().charAt(0);

        switch (operator) {

            case '+':
                System.out.println(A + B);
                break;
            case '-':
                System.out.println(A - B);
                break;
            case '*':
                System.out.println(A * B);
                break;
            case '/':
                System.out.println(A / B);
                break;
            default:
                System.out.println("wrong operator");
                sc.close();
        }
    }
}
/*
 * import java.util.Scanner;
 * 
 * public class Calculator_10 {
 * public static void main(String args[]) {
 * Scanner sc = new Scanner(System.in);
 * 
 * System.out.print("Enter the value of A : ");
 * int A = sc.nextInt();
 * System.out.print("Enter the value of B : ");
 * int B = sc.nextInt();
 * System.out.println("Enter the operator");
 * char operator = sc.next().charAt(0);
 * 
 * switch (operator) {
 * case '+':
 * System.out.println(A + B);
 * break;
 * case '-':
 * System.out.println(A - B);
 * break;
 * case '*':
 * System.out.println(A * B);
 * break;
 * case '/':
 * if (B != 0) {
 * System.out.println(A / B);
 * } else {
 * System.out.println("Cannot divide by zero");
 * }
 * break;
 * default:
 * System.out.println("wrong operator");
 * }
 * sc.close();
 * }
 * }
 */