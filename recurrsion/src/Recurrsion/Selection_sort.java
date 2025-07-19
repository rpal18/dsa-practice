package Recurrsion;

import java.util.Arrays;

public class Selection_sort {
    public static void main(String[] args) {
        int [] arr = {5,4,9,2,1};
        selection(arr.length-1,0,arr ,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }


    static void bubble(int r, int c , int [] arr) {
        //base case

        if(r==0) {
            return ;
        }

        if(c>r-1) {

            bubble(r-1,0 ,arr);

        }
        else {
            if(arr[c]>arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            bubble(r,c+1 , arr);


        }

    }
    static void selection(int r , int c , int [] arr , int maxindex) {
        if (r == 0) {
            return;
        }

        if (c > r-1) {
             int temp = arr[maxindex];
             arr[maxindex] = arr[r];
             arr[r] = temp;
            selection(r-1, 0, arr, r-1);

        } else {
            if (arr[c] > arr[maxindex]) {
               maxindex = c;
               selection(r,c+1 ,arr ,maxindex);
            }
           else{
               selection(r,c+1,arr ,maxindex);
            }
        }
    }
        static void swap(int a ,int b){
            int temp = a;
            a=b;
            b=temp;
        }
}
