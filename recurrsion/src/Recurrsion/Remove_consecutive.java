package Recurrsion;
import java.util.*;
public class Remove_consecutive {
    public static void main(String[] args) {
        String s  = "babcddbce";
        System.out.println(s);
        System.out.println(removeConsecutiveCharacter(s));
        System.out.println("babcdbce");
    }
    static  String removeConsecutiveCharacter(String s) {
        // code here
        StringBuilder sb =new StringBuilder();
        return helper(s,0,sb);
    }
   static String helper(String s , int index , StringBuilder sb ){
        // base condition
        if(index == s.length()-1){
            if(s.charAt(index) !=sb.charAt(sb.length()-1)){
                sb.append(s.charAt(index));
            }
            return sb.toString();
        }

//        if((index+1) == s.length()-1){
//            sb.append(s.charAt(s.length()-1));
//        }

        if(s.charAt(index) != s.charAt(index+1)){
            sb.append(s.charAt(index+1));
//            sb.append(s.charAt(index+1));
//            return helper(s ,index+2 , sb);
        }
        if((s.charAt(index)) == s.charAt(index+1) )
        {
            if(  sb.length() >0  && (s.charAt(index) !=sb.charAt(sb.length()-1))){
                sb.append(s.charAt(index));
            }
        }



        return helper(s ,index+1 , sb);
    }
}
