package objectOrientedProgramming.oop1;

public class WrapperClass {
    public static void main(String[] args) {

        // Final keyword for primitive datatype
        final int number = 12;
        System.out.println(number);

        // final keyword for classes
        final A kunal = new A("Ajay Dewangan");
        System.out.println(kunal.name);
        kunal.name = "Anshu Dewangan"; //we can change the value inside the object but we can not re assign the object
        System.out.println(kunal.name);

        // Garbage collection
        // it works automatically when there is load on memory, you don't need to call it 
        // but we can see when its triggering by using print function
        A obj;
        for (int i = 0; i < 1000000; i++) {
            obj = new A ("Random name"); // here we are reasging the object again and again
        }
    }
}

class A {

    String name;

    A (String name){
        this.name = name;
    }

    // thats the code for destructor or garbage collector
    @Override
    protected void finalize () throws Throwable {
        System.out.println("Object is destroyed");
    }
}
