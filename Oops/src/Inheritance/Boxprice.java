package Inheritance;

public class Boxprice extends Boxweight {

    double price ;
     Boxprice(){
         super();
         this.price = 100;
     }

     Boxprice(Boxprice other){
         super(other);
         this.price  = other.price;
     }
     Boxprice(double length , double width , double height , double weight , double price ){
         super(length , width , height ,weight );
         this.price = price;
     }
     void display(Boxprice other) {
         System.out.println("area is : "+area(other));
         System.out.println("price of the box is :" + other.price);
     }
}
