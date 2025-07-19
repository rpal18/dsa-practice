import java.util.Scanner;

public class binarysearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] arr ={2,3,5,9,14,15,16};
//        System.out.println("enter array element:");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]=in.nextInt();
//
//        }
//        System.out.println("enter element to search:" );
//
//
//        int n = in.nextInt();
      int target =12;
        int ans = binarysearch1(arr,target);
        System.out.println(ans);
    }
    static int binarysearch1(int [] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int mid = start +(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                start = mid+1;
            }else{
                end=mid-1;
            }
        }
        return start;
    }
}

