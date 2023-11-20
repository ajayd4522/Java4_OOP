package access;

public class Main {
    public static void main(String[] args) {
        
        A obj = new A(10, "Ajay");
        System.out.println(obj.name);

        System.out.println(obj.getNum());
        obj.setNum(45);
        
    }
}
