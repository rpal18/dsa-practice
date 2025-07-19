import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.Scanner;

public class secondlargestnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array :");
        int n = sc.nextInt();
        System.out.println("enter array element");
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        int ans = secondlargest(arr);
        System.out.println(ans);
    }
    static int largest(int [] arr){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i]>max){
                max=arr[i];

            }

        }
        return max;
    }
    static int secondlargest(int []arr ){
        int n = arr.length;
        int max = largest(arr);
        for (int i = 0; i < n; i++) {
            if(arr[i]==max){
                arr[i] =Integer.MIN_VALUE;
            }

        }
        int secondmax = largest(arr);
        return secondmax;
    }
}
