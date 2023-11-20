package objectOrientedProgramming.oop5.abstractClassesDemo;

public abstract class Parent {
    
    int num;
    int age;

    final int VALUE ;

    
    public  Parent (int age, int num) {
        this.age = age;
        VALUE = 32352222;
    }

    public Parent (int num) {  // you can not instantiate an abstract class but you can use derived class instead
        this.num = num;
        VALUE = 32352222;
    }

    abstract void carrer ();
    abstract void partner ();

    public void normal(){

        System.out.println("This is a normal method");

    }

}
