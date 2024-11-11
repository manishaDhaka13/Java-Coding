package dev.lpa;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        int[] myIntArray = new int[5];   // new create a new object of array class
        // myIntArray is refernce it hold the address of array in memory

        int[] anotherArray = myIntArray;
        // anotherArray and myIntArray hold the address of same array

        System.out.println(Arrays.toString(myIntArray));
        System.out.println(Arrays.toString(anotherArray));

        anotherArray[0]=1;// it also change myIntArray because they are referencing same array in memory
        modifyArray(myIntArray);    // passing a reference
        System.out.println("after change  myIntArray "+ Arrays.toString(myIntArray));
        System.out.println("after change  anotherArray "+ Arrays.toString(anotherArray));

    }

    private static void modifyArray(int[] array){
        array[2]=2;
    }
}
