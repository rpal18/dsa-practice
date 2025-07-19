package Interface;

public class Electric_engine implements Engine{
    @Override
    public void start() {
        System.out.println(" i start like electric engine");
    }

    @Override
    public void stop() {
        System.out.println(" i stop like electric engine");
    }

    @Override
    public void acc() {
        System.out.println("i accelerate like electric engine");
    }
}
