import java.util.Arrays;
import java.lang.String;

//important question for concept building
// condition need to be checked after updating the value of i
public class String_Questions {
    public static void main(String[] args) {
        String text = "This.is.a.sentence.";
        String[] words = text.split("\\."); // Need to escape the period with \\

        for (String word : words) {
            System.out.println(word);
        }
    }
    static String interpret(String s) {
        int n = s.length();
        StringBuilder res = new StringBuilder();
        int i =0;
        while(i<n){
            if(s.charAt(i)=='(' && s.charAt(i+1)==')'){
                res.append("o");
                i+=2;
            }
            else if(s.charAt(i)=='(' && s.charAt(i+1)=='a'&& s.charAt(i+2)=='l'&&s.charAt(i+3)==')'){
                res.append("al");
                i+=4;
            }
            else {
                res.append(s.charAt(i));
                i++;
            }
        }
        return res.toString();
    }

    static int lengthOfLastWord(String s) {
        int n = s.length();

        s.trim();
        int count = 0;
        for(int i = n-1;i>=0;i++){
            if(s.charAt(i)!=' '){
                count++;
            }
            else{
                break;
            }
        }

        return count;
    }
    static  String sortSentence(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        String[] str = s.split(" ");
       // int n = str.length;
        String [] ans = new String[str.length];
        for(String t:str ){
            int k = t.length();
            int pos =t.charAt(k-1)-48;
            ans[pos-1]=t.substring(0,k-1);
        }
        for(String p:ans){
            sb.append(p);
            sb.append(" ");
        }

        return sb.toString().trim();
    }

}
