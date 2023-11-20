package objectOrientedProgramming.oop6.cloning;

public class Human implements Cloneable{
    int age;
    String name;
    int [] arr;

    // public Human(Human other) {
    //     this.age = other.age;
    //     this.name = other.name;
    // }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{1,2,3,4,5};
    } 

    // @Override // this is another way of copy objects by using clone method in Object class
    // public Object clone() throws CloneNotSupportedException{
    //     // this is shallow copy
    //     return super.clone();

    // }


    @Override 
    public Object clone() throws CloneNotSupportedException{
        // this is deep copy
        Human twin = (Human)super.clone();

        // make a deep copy
        twin.arr = new int[twin.arr.length];
        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }

        return twin;

    }
    

    
}
