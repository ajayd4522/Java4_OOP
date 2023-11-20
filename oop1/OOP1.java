package objectOrientedProgramming.oop1;

public class OOP1 {
    public static void main(String[] args) {

        
        // System.out.println(student1.toString());

        Student ajay = new Student();
        ajay.name = "Ajay";
        ajay.rno = 56;
        ajay.marks = 45.4f;
        System.out.println(ajay.marks);

        Student aarav = new Student(34, "Aaarav", 56.7f);
        System.out.println(aarav.name);

        Student manjali = new Student();
        System.out.println(manjali.name);

        Student anjali = new Student(56, "Anjali");
        // System.out.println(anjali.greetings());
        anjali.greetings();

        // when you are create many classes pointing to the original class
        // but passing different parameters
        // this is called constructor overloading

        Student Shreya = new Student(anjali);
        System.out.println(Shreya.name);

        // calling constructor from another constructor
        Student student1 = new Student(true);
        System.out.println(student1.name);
        
        // Wrapper class
        Integer num = new Integer(23);
        System.out.println(num);

        




    }

}
class Student {
        int rno = 0;
        String name = null;
        float marks = 0.0f;

        Student(boolean select){
            this(78, "Jeremy", 89.4f);

            if(select){
                System.out.println("Fine");
            }
        }

        Student(){
            this.name = "Manjali";
            this.rno = 53;
            this.marks = 45.6f;
        }

        Student (int rno, String name, float marks){
            this.rno = rno;
            this.marks = marks;
            this.name = name;
        }

        Student(int rno, String name) {
            this.rno = rno;
            this.name = name;
        }

        void greetings(){
            System.out.println("Hello my name is " + this.name);
        }

        Student (Student other){
            this.name = other.name;
            this.marks = other.marks;
            this.rno = other.rno;
        }

        
    }