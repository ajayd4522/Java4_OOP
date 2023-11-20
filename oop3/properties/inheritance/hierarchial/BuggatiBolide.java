package objectOrientedProgramming.oop3.properties.inheritance.hierarchial;

public class BuggatiBolide extends Buggati{

    String doors;


    
    public BuggatiBolide() {

        this.doors = "Scissor Hinges";

    }



    public BuggatiBolide(String frame, String doors) {
        
        super(frame);
        this.doors = doors;
    }

    
    
}
