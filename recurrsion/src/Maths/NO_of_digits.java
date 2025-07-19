package Maths;

import java.util.Scanner;

public class NO_of_digits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int base = in.nextInt();
        //no of digits are
        int ans =(int)(Math.log(n)/Math.log(base))+1;
        System.out.println(ans);
    }
}
