package objectOrientedProgramming.oop6.generics.comparing;

public class Student implements Comparable<Student>{
    
    int rollno;
    float marks;


    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }


    @Override
    public int compareTo(Student o) {
        // TODO Auto-generated method stub
        // System.out.println("in compareto method");
        int diff = (int)(this.marks - o.marks);

        // if diff == 0 means both are equal
        // if diff < 0 means o is greater else o is smaller

        return diff;
    }


    @Override
    public String toString() {
        return marks + "";
    }

    

    

    
}
