import java.util.Scanner;

public class input_07 {
    public static void main(String[] args) {
        System.out.println("Enter Something");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("You entered: " + input);

        sc.close();
    }

}
