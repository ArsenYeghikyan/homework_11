package myarray;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MyArray myArray = new MyArray();
        System.out.println(myArray);
        System.out.println(myArray.getSize());
        System.out.println("Input elements count: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        for (int i = 0; i < size; ++i) {
            int value = scanner.nextInt();
            myArray.addElement(value);
        }
        System.out.println(Arrays.toString(myArray.getArr()));



        myArray.remove();
        myArray.remove();
        myArray.remove();
        myArray.remove();
        System.out.println(Arrays.toString(myArray.getArr()));
//
//        System.out.println(myArray.getSize());
//        myArray.addElement(4);
//        myArray.addElement(2);
//        myArray.addElement(7);
//        System.out.println(myArray);
//        System.out.println(myArray.getSize());
//        System.out.println(Arrays.toString(myArray.getArr()));



    }
}