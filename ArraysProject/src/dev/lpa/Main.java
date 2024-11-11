package dev.lpa;

import java.util.Arrays;   // importing the class to use Arrays static method

public class Main {
    public static void main(String[] args) {
        int[] myIntArray = new int[10];         // java array is a specialized class so new keyword create a new array
                                       // we use array to manage many item of the same type
        // int [] myArray = new int [10] ; is also right      // array can be  collection of primitive type data or class data
        // every array variable is a reference      // new create a new array object
        // when we assign a  object to variable it become a refernce
        // array size is fixed   // index start with 0
        myIntArray[5] = 50;

        // myIntArray = 45.0   // error double can't assign to int

        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;
        System.out.println(myDoubleArray[2]);

        System.out.println("my double array at index =2 " + myDoubleArray[2]);    //3.5


        //anomynus(small form) array initializer

        int[] firstTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};  // we can only use this with declaration statement
        System.out.println("first = " + firstTen[0]);
        int arrayLength = firstTen.length;     // length of array
        System.out.println("array length is = " + arrayLength);
        //System.out.println("last = "+firstTen[arrayLength]);  // ArrayIndexOutOfBoundException throw
        System.out.println("last = " + firstTen[arrayLength - 1]);   // index should be int // result of expression in[] should be int

        int[] newArray;
        //newArray ={1,2,3,4,5};   // error anomynus array initializer like this is not allowed here

        // array initializer
        // int[] array1=new int[]{5,4,3,2,1};  is right
        newArray = new int[]{5, 4, 3, 2, 1};

        for (int i = 0; i <= newArray.length - 1; i++) {
            System.out.print(newArray[i] + " ");
        }
        System.out.println();

        // array is a class and inherit from java.lang.Object

        int[] newArray1 = new int[5];
        for (int i = 0; i < newArray1.length; i++) {
            System.out.print(newArray1[i] + " ");   // default value for number is zero
            // for class it's null in uninitailized array  // for boolean it's false
        }
        System.out.println();
        for (int i = 0; i < newArray1.length; i++) {
            newArray1[i] = newArray1.length - i;
        }
        for (int i = 0; i < newArray1.length; i++) {
            System.out.print(newArray1[i] + " ");
        }

        // enhanced for loop "for each loop"
        // it process one element of array at a time from first to last element of array

        // for(decalarition:collection){
    //}

        System.out.println();
        // for each loop
        for(int element :newArray1){
            System.out.print(element + " ");
        }

        System.out.println();
        System.out.println(newArray1);  //[I@568db2f2  I for int array ; because it does not write toString method
        // java provides helper class java.util.Arrays for other functionality method
        // These are class method not instance method


        System.out.println(Arrays.toString(newArray1));   // [5, 4, 3, 2, 1]

        // assigning a array to object'
        Object objectVariable = newArray1;
        if(objectVariable instanceof int[]){
            System.out.println("objectVariable is reaaly ant int array");
        }

        Object[] objectArray = new Object[3];   // array of many different types
                                                // array are type of object
        objectArray[0]="hello";
        objectArray[1]=new StringBuilder("world");
        objectArray[2]=newArray1;   // nested array
    }
}
