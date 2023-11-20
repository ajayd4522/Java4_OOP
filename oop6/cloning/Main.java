package objectOrientedProgramming.oop6.cloning;

import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws CloneNotSupportedException{
        Human Ajay = new Human(45, "Ajay Dewangan");
        // Human Aarav = new Human(Ajay); // actually this copying thing takes more time!

        // System.out.println(Aarav.name);
        
        Human Aarav = (Human)Ajay.clone();
        System.out.println(Aarav.name + " " + Aarav.age);
        System.out.println(Arrays.toString(Aarav.arr));

        Aarav.arr[1] = 100;

        // Aarav.name = "Aarav Dewangan";
        // System.out.println(Ajay.name);
        // System.out.println(Aarav.name);
        
        System.out.println(Arrays.toString(Ajay.arr));
        System.out.println(Arrays.toString(Aarav.arr));

        
    }
}