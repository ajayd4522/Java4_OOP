package objectOrientedProgramming.oop5.abstractClassesDemo;

public class Main {
    public static void main(String[] args) {

        // Parent parent = new Parent ();  // you can not create an object of an abstract class
        Parent parent = new Son(45);
        parent.carrer();
        System.out.println(parent.num);

        Son son = new Son(25);
        System.out.println(son.num);
        // son.carrer();
        // son.partner();
        // son.normal();

        Daughter daughter = new Daughter(52);
        System.out.println(daughter.num);
        // daughter.carrer();
        // daughter.partner();
        // daughter.normal();

        

    }
}
