package Recurrsion.Backtracking;
import java.awt.image.BandedSampleModel;
import java.util.*;
public class All_path_maze {
    public static void main(String[] args) {
    boolean [][] maze ={
           {true, true, true, true},
            {false, false, true, true},
            {true, true, false, true},
            {true, true, true, true}
    };
//    ArrayList<String> ans = new ArrayList<>();
//        System.out.println(allpath("", maze,0, 0,ans));
    int [] [] arr =new int[maze.length][maze[0].length];
        allpath_mat("",maze,0 ,0 ,arr , 1);
    }
    static ArrayList<String> allpath(String p , boolean [][] maze , int r, int c , ArrayList<String> ans){
        //base case
        if(r==maze.length-1 && c==maze[0].length-1){
            ans.add(p);
            return ans;
        }

        if(!maze[r][c]){
            return new ArrayList<>();
        }
        maze[r][c]=false;
        //condition whether we can go down or not

        if(r<maze.length-1){
            allpath(p+'D' , maze ,r+1 ,c ,ans);
        }
//   condition whethe we can go right or not
        if(c<maze[0].length-1){
            allpath(p+'R' , maze ,r ,c+1 , ans);
        }
        //conditon whether can we go upwards or not
        if(r>0){
            allpath(p+'U', maze ,r-1,c ,ans);
        }
        //condition whether can we go left side or not
        if(c>0){
            allpath(p+"L" , maze ,r,c-1 ,ans);
        }
        maze[r][c] = true;


        return ans;
    }





    static void  allpath_mat(String p , boolean [][] maze , int r, int c , int [][] path , int step){
        //base case
        if(r==maze.length-1 && c==maze[0].length-1){
            path[r][c]=step;
         for(int [] arr :path){
             System.out.println(Arrays.toString(arr));
         }
            System.out.println(p);
            System.out.println();
         return;
        }

        if(!maze[r][c]){
            return;
        }
        maze[r][c]=false;
        path[r][c] = step;
        //condition whether we can go down or not

        if(r<maze.length-1){
            allpath_mat(p+'D' , maze ,r+1 ,c , path , step+1);
        }
//   condition whethe we can go right or not
        if(c<maze[0].length-1){
            allpath_mat(p+'R' , maze ,r ,c+1 ,path , step+1);
        }
        //conditon whether can we go upwards or not
        if(r>0){
            allpath_mat(p+'U', maze ,r-1,c ,path , step+1);
        }
        //condition whether can we go left side or not
        if(c>0){
            allpath_mat(p+"L" , maze ,r,c-1 ,path , step+1);
        }
        maze[r][c] = true;
        path[r][c]=0;
    }



}
