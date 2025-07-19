package encapsulation;

public class Main extends Engine
{
  protected final  static int torque ;
   static{
       torque=93;
   }
    private int horse_power ;


   //constructor
  protected Main( int hp ,int cap){
        super(cap);
        horse_power = hp;
    }


    public static void main(String[] args) {
        Main obj = new Main(89, 4);
        System.out.println(obj.horse_power);
        System.out.println(obj.capacity);

    }
}
