package Maths;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if((n&1) ==1){
            System.out.println("odd");
        }
        else{
            System.out.println("even");
        }

    }

    static boolean check() {


        int a = 19;
        int b = 212;
        return a== b;
    }

}