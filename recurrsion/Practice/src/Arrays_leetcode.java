import java.util.Arrays;



public class Arrays_leetcode {
    public static void main(String[] args) {
        int[][] mat = {{0,1},{1,1}};
        int[][] target = {{1,0},{0,1}};
        System.out.println(findRotation(mat,target));
        //  System.out.println(Arrays.toString(mat[0]));


//        System.out.println(Arrays.deepToString(reverse(mat)));
//
//    }
//    static boolean equal(int [][] mat ,  int[][] mat2){
//        int n =mat.length;
//        int m = mat[0].length;
//        for (int i = 0; i <n; i++) {
//            for (int j = 0; j <n; j++) {
//                    if( mat[i][j]!= mat2[i][j]){
//                        return false;
//                    }
//            }
//
//        }
//        return true;
//    }
//    static int [][] rotate(int [][] mat){
//        //in place
//        int m = mat.length;
//        int n = mat[0].length;
//        for (int i = 0; i < m; i++) {
//            for (int j = i+1; j < m; j++) {
//                int temp = mat[i][j];
//                mat[i][j]=mat[j][i];
//                mat[j][i]=temp;
//            }
//
//        }
//        return mat;
//    }
//    static int [] [] reverse(int [] [] mat){
//        int m = mat.length;
//        int i =0;int j=m-1;
//        int k =0;
//
//    while (i <= j && k<m) {
//        int temp = mat[k][i];
//        mat[k][i] = mat[k][j];
//        mat[k][j] = temp;
//        i++;
//        j--;
//        if(i>j){
//            i = 0;
//            j = m - 1;
//            k++;
//
//        }
//
//    }
//
//
//
//
//        return mat;
//    }


    }

   static boolean findRotation(int[][] mat, int[][] target) {

        if(equals(mat,target)){
            return true;
        }
        //first time rotation
         if (equals(mat, target)==false) {
            rotate90(mat);
            if (equals(mat, target) == true) {
                return true;
            }
            //second time rotation


            else{
                rotate90(mat);
                if (equals(mat, target) == true) {
                    return true;

                }
                //third time rotation
                else{
                    rotate90(mat);
                    if (equals(mat, target) == true) {
                        return true;
                    }
                }
            }


        }
         return false;
    }
 static   int [][] rotate90(int [][] mat){
        int m = mat.length;
        int n= mat[0].length;
        for(int i =0;i<m;i++){
            for(int j = i+1;j<n;j++){
                int temp = mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;

            }
        }
        int i=0;int j=m-1;
        int k=0;
        while(i<=j && k<m){
            int temp = mat[k][j];
            mat[k][j] = mat[k][i];
            mat[k][i] = temp;
            i++;
            j--;
            if(i>j){
                i=0;j=m-1;
                k++;
            }
        }
        return mat;
    }

   static boolean equals(int [][] mat , int [][]mat2){
        int m =mat.length;
        int n= mat[0].length;
        int o = mat2.length;
        int p = mat2[0].length;
        if(m==o && n==p ){
            for(int i =0;i<m;i++){
                for(int j = 0;j<m;j++){
                    if(mat[i][j]!=mat2[i][j]){
                        return false;
                    }
                }
            }

        }
        return true;
    }
    }