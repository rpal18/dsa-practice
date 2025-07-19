package encapsulation;

public class Engine {
     public int capacity;

   protected Engine(int capacity) {
        this.capacity = capacity;
    }

     public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


}
