package inbuilt_packages;
//in built packages are what we import while coding where libraries and classes and their method are stored.
// example : lang , io , util(arraylist and data structur and collection framework are stored over here )

public class First_test {
// hashcode is the unique numbewr created for object
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }
// this finalize methos has been deprecated now in java and marked for removal
   // @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//    }
public static void main(String[] args) {
    First_test obj = new First_test();
    //it will give true because obj is the object of first_test class.
    System.out.println(obj instanceof First_test);

}
}
