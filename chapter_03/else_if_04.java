public class else_if_04 {

    public static void main(String[] args) {

        int age = 11;

        if (age >= 18) {
            System.out.println("HE IS OLD");

        } else if (age >= 13 && age >= 18) {

            System.out.println("HE IS YOUNG");

        } else {
            System.out.println("HE IS CHILD");
        }
    }
}