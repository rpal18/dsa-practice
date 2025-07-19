package Abstract_class;

public class Son extends Abstract_example{

    String carrer;
    String Partner_name;

     Son(String carrer , String partner) {
        this.carrer = carrer;
        this.Partner_name = partner;

    }

    @Override
     protected  void carreer() {
        System.out.println("i want to be a " + carrer);
    }
    @Override
    protected void partner() {
        System.out.println("i want to be a " + Partner_name);
    }
}
