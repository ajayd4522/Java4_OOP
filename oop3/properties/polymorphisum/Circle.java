package objectOrientedProgramming.oop3.properties.polymorphisum;

public class Circle  extends Shapes{
    


    // this will run when obj of Circle is created
    // hence it is oveririding the parent method
    @Override // this is called annotation
    void area2 (){
        System.out.println("Area is pie * r * r");
    }
}
