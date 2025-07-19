package Singleton;



public class Main {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getObj1();
        Singleton obj2= Singleton.getObj1();
        Singleton obj3= Singleton.getObj1();
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);

    }
}
