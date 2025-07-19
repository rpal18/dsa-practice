package Recurrsion;

public class BS {
    public static void main(String[] args) {
        int [] arr = {1,2,3,44,55,66,77,88};
        int target = 55;
        System.out.println(Binary(0, arr.length-1 , arr , target));

    }
    static int Binary(int s, int e, int [] arr , int target){
        // base condition
        if(s>e){
            return -1;
        }
        int m = s+(e-s)/2;

        if(arr[m] == target){
            return m ;
        }
         if(arr[m]>target){
             return Binary(s,m-1,arr,target);
         }
            return Binary(m+1,e,arr,target);

    }
}
