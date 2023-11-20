package objectOrientedProgramming.oop6.generics;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i + 2);
        }

        // arr.forEach((item) -> System.out.println(item * 2));

        Consumer<Integer> fun = (item) -> System.out.println(item * 2);
        arr.forEach(fun);


        // this whole thing is lambda expersion
        // actually it is the another way of writing code.
        Operation sum = (a,b) -> a + b;
        Operation sub = (a,b) -> a - b;
        Operation prod = (a,b) -> a * b;  // its just, we are overiding the method in lambda expersion

        LambdaFunctions myCalculator = new LambdaFunctions();
        System.out.println(myCalculator.operate(5,4,sum));
        System.out.println(myCalculator.operate(5,4,sub));
        System.out.println(myCalculator.operate(5,4,prod));
        
    }

    private int operate (int a, int b, Operation op){
        return op.operation(a, b);
    }
}

interface Operation {
    int operation (int a, int b);
}
