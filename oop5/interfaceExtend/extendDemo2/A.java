package objectOrientedProgramming.oop5.interfaceExtend.extendDemo2;

public interface A {

    default void fun(){ // default is the new feature since java 8
        // here you don't need to override the method bcoz we are using default keyword
        System.out.println("I am in default");
    }
    
}
