package objectOrientedProgramming.oop6.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {
    
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;  // also working as index value
    private int DOUBLE = DEFAULT_SIZE;  // we are using another varriable for doubling up the size of array


    public CustomArrayList() {

        this.data = new int[DEFAULT_SIZE];

    }

    public int remove (){
        int removed = data[size--]; // first give the value then decrement it
        return removed;
    }

    public int get (int index){
        return data[index];
    }

    public void set (int index, int value){

        data[index] = value;
    }

    public int size(){
        // this is not the actual size of the array, it is the size of element in the array
        return size;
    }

    public void add (int num){
        if(isFull()){

            resize();
            
        }

        data[size++] = num; // here size is post incremented!
    }


    private void resize() {
        int[] temp = new int[DOUBLE = DOUBLE * 2];

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
        return "CustomArrayList [data=" + Arrays.toString(data) + ", size=" + size + "]";
    }


    public static void main (String [] args){

        ArrayList <Integer> list = new ArrayList<>();
        // generics is the type inside angle bracket <>, which is supposed to be non primitive data type
        // this is also called parameterized type
        list.add(45);
        list.get(0);
        list.set(0, 56);
        list.size();
        list.clear();

        CustomArrayList list2 = new CustomArrayList();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        for (int i = 0; i < 16; i++) {

            list2.add(i * 2);

        }

        list2.add(4);
        list2.add(5);
        list2.add(6);

        System.out.println(list2);
        
    }

    
}