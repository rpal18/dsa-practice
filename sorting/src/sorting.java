import java.util.Arrays;
public class sorting {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch =(char)('a'+i);
            builder.append(ch);

        }
        System.out.println(builder.toString());
        builder.deleteCharAt(5);
        System.out.println(builder);
    }
} /*cyclic_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclic_sort(int []arr){
        for (int i = 0; i < arr.length; i++) {


            int correct = arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
                i--;
            }
            else{
                i++;
            }
        }
    }
    static void swap(int [] arr ,int first ,int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}


import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        int[] arr = {3,4,2,1,5};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i , correct);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


}

*/
