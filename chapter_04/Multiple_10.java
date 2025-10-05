package chapter_04;
import java.util.Scanner;
public class Multiple_10 {
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    do{
    System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
    if(n % 10 == 0){
        break;
    }
        System.out.println(n);
    }while(true);
    sc.close();
}
}
