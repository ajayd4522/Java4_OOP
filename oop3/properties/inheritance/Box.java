package objectOrientedProgramming.oop3.properties.inheritance;

public class Box {
    private double l;
    double h;
    double w;
    double weight;
    double side;


    
    

    Box (){

        this.h = -1;
        this.l = -1;
        this.w = -1;

    }

     static  void greetings (){
        System.out.println("Hello, I am Box class");
    }


    // cube
    Box (double side){

        super();  // Object class

        this.w = side;
        this.l = side;
        this.h = side;
        this.side = side;
    }


     Box (double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box (Box old){
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

    public void information (){
        System.out.println("Running the box");
    }

    public double getL() {
        return l;
    }

    public double getH() {
        return h;
    }

    public double getW() {
        return w;
    }

    public double getWeight() {
        return weight;
    }

    public double getSide() {
        return side;
    }

    public void setL(double l) {
        this.l = l;
    }

    public void setH(double h) {
        this.h = h;
    }

    public void setW(double w) {
        this.w = w;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
