import java.util.Arrays;
import java.util.Scanner;

public class binaryquestion2 {
    public static void main(String[] args) {
int [] arr = {9,8,7,6,5,4,3,2,1};
int target = 3;
int ans =orderagnosticbs(arr,target);
        System.out.println(ans);
    }





    static int orderagnosticbs(int [] arr,int target){
        int start =0;
        int end= arr.length-1;

        boolean isasc= arr[start]<arr[end];
        while(start<=end){
            int mid = start +(end-start)/2;

             if (arr[mid] == target) {
                 return mid;
             }
         if(isasc){

                if(arr[mid]<target){
                start = mid+1;
                  }
                else{
                    end=mid-1;
                 }

        }
         else {
             if(arr[mid]>target){
                 start = mid+1;
             }
             else{
                 end=mid-1;
             }
         }

    }
        return start;
}
}