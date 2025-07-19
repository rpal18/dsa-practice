package Maths;

import java.util.Scanner;

public class Pascal_triangle {
    public static void main(String[] args) {
        System.out.println("enter row no to calculate sum:");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("desired result");
        System.out.println(1<<n-1);
    }
}
