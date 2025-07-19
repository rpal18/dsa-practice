package Inheritance;

public class Boxweight extends Box{

    double weight ;
    Boxweight(double l ,double b , double h , double w)
    {
        super(l , h ,b);
        this.weight =w;
    }

    Boxweight(){
        super();
        this.weight =-1;
    }
    Boxweight(Boxweight other){
        super(other);
        this.weight =-1;
    }
}
