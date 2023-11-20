package objectOrientedProgramming.oop6.generics;

import java.util.ArrayList;
import java.util.Arrays;

// https://docs.oracle.com/javase/tutorial/java/generics/restrictions.html#createObjects


public class CustomGenArrayList<T> {
    
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;  // also working as index value
    private int DOUBLE = DEFAULT_SIZE;  // we are using another varriable for doubling up the size of array


    public CustomGenArrayList() {

        this.data = new Object[DEFAULT_SIZE];

    }

    public T remove (){
        T removed = (T)(data[size--]); // first give the value then decrement it
        return removed;
    }

    public T get (int index){
        return (T)(data[index]);
    }

    public void set (int index, int value){

        data[index] = value;
    }

    public int size(){
        // this is not the actual size of the array, it is the size of element in the array
        return size;
    }

    public void add (T num){
        if(isFull()){

            resize();
            
        }

        data[size++] = num; // here size is post incremented!
    }


    private void resize() {
        Object[] temp = new Object[DOUBLE = DOUBLE * 2];

        // copying the current items into the new int array which is double of previous one
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }

        data = temp;
    }

    private boolean isFull() {
        // System.out.println(data.length);
        return size == data.length;
    }
    

    

    @Override
    public String toString() {
        return "CustomGenArrayList [data=" + Arrays.toString(data) + ", size=" + size + "]";
    }


    public static void main (String [] args){

        // ArrayList <Integer> list = new ArrayList<>();
        // // generics is the type inside angle bracket <>, which is supposed to be non primitive data type
        // // this is also called parameterized type
        // list.add(45);
        // list.get(0);
        // list.set(0, 56);
        // list.size();
        // list.clear();

        // CustomGenArrayList list2 = new CustomGenArrayList();
        // list2.add(4);
        // list2.add(5);
        // list2.add(6);

        // for (int i = 0; i < 16; i++) {

        //     list2.add(i * 2);

        // }

        // list2.add(4);
        // list2.add(5);
        // list2.add(6);

        // System.out.println(list2);

        CustomGenArrayList<Integer> list3 = new CustomGenArrayList<>();
        list3.add(45);
        
        for (int i = 0; i < 16; i++) {

            list3.add(i * 2);

        }

        System.out.println(list3);
        
    }

    
}