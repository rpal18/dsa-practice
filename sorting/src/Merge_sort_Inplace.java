import java.util.Arrays;

public class Merge_sort_Inplace {
    public static void main(String[] args) {
    int [] arr = {5,4,3,2,1};
    mergeSort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void mergeSort(int []  arr , int start , int end ){
        //base case
        if(end-start==1){
            return;
        }
        int mid = (start+end)/2;
        //left part
        mergeSort(arr,start,mid);
        mergeSort(arr,mid,end);

        merge(arr , start ,  mid , end);

    }
    //method to merge
    static void merge(int [] arr , int s , int m ,int e ){
        int []merge = new int[e-s];

        int i = s;
        int j = m;
        int k =0;
        while(i<m && j <e){
            if(arr[i]<arr[j]){
                merge[k] = arr[i];
                i++;
            }else{
                merge[k]=arr[j];
                j++;
            }
            k++;
        }

        while(i<m){
            merge[k]=arr[i];
            i++;
            k++;
        }
        while(j<e){
            merge[k]=arr[j];
            k++;
            j++;
        }

        for (int l = 0; l < merge.length; l++) {
            arr[l+s] =merge[l];
        }
    }
}
