package chapter_04;

public class Reverse_07 {
    public static void main(String args[]){
      int  n = 30032006;
      while( n > 0){
        int lastdigit = n % 10;
        System.out.print(lastdigit);
        n = n / 10;

    }
    System.out.println();
}
}