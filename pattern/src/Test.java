import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
     int [] arr ={4,3,2,1};
        System.out.println(Arrays.toString(bubble(0,0,arr)));
    }
    static void pattern1(int row, int col , int n ){
        //base conditon
        if(row == n){
            return ;
        }
        if(col <= (n-row +1)){
            System.out.print("* ");
            pattern1(row ,col+1 ,n);
            System.out.println();
        }

        pattern1(row+1 ,1,n);
    }
    static int[] bubble(int row, int col , int [] arr ){
        //base conditon
        if(row == arr.length-1){
            return arr;
        }
        if(col < row){
            if(arr[col]>arr[col+1]){
                int temp = arr[col];
                arr[col] = arr[col+1];
                arr[col+1] = temp;
            }

           return bubble(row,col+1 , arr);
        }
        return bubble(row+1 ,1,arr);
    }
}
