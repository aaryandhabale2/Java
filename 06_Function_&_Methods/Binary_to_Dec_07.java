public class Binary_to_Dec_07 {
    public static void BintoDec(int Binnum){
      int mynum = Binnum;
      int pow =0;
      int decnum = 0;

      while(Binnum > 0){
        int lastdigit = Binnum % 10;
    decnum = decnum + (lastdigit + (int)Math.pow(2, pow));
    pow ++;
    Binnum =Binnum / 10;

 }
  System.out.println("Decimal of " + mynum + " = "  + decnum);
    }


public static void main(String args[]){
    BintoDec(111);
}
}
