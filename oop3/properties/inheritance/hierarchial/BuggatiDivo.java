package objectOrientedProgramming.oop3.properties.inheritance.hierarchial;

public class BuggatiDivo extends Buggati{


    String backlight;

    BuggatiDivo (){

        this.backlight = "Infinity Line";
    }

    public BuggatiDivo(String frame, String backlight) {

        super(frame);

        this.backlight = backlight;
    }

    
    
}
