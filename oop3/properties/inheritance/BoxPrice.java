package objectOrientedProgramming.oop3.properties.inheritance;

public class BoxPrice extends BoxWeight{
    
    double price;

    public BoxPrice (){
        super();
        this.price = -1;
    }

    BoxPrice (BoxPrice other){
        super(other);
        this.price = other.price;
    }

    public BoxPrice(double l, double h, double w, double weight, double price) {
        
        super(l, h, w, weight);

        this.price = price;
    }
    
    
    public BoxPrice(double side, double weight, double price) {

        super(side , weight);

        this.price = price;
    }

    
}
