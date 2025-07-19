import java.util.*;
import java.lang.*;

public class String2 {
    public static void main(String[] args) {
        String a = "";
        String b = "y";
        System.out.println(findTheDifference(a, b));
    }

    static int countzero(String s) {
        int n = s.length();

        int count = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0') {
                count++;
            } else {
                max = Math.max(count, max);
                count = 0;

            }
        }

        return Math.max(count, max);
    }

    static int countone(String s) {
        int n = s.length();

        int count = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                count++;
            } else {

                max = Math.max(count, max);
                count = 0;


            }
        }
        return Math.max(max, count);
    }

    static int maxPower(String s) {
        int n = s.length();
        if (n == 0) {
            return 0;
        }
        int i = 0;
        int count = 1;
        int max = 1;
        while (i < n - 1) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
                i++;
            } else {
                max = Math.max(count, max);
                count = 1;
                i++;
            }

        }
        return Math.max(count, max);

    }

    static int findLengthOfLCIS(int[] nums) {
        int n = nums.length;
        int i = 0;
        int max = 1;
        int count = 1;
        while (i < n - 1) {
            if (nums[i] < nums[i + 1]) {
                count++;
                i++;
            } else {
                max = Math.max(count, max);
                count = 1;
                i++;
            }
        }
        return Math.max(count, max);
    }
    static char findTheDifference(String s, String t) {
        int maxs = 0;
        int maxt = 0;
        for(int i =0 ; i< s.length();i++){
            maxs+=s.charAt(i);
        }
        for(int j =0;j< t.length();j++){
            maxt+=t.charAt(j);
        }
        return (char)(maxt-maxs);
    }
}
