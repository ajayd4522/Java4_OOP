package objectOrientedProgramming.oop5.interfaces;

public class Car implements Engine, Brake, Media {

    @Override
    public void brake() {
        System.out.println("My car engine brakes like a normal car");
    }

    @Override
    public void start() {
        System.out.println("My car engine starts like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("My car engine stops like a normal car");
    }

    @Override
    public void acc() {
        System.out.println("My car engine accelerates like a normal car");
    }
    
}
