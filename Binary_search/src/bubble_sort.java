import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {
        int[] arr = {5,0,3,2,1};

//
         cyclic_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

//              }
//            }
//            if (!swapped) {
//                break;
//            }
//
//        }
//
//        return arr;
//        for (int i = 1; i < 10; i++) {
//         System.out.println(i);
//        }
//    }/
//}


    static void cyclic_sort(int [] arr){

        int n= arr.length;
        int i =0;
        while(i<n){
            int correct_index = arr[i]-1;
            if(arr[i]!=arr[correct_index]){
                int temp = arr[i];
                arr[i]=arr[correct_index];
                arr[correct_index]=temp;
            }
            else{
                i++;
            }
        }
    }
}