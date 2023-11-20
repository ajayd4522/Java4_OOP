package objectOrientedProgramming.oop5.interfaceExtend.extendDemo2;

public interface B { // extending A means inheriting it

    public void greet ();
    // void fun();

    // static interface methods should always have a body
    // call via the interface name
    public static void greeting(){
        System.out.println("Hello Everyone, I am in greeting");
    }
    
}
