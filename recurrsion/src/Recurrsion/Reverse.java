package Recurrsion;

public class Reverse {
    public static void main(String[] args) {
       int n = 121;
        System.out.println(rev(n));
    }
    //gonna do by using helper function

    static boolean rev(int n){
        //base condition

        int digits= (int)(Math.log10(n)) +1;

        return helper(n,digits) == n;
    }
    static int helper(int n , int digits){
        if(n%10 == 0){
            return n;
        }
        int rem = n%10;
        return rem*(int)(Math.pow(10,digits-1))+helper(n/10,digits-1);
    }
}
