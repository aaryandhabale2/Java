public class Func_Factorial_03 {      //This Program is for to find Factorial
    public static int factorial(int n){
        int f = 1;
        for (int i = 1; i <= n; i++){
            f = f * i;
        }
        return f;

    
        }

public static int factorial(int n , int r){   // This programis for to find Binomial Coefficient
    int fact_n = factorial(n);
    int fact_r = factorial(r);
    int fact_nmr = factorial(n-r);

    int binocoeff = fact_n/ (fact_r * fact_nmr);
    return binocoeff;

}
//Function Overloading
/*in this function overloading we have to two
    things 1st :- type of parameter and 2nd :- No of Parameter */
    //just Parameter Diffrence!!!!!.......
    public static int func( int a , int b){
    return a+b;
}
public static int func(int a, int b, int c){
    return a+b+c;
}
    public static void main(String args[]){
        System.out.println(func(5 , 6));
        System.out.println(func(4, 7, 9));

    }
}
