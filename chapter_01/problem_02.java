import java.util.Scanner;

public class problem_02 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Side of Square:");
        int side =sc.nextInt();
        int area = side * side;
        System.out.println("The Area of Square is :"+ area);
        int perimeter = 4 * side;
        System.out.println("The Perimeter of Square is :"+perimeter);
        sc.close();
    }
}
