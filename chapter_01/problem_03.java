import java.util.Scanner;

public class problem_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price of pencil:");
        float pencilPrice = sc.nextFloat();

        System.out.println("Enter the price of eraser:");
        float eraserPrice = sc.nextFloat();

        System.out.println("Enter the price of Pen:");
        float PenPrice = sc.nextFloat();

        float Total_Bill = (pencilPrice + eraserPrice + PenPrice);

        System.out.println("The Toatal price of items is :" + Total_Bill);

        float gst = Total_Bill * 0.18f;

        System.out.println("The final amount after adding is gst Bill is : " + (Total_Bill + gst));
        sc.close();
    }
}
