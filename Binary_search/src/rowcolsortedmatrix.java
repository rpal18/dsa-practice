import java.util.Arrays;

public class rowcolsortedmatrix {
    public static void main(String[] args) {
    int [] [] matrix={{1,2,3,4}, {5,6,7,8}, {9,10,11,12},  {13,14,15,16}};
       int [] ans= binarsearch2d(matrix,55);
        System.out.println(Arrays.toString(ans));



    }

    static int[] binarsearch2d(int [][] matrix,int target){
        int row= 0;
        int col = matrix.length-1;

        while(row< matrix.length && col>=0){
             if(matrix[row][col]==target){
                 return new int[] {row,col};
             }
             if(matrix[row][col]> target){
                 col--;
             }
             else{
                 row++;
             }
        }
        return new int[] {-1,-1};
    }
}
