import java.util.Scanner;

public class pattern_printing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter no of rows:");
        int n = in.nextInt();
        pattern3(n);
    }
    static void pattern1(int n){
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print("* ");
            }
            System.out.println( );
        }

    }
    static void pattern2(int n){
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print(col +" ");
            }
            System.out.println( );
        }

    }
    static void pattern3(int n){
        for (int row = 1; row <=2*n-1; row++) {
            for (int col = 1; col <=n; col++) {
                System.out.print("* ");
            }
            for (int i = n-1; i >= 1; i--) {
                System.out.print("* " );

            }
            System.out.println( );
        }

    }



}
