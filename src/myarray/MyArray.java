package myarray;


import java.util.ArrayList;
import java.util.Arrays;


public class MyArray <T extends Number> {
    private int count = 0;

    private static final int DEFAULT_SIZE = 10;

    private T[] myArray;



    public MyArray(T[] myArray) {
        this.myArray = myArray;
    }

    public void addElement(T value) {

        myArray[count++] = value;

        if (count >= myArray.length) {
            myArray = Arrays.copyOf(myArray, myArray.length * 2);
        }


    }

    private int CounterForNotZero() {
        int notZeroCount = 0;

        for (T value : myArray) {
            if (value != null) {

                notZeroCount++;

            }
        }
        return notZeroCount;

    }


    private Object[] removeZero() {
        int index = 0;
        int length = CounterForNotZero();
        Object[] arrayWithoutZero = new Object[length];
        for (T value : myArray) {
            if (value != null) {
                arrayWithoutZero[index] = value;
                index++;
            }
        }
        return arrayWithoutZero;
    }

    public Object[] getArr() {
        return removeZero();
    }

    public int getSize() {
        return myArray.length;
    }

//    public void remove() {
//        int arrayLength = myArray.length;
//        if (arrayLength > 0) {
//
//            myArray = Arrays.copyOf(myArray, myArray.length-1);
//        }
//    }

    @Override
    public String toString() {
        return "myArray " + Arrays.toString(getArr());
    }
}
