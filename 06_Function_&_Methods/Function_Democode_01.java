import java.util.Scanner;
public class Function_Democode_01 {

public static int CalculateSum(int a, int b){ //Parameters
      int sum = a+b;
      return sum;
    }
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Addition of Two input : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = CalculateSum(a , b);//Arguments
        
System.out.println("the sum of a+b :- "+ sum);
sc.close();
    }
}
