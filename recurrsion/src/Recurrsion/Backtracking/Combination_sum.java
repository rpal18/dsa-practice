package Recurrsion.Backtracking;
import java.lang.reflect.Array;
import java.util.*;
public class Combination_sum {
    public static void main(String[] args) {
        int[] can = {1,2,2,2};

        System.out.println(subsetsWithDup(can));
    }
    static ArrayList<ArrayList<Integer>> helper(int [] arr , int target , int index , ArrayList<Integer> ans1){
        //base case

          ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
          if (target == 0) {

              ans.add(new ArrayList<>(ans1));
              return ans;
          }

          if((index  ==arr.length) && (target<0))
          {
              return new ArrayList<>();
          }





        ArrayList<ArrayList<Integer>> ls =new ArrayList<>();

        if ( index < arr.length &&(target>=arr[index])){
            ans1.add(arr[index]);
            ls.addAll(helper(arr,target-arr[index] , index , ans1 ));

        }

            ls.addAll(helper(arr,target,index+1,ans1));

        return ls;
    }
    // code for suset sum 2

        static List<List<Integer>> subsetsWithDup(int[] nums) {
            Arrays.sort(nums);
            return helper(nums, 0 , new ArrayList<>());
        }

         static List<List<Integer>> helper(int[] arr, int index, List<Integer> current) {
            //base case
            if (index == arr.length) {
                List<List<Integer>> ans = new ArrayList<>();
                ans.add(new ArrayList<>(current));
                return ans;
            }
            List<List<Integer>> result = new ArrayList<>();
            // whether to select it or not
            //if select
            int n = arr[index];
            current.add(n);
            result.addAll(helper(arr, index + 1, current));
            current.remove(current.size() - 1);
            int nextindex = index+1;
            while(nextindex<arr.length && (arr[index]==arr[nextindex])){
                nextindex++;
            }
            result.addAll(helper(arr, nextindex, current));

            return result;


    }
}

