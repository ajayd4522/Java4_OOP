package objectOrientedProgramming.oop3.properties.inheritance.hierarchial;

public class BuggatiChiron extends Buggati{
    
    String frontlight;

    BuggatiChiron (){

        this.frontlight = "Four squares";

    }

    BuggatiChiron (String frame, String frontlight){

        super(frame);
        
        this.frontlight = frontlight;

    }
}
