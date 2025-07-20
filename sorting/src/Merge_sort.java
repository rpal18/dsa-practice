import java.util.Arrays;

public class Merge_sort{
    public static void main(String[] args) {
  int [] arr ={5,4,2,3,1};
        System.out.println(  Arrays.toString(merge_sort(arr))
        );    }
    static int[] merge_sort(int [] arr){
        //base condition
        if(arr.length==1){
            return arr;
        }
    int mid = arr.length/2;
        int [] left = merge_sort(Arrays.copyOfRange(arr,0,mid));
        int [] right = merge_sort(Arrays.copyOfRange(arr, mid ,arr.length));
        return merge(left ,right);
    }

    //function to merge these two arrays
    static int[] merge(int [] first , int [] second){
        int i =0;
        int  j=0;
        int k =0;

        int [] merge = new int[first.length+second.length];

        while(i < first.length && j <second.length){
            if(first[i]<second[j]){
                merge[k]=first[i];
                i++;
            }
            else{
                merge[k]=second[j];
                j++;
            }
            k++;
        }
    //in both of the loops only one will run
        while(i<first.length){
            merge[k] = first[i];
            i++;
            k++;
        }

        while(j<second.length){
            merge[k] = second[j];
            j++;
            k++;
        }

        return merge;
    }
}
