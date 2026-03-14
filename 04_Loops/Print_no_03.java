
import java.util.Scanner;

public class Print_no_03 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of n : ");
    int number = sc.nextInt();
    int counter = 1;
    while (counter <= number) {
      counter++;
      System.out.print(counter + " ");
    }
    System.out.println();
    sc.close();
  }

}
