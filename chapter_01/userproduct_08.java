import java.util.Scanner;
public class userproduct_08 {
    int a , b;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number:");
    int a= sc.nextInt();
    System.out.println("Enter the second number:");
    int b = sc.nextInt();
    int product = a * b;
    System.out.println("The product of a And b is :"+product);
    sc.close(); 
    }
}
