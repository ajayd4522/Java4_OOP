package objectOrientedProgramming.oop5.interfaces;

public class Main {
    
    public static void main(String[] args) {
        
        Engine car = new Car();  // this is very important line to understand
        // what to access defines by the ref varriable and what version of that to use is tell  by the type of object


        // car.a
        // car.acc();
        // car.start();
        // car.stop();


        // Media carMedia = new CDPlayer();
        // carMedia.stop();

        NiceCar car2 = new NiceCar();

        car2.start();
        car2.stop();
        car2.startMusic();
        car2.upgradeEngine(new ElectricEngine());
        car2.start();

        
    }

}
