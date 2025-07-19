package Recurrsion.Backtracking;
import java.util.*;
import java.lang.*;
public class Maze_geeks {
    public static void main(String[] args) {
        int[][] maze = {
                {1,0,0,0},
                {1,1,0,1},
                {1,1,0,0},
                {0,1,1,1}
        };
        ArrayList<String> ans =new ArrayList<>();
        helper(maze,0,0,"",ans);
        System.out.println(ans);

    }

   static void helper(int[][] maze, int row, int col, String p, ArrayList<String> ans) {
        //base case
        //when it reaches to the last position (cell)
        if (row == maze.length - 1 && col == maze[0].length - 1) {

            ans.add(p);
//            System.out.println(ans);
            return;
        }

        //lets manage it explicitly
        if (row <= maze.length - 1 && (col <= maze[0].length - 1 && maze[row][col] == 0)) {
            return;
        }

//      marking the current cell as false becuase it is visited now.

       maze[row][col]=0;
        //we can possibly go top down left and right
        //for going upward

        if (row > 0) {
            helper(maze, row - 1, col, p + "u", ans);
        }

        //for going downwards
        if (row < maze.length -1) {
            helper(maze, row + 1, col, p + "d", ans);

        }

        //for going left
        if (col > 0) {
            helper(maze, row, col - 1, p + "l", ans);
        }

        //for going right
        if (col < maze[0].length -1 ) {
            helper(maze, row, col + 1, p + "r", ans);
        }
       // restoring the changes what ihave made

       maze[row][col]=1;
    }



}

