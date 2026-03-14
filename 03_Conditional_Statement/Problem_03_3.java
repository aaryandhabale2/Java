import java.util.Scanner;
public class Problem_03_3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the week no :");
        int week = sc.nextInt();

        switch(week){
            
case 1 : System.out.println("Sunday");
                break; 
case 2 : System.out.println("Monday");
                break; 
case 3 : System.out.println("Tueday");
                break; 
case 4 : System.out.println("Wednesday");
                break; 
case 5 : System.out.println("Thursday");
                break;
case 6 : System.out.println("Friday");
                break;
 case 7: System.out.println("Saturday");
                break; 
default : System.out.println("Its not any week");
                sc.close();
        }
    }
}
