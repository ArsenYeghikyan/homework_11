package myarray;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
Implement MyArray class (unlike the arrays that can store the specified number of items), MyArray should be able to keep any number of integers.
Methods
    - add adds an element
    - remove removes the last element
 */
public class MyArray {
    public int count = 0;
    private static final int DEFAULT_SIZE = 10;


    int[] oldArray = new int[DEFAULT_SIZE];




    public static void main(String[] args) {

        MyArray myArray = new MyArray();
//        System.out.println(arr);
//        System.out.println(arr.getSize());
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        for (int i = 0; i < size; ++i) {
            int value = scanner.nextInt();
            myArray.addElement(value);
        }
        System.out.println(Arrays.toString(myArray.getArr()));
//        System.out.println(arr.getSize());
        myArray.remove();
        myArray.remove();
        myArray.remove();
        myArray.remove();
        System.out.println(Arrays.toString(myArray.getArr()));
//        arr.remove();
//        arr.remove();
//        System.out.println(arr);
//        System.out.println(arr.getSize());
//        arr.add(4);
//        arr.add(2)
//        arr.add(7);
//        System.out.println(arr);
//        System.out.println(arr.getSize());
//        System.out.println(Arrays.toString(myArray.getArr()));


    }


    public void addElement(int value) {


        if (count >= oldArray.length) {
            oldArray = Arrays.copyOf(oldArray, oldArray.length * 2);
        }
        oldArray[count++] = value;


    }

    public int[] getArr() {

        return oldArray;
    }


    public void remove() {
oldArray=Arrays.copyOf(oldArray,oldArray.length-1);

    }


}
