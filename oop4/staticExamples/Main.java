package objectOrientedProgramming.oop4.staticExamples;

public class Main {
    public static void main(String[] args) {
        // Human ajay = new Human(22, "Ajay", 10000, false);
        // Human aarav = new Human(34, "Aarav", 10000, true);
        
        
        // System.out.println(Human.population);
        // System.out.println(Human.population);


        
        Main funn = new Main(); // we are taking an object for non static method
        funn.fun2();

        funn.greeting();
    }


    // this is not dependent on objects
    static void fun (){
        // greeting(); // you can't use this because it required an instance
        // but the function you are using it in does not depend on instance

        // you cannot access non static stuff without referencing their instance in 
        // a static context

        // hence, here I am referencing it
        Main obj = new Main();
        obj.greeting();
    }


    void fun2 (){
                    // this both are non static, they need an object to run which is definitely called in main method
        greeting();
    }



    // we know that something which is not static, belongs to an object
    void greeting (){
        
        System.out.println("Hello World");
    }
}
