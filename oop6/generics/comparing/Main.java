package objectOrientedProgramming.oop6.generics.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student ajay = new Student(1, 76.45f);
        Student aarav = new Student(45, 86.45f);
        Student laxmi = new Student(35, 80.45f);
        Student sarasvati = new Student(67, 68.45f);
        Student meghna = new Student(99, 89.45f);

        Student[] list = {ajay, aarav, laxmi, sarasvati, meghna};

        System.out.println(Arrays.toString(list));
        // Arrays.sort(list, new Comparator<Student>(){

        //     @Override
        //     public int compare(Student o1, Student o2) {
        //         return -(int)(o1.marks - o2.marks);
        //     }

        // });

        Arrays.sort(list, (o1, o2) -> -(int)(o1.marks - o2.marks));  // this is called the lambda expression

        System.out.println(Arrays.toString(list));


        // if(ajay.compareTo(aarav) < 0){

        //     System.out.println("aarav is a topper");

        // }

    }
}
