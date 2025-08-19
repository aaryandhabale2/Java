import java.util.Scanner;
public class circle_09 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        float radius = sc.nextFloat();
        float Area = 3.14f * radius * radius;
        System.out.println("The Area of Circle is :" + Area);
        sc.close();
    }
}
    
    
// This code calculates the area of a circle based on user input for the radius.
// It uses the formula Area = π * radius^2, where π is approximated as
