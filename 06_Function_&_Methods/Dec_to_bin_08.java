public class Dec_to_bin_08 {
    public static void DectoBin (int n){
        int mynum = n;
        int pow = 0;
        int binnum = 0;

        while( n > 0){
            int rem = n % 2; // or 'n & 1'
            binnum = binnum + (rem * (int)Math.pow(10, pow));
            pow ++;
            n = n / 2;
        }
        System.out.println("binary of " + mynum + " = " + binnum );
    }
    
    public static void main(String args[]){
        DectoBin(12);
    }
}