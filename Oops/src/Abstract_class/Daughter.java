package Abstract_class;

public class Daughter extends Abstract_example {

    String carreer;
    String Partner_name;

    public Daughter(String carreer, String partner_name) {
        this.carreer = carreer;
        this.Partner_name = partner_name;
    }
    @Override
  protected void carreer(){
        System.out.println("i want to be a " + carreer);
    }

    @Override
    protected  void partner() {
        System.out.println(" i want to marry with "+ Partner_name);
    }

    public static void main(String[] args) {
        Son son = new Son("Engineer" ,"xyz");
        Daughter daughter = new Daughter("doctor" , "yzx");
        son.carreer();
        daughter.carreer();
        son.partner();
        daughter.partner();
    }
}
