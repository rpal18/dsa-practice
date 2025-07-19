package Interface;

public class Car  {
  private Engine engine;
  private Media media = new CarMedia();


  Car(){
      engine = new Power_engine();
  }

  Car(Engine engine){
      this.engine = engine;
  }

  void start(){
      engine.start();
  }

  void stop(){
      engine.stop();
  }

  void accelerate(){
      engine.acc();
  }
  void startMusic(){
      media.start();
  }
  void stopMusic(){
      media.stop();
  }
  void upgrade_engine(){
      engine = new Electric_engine();
  }

    public static void main(String[] args) {
        Car tata = new Car();
        tata.start();
        tata.accelerate();
        tata.startMusic();
        tata.upgrade_engine();
        tata.start();
    }
    }

