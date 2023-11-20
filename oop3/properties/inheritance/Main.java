package objectOrientedProgramming.oop3.properties.inheritance;

public class Main {
    public static void main(String[] args) {
        // Box box = new Box(4, 4, 4);
        // Box box2 = new Box(box);
        
        // System.out.println(box.l + " " + box.h + " " + box.w);
        // System.out.println(box2.l + " " + box2.h + " " + box2.w);

        // BoxWeight box3 = new BoxWeight ();
        // System.out.println(box3.h + " " + box3.l);


        // BoxWeight box4 = new BoxWeight(4, 5, 6, 7);
        // System.out.println(box4.h + " " + box4.l + " " + box4.w + " " + box4.weight);



        // Box box5 = new BoxWeight(2, 3, 4, 5);
        // System.out.println(box5.w);
        
        // there are many varriables in both parent and child classes
        // you are given access to variables that are in the ref type i.e. BoxWeight
        // hence, you should have access to weight variables
        // this also means, that the ones you are trying to access should be initialised
        // but here, when the obj itself is of type parent class, how will you call the constructor of child class
        // that is why error

        // BoxWeight box6 = new Box(2, 3, 4);
        // System.out.println(box6.w);


        // BoxPrice box = new BoxPrice(4, 8, 600);
        // System.out.println(box.side);

        // BoxWeight.greetings();

        BoxWeight box = new BoxWeight();
        BoxWeight.greetings();  // you can inherit but you cannot override
    }
}
