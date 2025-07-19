package Inheritance;

import encapsulation.Engine;

public class Box  {

    double length;
    double breadth;
    double height;

    Box(double l ,double b , double h ){

        this.length =l ;
        this.breadth = b;
        this.height =h;

    }
//copy constructor
    Box(Box old){
        this.length =old.length;
        this.breadth=old.breadth;
        this.height=old.height;
    }
    Box(){
        this.length=-1;
        this.breadth =-1;
        this.height=-1;
    }

    double area(Box old){
        //after determining the possible shapes i will calculate ate area acoordingy
        double area;
        if(old.length ==old.breadth && old.breadth == old.height){
            area  = 6 * (old.length * old.length);
        }
        else{
            area = 2*(old.length*old.breadth + old.breadth*old.height + old.length*old.height);
        }
        return area;
    }
}
