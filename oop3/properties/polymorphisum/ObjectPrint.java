package objectOrientedProgramming.oop3.properties.polymorphisum;

public class ObjectPrint extends Object{


    int num;

    
    public ObjectPrint(int num) {
        super();
        this.num = num;
    }

    
    

    @Override // this is annotation
    public String toString() {
        return "ObjectPrint [num=" + num + "]";
    }




    public static void main(String[] args) {
        Object obj = new ObjectPrint(4);

        System.out.println(obj);
    }
}
