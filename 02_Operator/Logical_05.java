public class Logical_05 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 15;

        // Logical AND
        boolean resultAnd = (a < b) && (b < c);
        System.out.println("Logical AND result: " + resultAnd);

        // Logical OR
        boolean resultOr = (a > b) || (b < c);
        System.out.println("Logical OR result: " + resultOr);

        // Logical NOT
        boolean resultNot = !(a < b);
        System.out.println("Logical NOT result: " + resultNot);
    }
}
