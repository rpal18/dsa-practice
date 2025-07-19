package Recurrsion.subsequence_substring;
import java.util.*;
public class Permutation {
    public static void main(String[] args) {
        int [] nums = {1,2,3};
        List<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> current =new ArrayList<>();
        System.out.println(helper(nums,0,current));
    }
    static  ArrayList<ArrayList<Integer>> helper(int [] arr , int index , ArrayList<Integer> current){

        //base case

        if(index == arr.length){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
           ans.add(new ArrayList<>(current));
           return ans;
        }

        int n = arr[index];
        ArrayList<ArrayList<Integer>> result =new ArrayList<>();
        for(int i =0 ;i<current.size()+1;i++){
            current.add(i , n);
            result.addAll(helper(arr , index+1 ,current));
            current.remove(i);
        }
        return result;
    }
}
