import java.util.Scanner;

public class Swap_13 {
    public static void main(String[] args) {
      int a , b, temp;
      Scanner sc = new Scanner(System.in); 

        System.out.print("Enter the first Number:");
         a = sc.nextInt();
        System.out.print("Enter the second Number:");
         b = sc.nextInt();

        temp = a;
        a = b;
        b = temp;

        System.out.println("**After Swapping**");
        System.out.println("First Number:" +a);
        System.out.println("Second Number:" +b );
        sc.close();
    }
}  

        


        