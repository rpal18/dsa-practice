package polymorphism;

import encapsulation.Engine;

public class Main extends Circle {

//constructor
    Main(int cap, int dia)
    {
        super(cap , dia);
    }
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        // ref type tell that what are the things that ref variable can access
//        but it can only access the method of child class only
//        Engine shape1  = new Circle();
          Circle obj = new Circle(87,10);
        System.out.println(obj.capacity);

    }
}
