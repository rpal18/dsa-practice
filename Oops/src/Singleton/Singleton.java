package Singleton;
//singleton classes are the classes which can have only one object .
public class Singleton {
//here , we are defining the class constructor which is essential to load the class.
   private Singleton(){

    };
//here singleton object is public because we want to use it in different classes
    //it is static because it is the property of class not object thus it will be same for all the object of the class.
public static Singleton obj1;

   public static Singleton getObj1(){
       // if there is no object of the class then only we can create an object otherwise we are not allowed to do it ;
       if(obj1 == null){
           obj1 = new Singleton();
       }
       return obj1;
   }
}
