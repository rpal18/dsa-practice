import java.util.Scanner;

public class Fibnacii {
    static int fibnacci(int n){
        //base case
        if(n==0||n==1) return n;

        return fibnacci(n-1)+fibnacci(n-2);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the term ");
        int n = sc.nextInt();
        System.out.println(fibnacci(n));


    }
}
