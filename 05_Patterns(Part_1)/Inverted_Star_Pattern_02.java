import java.util.Scanner;

public class Inverted_Star_Pattern_02 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Star Number : -");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i + 1; s++) {
                System.out.print("#");
            }
            System.out.println("");
        }
        sc.close();
    }
}
