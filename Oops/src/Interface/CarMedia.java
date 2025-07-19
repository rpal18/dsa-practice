package Interface;

public class CarMedia implements Media{
    @Override
    public void start() {
        System.out.println("music starts");
    }

    @Override
    public void stop() {
        System.out.println("music stops");
    }
}
