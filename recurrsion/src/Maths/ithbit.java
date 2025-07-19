package Maths;

public class ithbit {
    public static void main(String[] args) {
        int n =16;
         int i =4;
        System.out.println(ans(n,i));

    }
    static int ans(int n , int i ){
        return n & (1 << i-1);
    }
}
