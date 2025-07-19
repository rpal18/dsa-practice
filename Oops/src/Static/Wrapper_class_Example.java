package Static;

public class Wrapper_class_Example {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a,b);
        //it does not swap because both variable are primitivr
        //they are not an object , and in java there is nothing
        //like pass by refrence in java , only pass by value is
        //there .
        //and if it is not an object then refrence variable are
        //are gonna be stored only in stack memory . meaning a and
        //b are not gonna point anyone other object in heap memory.
        System.out.println(a +" "+b);
    }
    static void swap(int a , int b){
        int temp = a;
        a=b;
        b=temp;
    }
}
