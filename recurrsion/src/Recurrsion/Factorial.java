package Recurrsion;

public class Factorial {
    public static void main(String[] args) {
        int n =5
;
        System.out.println(Sum(n));
    }
    static int  fact(int n){
        if(n==0){
            return 1;

        }
        return n*fact(n-1);

    }
    static int Sum(int n){
        if(n==0){
            return 0;

        }
        return n+Sum(n-1);

    }
}
