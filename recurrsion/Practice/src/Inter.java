//write a code to che
public class Inter {
    public static void main(String[] args) {
String s= "123.7627346";
        System.out.println(is_perfect(s));
    }
    static boolean is_perfect(String s){
        for(char val : s.toCharArray()){
            if((val ==0) || (val=='-') || (val >=11)){
                return false;
            }
        }
        return true;
    }
}
