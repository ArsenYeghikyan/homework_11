package myarray;


import java.util.Arrays;


public class MyArray {
    private int count = 0;
    private static final int DEFAULT_SIZE = 10;

    private int[] myArray;


    public MyArray(int capacity) {

        myArray = new int[capacity];
    }

    public MyArray() {
        myArray = new int[DEFAULT_SIZE];
    }


    public void addElement(int value) {

        myArray[count++] = value;

        if (count >= myArray.length) {
            myArray = Arrays.copyOf(myArray, myArray.length * 2);
        }


    }

    private int CounterForNotZero() {
        int notZeroCount = 0;

        for (int value : myArray) {
            if (value != 0) {

                notZeroCount++;

            }
        }
        return notZeroCount;

    }


    private int[] removeZero() {
        int j = 0;
        int length = CounterForNotZero();
        int[] newArray = new int[length];
        for (int value : myArray) {
            if (value != 0) {
                newArray[j] = value;
                j++;

            }

        }

        return newArray;
    }

    public int[] getArr() {
        return removeZero();
    }

    public int getSize() {
        return myArray.length;
    }

    public void remove() {

        myArray = Arrays.copyOf(myArray, myArray.length - 1);

    }

    @Override
    public String toString() {
        return "myArray " + Arrays.toString(myArray);
    }
}
