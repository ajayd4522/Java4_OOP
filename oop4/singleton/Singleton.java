package objectOrientedProgramming.oop4.singleton;

// this is used when we need to have one object only
public class Singleton {
    private Singleton () { // constructor itself is private that means you can not create an object

    }

    private static Singleton instance;

    public static Singleton getInstance() {

        // check whether 1 obj only is  created or not
        if(instance == null){
            instance = new Singleton();

        }

        return instance;
    }
}
