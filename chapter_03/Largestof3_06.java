import java.util.Scanner;

public class Largestof3_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number A:  ");
        int A = sc.nextInt();
        System.out.print("Enter The Number B:  ");
        int B = sc.nextInt();
        System.out.print("Enter The Number C:  ");
        int C = sc.nextInt();

        int largest;

        if ((A >= B) && (A >= C)) {
            largest = A;

        } else if ((B >= A) && (B >= C)) {
            largest = B;

        } else {
            largest = C;

        }
        System.out.print("The Largest Number is :- " + largest);
        sc.close();
    }
}
