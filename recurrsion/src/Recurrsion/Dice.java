
package Recurrsion;
import java.util.*;
public class Dice {
    public static void main(String[] args) {
        System.out.println(diceList("" , 6));
    }
    static void dice(String p , int target){
        if(target == 0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <=6 && i<=target ; i++) {
            dice(p+i , target-i);

        }
    }
    static List<String> diceList(String p , int target) {
        if (target == 0) {
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        ArrayList<String> ls = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            ls.addAll(diceList(p + i, target - i));

        }
        return ls;
    }
    static void dice_count(String p , int target) {
        if (target == 0) {

            return;
        }
        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(p + i, target - i);

        }
    }
}
