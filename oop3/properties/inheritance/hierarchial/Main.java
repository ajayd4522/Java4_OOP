package objectOrientedProgramming.oop3.properties.inheritance.hierarchial;

public class Main {
    public static void main(String[] args) {
        
        BuggatiChiron car = new BuggatiChiron("same", " three circle");
        System.out.println(car.frame);
        
        
        BuggatiDivo car2 = new BuggatiDivo("like lamborgini", "spaced line");
        System.out.println(car2.frame);
        
        
        BuggatiBolide car3 = new BuggatiBolide("like ferrari", "crossed line");
        System.out.println(car3.frame);

    }
}
