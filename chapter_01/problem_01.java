import java.util.Scanner;
public class problem_01 {
    // This program calculates the sum of three numbers entered by the user
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int a = sc.nextInt();
        System.out.println("Enter Second Number:");
        int b = sc.nextInt();
        System.out.println("Enter Thrid Number:");
        int c = sc.nextInt();
        int sum = a + b + c;
        System.out.println("The Sum of the Three Number is:" + sum);
        sc.close();
        
    }

}