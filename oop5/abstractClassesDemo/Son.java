package objectOrientedProgramming.oop5.abstractClassesDemo;

public class Son extends Parent{

    public Son(int num) {
        super(num);
        //TODO Auto-generated constructor stub
    }

    @Override
    void carrer() {
        System.out.println("I want to be a Doctor");
    }

    @Override
    void partner() {
        System.out.println("I love Iron Man");
    }


    
}
