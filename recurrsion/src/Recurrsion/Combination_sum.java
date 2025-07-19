package Recurrsion;
import java.util.*;
import java.util.ArrayList.*;
class Combination_sum {
    public static void main(String[] args) {
        int []  check = {2,3,5 };
        System.out.println(combinationSum(check , 8));
    }

       static ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        helper(0 , candidates , target , ans , new ArrayList<>() );
        return ans;
    }
   static void helper(int index, int [] can , int target , ArrayList<ArrayList<Integer>> ans , ArrayList<Integer> ls ){
        //base case
        if(index == can.length-1){
            if(target == 0){
                ans.add(new ArrayList<>(ls));
            }
            return ;

        }

        // condition for pickning up
        if(target>=can[index]){
            ls.add(can[index]);
            helper( index , can , target -can[index] , ans , ls);
            ls.remove(ls.size()-1);
        }
//condition when it is not picked up

            helper(index + 1, can, target, ans, ls);

    }
}
