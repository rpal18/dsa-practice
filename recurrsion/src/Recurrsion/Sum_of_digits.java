package Recurrsion;
import java.util.ArrayList;
import java.util.Arrays;
public class Sum_of_digits {
    public static void main(String[] args) {



    }
    static int Sum(int n){
        if(n==0){
            return 0;
        }
        int ld =n%10;
        n/=10;
        return ld+Sum(n);
    }
    static int Product(int n){
        if(n%10==n){
            return n;
        }
        int ld =n%10;
        n/=10;
        return ld*Product(n);
    }
}
