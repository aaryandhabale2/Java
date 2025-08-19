import java.util.Scanner;

public class Arithmetic_03 {
    public static void main(String[] args) {
        int A , B ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of A: ");
        A = sc.nextInt();
        System.out.print("Enter the value of B: ");
        B = sc.nextInt();

        // Arithmetic operation

        
 
    System.out.println("Addition: " + (A + B));
        System.out.println("Subtraction: " + (A - B));
        System.out.println("Multiplication: " + (A * B));
        System.out.println("Division: " + (A / B));
        System.out.println("Modulus: " + (A % B));

        
        // Increment and Decrement
        A++;
        System.out.println("Incremented A: " + A);
        B--;
        System.out.println("Decremented B: " + B);
        sc.close();
    }
}
