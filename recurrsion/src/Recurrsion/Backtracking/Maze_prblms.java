package Recurrsion.Backtracking;
import javax.naming.PartialResultException;
import java.util.*;
public class Maze_prblms {
    public static void main(String[] args) {
        boolean[][] arr = {

                {true, true, true},
                {false, false, true},
                {true, true, true}

        };


        maze_obstacles("",0,0,arr);
    }

    static ArrayList<String> maze(String p , int r, int c , boolean [][] maze){
        //base case
        if(r==maze.length-1 && c==maze[0].length-1){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
         ArrayList<String> ls =new ArrayList<>();

        if(r<=maze.length-1){
            ls.addAll(maze(p+'D' , r+1 ,c ,maze));
        }
        if(c<=maze[0].length-1){
            ls.addAll(maze(p+'R' , r,c+1 ,maze));
        }
        return ls;
    }

    static void maze_obstacles(String p , int r, int c , boolean [][] maze){
        //base case
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }

        if( (r<=maze.length-1) && (c<=maze[0].length-1)&& maze[r][c] == false){
            return;
        }
        if(r<=maze.length-1){
           maze_obstacles(p+'D' , r+1 ,c ,maze);
        }
        if(c<=maze[0].length-1){
            maze_obstacles(p+'R' , r,c+1 ,maze);
        }

    }
}
