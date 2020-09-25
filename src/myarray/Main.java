package myarray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        MyArray<Integer> myArray = new MyArray<>(new Integer[]{1,2,3});
        System.out.println(myArray.getSize());
        myArray.addElement(4);

        System.out.println(myArray.getSize());
        System.out.println(myArray);
//        myArray.remove();
//        myArray.remove();
//        myArray.remove();
        myArray.addElement(8);
//        myArray.remove();
        System.out.println(Arrays.toString(myArray.getArr()));
        myArray.addElement(2);
        myArray.addElement(5);
        System.out.println(Arrays.toString(myArray.getArr()));
//        myArray.remove();
//        myArray.remove();
        myArray.addElement(1);
        myArray.addElement(1);
        myArray.addElement(1);
        myArray.addElement(1);
        myArray.addElement(1);
        myArray.addElement(1);
        myArray.addElement(1);
        myArray.addElement(1);
        myArray.addElement(1);
        myArray.addElement(1);
        myArray.addElement(1);
        myArray.addElement(1);
        myArray.addElement(1);
        myArray.addElement(1);
        myArray.addElement(1);


        System.out.println(Arrays.toString(myArray.getArr()));
        System.out.println(myArray);

    }
}
