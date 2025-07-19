package Interface.Nested_interface;

public class Nested {
   //nested interface
    public interface A{
        boolean isOdd(int n);
    }
}

class Main implements Nested.A{
    @Override
    public boolean isOdd(int n) {
        return (n&1)==1;
    }

    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println(obj.isOdd(5));
    }
}
