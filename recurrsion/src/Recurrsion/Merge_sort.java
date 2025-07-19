package Recurrsion;

import java.util.Arrays;

public class Merge_sort {
    public static void main(String[] args) {
    int  a=1;
    a =+1;  a+=1;

        System.out.println(a);
    }
    static int []  merge_sort(int [] arr){
        //base case
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;


        int [] left= merge_sort(Arrays.copyOfRange(arr ,0,mid));
        int [] right= merge_sort(Arrays.copyOfRange(arr , mid ,arr.length));
        return merge1(left ,right);
    }

//    static int [] merge(int [] first , int [] second){
//        int [] ans = new int[first.length + second.length];
//
//        int i =0;
//        int j =0;
//        int k =0;
//        while(i<first.length && j<second.length){
//            if(first[i]>second[j]){
//                ans[k]=second[j];
//                j++;
//                k++;
//            }
//            else{
//                ans[k]=first[i];
//                i++;
//                k++;
//            }
//        }
//        //it may be possible that one of the array has more size than
//        //the  loops , used below will be use only one at a time
//        while(i<first.length){
//            ans[k]=first[i];
//            i++;
//            k++;
//        }
//
//        while(j<second.length){
//            ans[k] = second[j];
//            k++;
//            j++;
//        }
//        return ans;
//    }

    static int [] merge1(int []  first , int [] second){
        int [] ans = new int[first.length + second.length];
        int i =0;
        int j =0;
        int k =0;
        //till when both array ( first and second are of same length
        while( i < first.length && j<second.length){
            if(first[i]>second[j]){
                ans[k]=second[j];
                k++;
                j++;
            }
            else{
                ans[k]=first[i];
                i++;k++;
            }
        }

        // but there is a strong possibility that one of the two parts of array what we are
        //raking as an input would not be of same length.so that's why we need to manage its edge cases
        //as well.
       //there is always going to be use only one while loop at a time due to conditions.
        while(i<first.length){
            ans[k]=first[i];
            i++;k++;
        }
        while(j<second.length){
            ans[k]=second[j];
            j++;k++;
        }
        return ans;
    }
}
