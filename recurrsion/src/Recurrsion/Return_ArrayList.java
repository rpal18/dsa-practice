package Recurrsion;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Return_ArrayList {
    public static void main(String[] args) {
        int [] ans = {2,3,3,3,3,4,5};
        int target = 3;
        System.out.println(ans(ans , target ,0));
    }
    // function for recursive linear search
    static ArrayList<Integer> ans(int [] arr , int target , int index){
        // amke a newarray list coz we dont have to take it as an argument
        ArrayList <Integer> list = new ArrayList<>();
         // base case

       if(index == arr .length-1){
           return list;
       }if(arr[index] == target){
           list.add(index);
        }

       ArrayList<Integer>findallAns = ans(arr, target, index+1);
       list.addAll(findallAns);
       return list;
    }
}
