import java.util.Scanner;

public class Ifelse_01 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Age:");
      int age = sc.nextInt();

      if (age >= 18) {
         System.out.println("adult, do job");
      }

      else {
         System.out.println("He is a under age, he can't do job");
         sc.close();
      }

   }

}
