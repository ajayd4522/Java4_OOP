package objectOrientedProgramming.oop4.staticExamples;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;
    // static belongs to the class not the object
    // thats why it is called first with main method


    static void message (){
        System.out.println("Hello World");
        // System.out.println(this.age); // you can't use over here
    }

    public Human (int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;

        Human.population += 1;
    }

}
