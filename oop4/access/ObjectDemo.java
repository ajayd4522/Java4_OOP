package access;

public class ObjectDemo {

    int num;
    float gpa;
    
    public ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
        
    }

    // already covered these 2 
    @Override
    public String toString() {
        return "ObjectDemo []";
    }


    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
    }


    // we will go in details of how to create it in hashmap lecture
    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return num; // we overrided the hashcode method by returning num
    }


    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return this.num == ((ObjectDemo)obj).num;  // type casted from Object class Object type to ObjectDemo type
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }


    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(45, 56.9f);
        ObjectDemo obj2 = new ObjectDemo(45, 48.8f);

        if (obj == obj2){
            System.out.println("This is running : obj is equal to obj2");
        }
        
        if (obj.equals(obj2)){
            System.out.println("obj is equal to obj2");
        }


        System.out.println(obj2.getClass());
        // System.out.println(obj.hashCode());
        // System.out.println(obj2.hashCode());

        
    }

    

    
}