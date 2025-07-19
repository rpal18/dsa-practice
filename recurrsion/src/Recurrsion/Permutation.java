package Recurrsion;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
//        List<String> a = permutationList("","abc");
//        System.out.println(a);
        System.out.println(permutation_count("","abcd"));
    }

    static void permutation(String p, String up) {
        //base case
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for (int i = 0; i < p.length() + 1; i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permutation(f + ch + s, up.substring(1));

        }
    }

    static List<String> permutationList(String p, String up) {
        //base case
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }


        char ch = up.charAt(0);

        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i < p.length() + 1; i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
//        permutationList(f + ch + s, up.substring(1));
            ans.addAll(permutationList(f + ch + s, up.substring(1)));
        }
        return ans;
    }
    static int permutation_count(String p, String up) {
        //base case

        if (up.isEmpty()) {
            return 1;
        }

        char ch = up.charAt(0);
        int count = 0;


        for (int i = 0; i < p.length() + 1; i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            count += permutation_count(f + ch + s, up.substring(1));

        }
        return count;
    }
}

