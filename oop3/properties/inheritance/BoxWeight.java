package objectOrientedProgramming.oop3.properties.inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight(){

        this.weight = -1;

    }

    // // @Override
    //  void greetings (){
    //     System.out.println("Hello, I am BoxWeight class");
    // }


    public BoxWeight(double weight) {

        this.weight = weight;

    }

    BoxWeight (double side, double weight){
        super(side);
        this.weight = weight;
    }

    BoxWeight (BoxWeight other){
        
        super(other);
        weight = other.weight;
    }


    public BoxWeight(double l, double h, double w, double weight) {

        super(l, h, w); // what is this? call the parent class constructor
        // used to initialise values present in parent class


        System.out.println(super.weight); // if parent class also have weight varriable then you have to specify which weight you are talking about

        this.weight = weight;
    }

    

    
}
