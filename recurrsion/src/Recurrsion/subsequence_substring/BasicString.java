package Recurrsion.subsequence_substring;

import java.util.ArrayList;
import java.util.List;

public class BasicString {
    public static void main(String[] args) {
//
//
//        String s = " ";
        System.out.println(subs("" ,"abck"));

    }

//    static StringBuilder sb = new StringBuilder();
//
//    static String remove_a(String s, int index) {
//
//        //base condition
//        if (index == s.length()) {
//            return sb.toString();
//        }
//
//        if (s.charAt(index) != 'a') {
//            sb.append(s.charAt(index));
//        }
//
//        return remove_a(s, index + 1);
//    }
//
//    static String skip_A_Stirng(String up, String check) {
//        //base case
//        if (up.isEmpty()) {
//            return "";
//        }
//
//        if (up.startsWith(check)) {
//            return up.substring(check.length());
//        }
//        return up.charAt(0) + skip_A_Stirng(up, check);

        static ArrayList<String> subsequence (String p, String up){
            //base case
            if (up.isEmpty()) {
                ArrayList<String> ans = new ArrayList<>();
                ans.add(p);
                return ans;

            }
            //if first element  selected
            ArrayList<String> left = subsequence(p + up.charAt(0), up.substring(1));
            //if not selected
            ArrayList<String> right = subsequence(p, up.substring(1));
            right.addAll(left);
            return right;


        }
   static void sub(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        //when i am selecting it
       char ch =up.charAt(0);
        sub(p+ch , up.substring(1));

        //when i am not selecting it
       sub(p,up.substring(1));
   }



   static ArrayList<String>subs(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> ls  = new ArrayList<>();
            ls.add(p);
            return ls;
        }
       ArrayList<String> left = subs(p+up.charAt(0) , up.substring(1));
       ArrayList<String> right = subs(p, up.substring(1));
   right.addAll(left);
   return right;
   }
    }

