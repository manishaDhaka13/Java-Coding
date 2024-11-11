package dev.lpa;

import java.util.Arrays;
import java.util.Random;
public class Main {
    public static void main(String[] args){

        int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));

        // array sort
        Arrays.sort(firstArray);  // sort method does not return anything it sort the actual Array , here firstArray got sorted
        System.out.println(Arrays.toString(firstArray));

        // set initial value of array besides default value   Array.fill()  it fill the actual array

        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));  //[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        Arrays.fill(secondArray,5);
       System.out.println(Arrays.toString(secondArray));   //[5, 5, 5, 5, 5, 5, 5, 5, 5, 5]

        // if we don't want to change original array then we make the copy of array and make change in copy of array without affecting original array

        // Arrays.copyOf()  crate a new Array

        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);   // it will create a new array with second argument length and copy the thirdArray
                                                                         // Arrays.copyOf(originalArray, size of copied array)
        // we want exact copy so size is equal to thirdArray.length
        System.out.println(Arrays.toString(fourthArray));
        Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(fourthArray));
        System.out.println(Arrays.toString(thirdArray));

        int[] smallArray = Arrays.copyOf(thirdArray,5);   // it will copy thirdArray to size 5 (index = 0 to 4 will copied)
                                              // it will copy partial part of array
        System.out.println(Arrays.toString(smallArray));

        int[] largeArray = Arrays.copyOf(thirdArray, 15);   // it will copy full thirdArray and remaining  initialized with default value
                                                                // copy Array with extra elements

        System.out.println(Arrays.toString(largeArray));

        // going element of array one  by one for searching is called sequential search

        // when we sort array then divide it into two half and then test the value at boundary part and based on that split again and search in splited part
        // this type of searching called intervel searching
        // binary search is a type of interval searching

        // for binarySearch it's necessary to array has to be sorted before applying binary search
        // the static method binarySearch is on the Arrays class
        // if there is duplicate value in array , there is no guarantee which one it will match on
        // element must be comparable
        // this method return the position of matches , if no match found then -1 return

        String[] sArray = {"Able" ,"jane", "Mark", "ralph", "david" };
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        if(Arrays.binarySearch(sArray, "Mark")>=0){
            System.out.println("found Mark in the list");
        }

        // comparing two array equal or not

        int[] s1 ={1,2,3,4,5};    // arrays are refernce type s1 (refernce) hold the address of array
                                  // primitive type data when assign to each other -> copy the value they are value type
                            // refernce type when assigned to other copied the address and point to one address
                            // int[] s3 =s1 then s1 and s3 point to same array

        int[] s2 ={1,2,3,4,5};
         //String[] s3 ={"hello"};
        if(Arrays.equals(s1,s2)){    // the types of array should match unless it will give error
            System.out.println("Arrays are equal");

        }
        else{
            System.out.println("arrays are not equal");
        }



    }
    public static int[] getRandomArray(int len){
        Random random = new Random();    // create a new instance of Random class  // it's in java.util library  // Random class has method on it to return a random number

        int[] newInt = new int[len];
        for(int i=0; i<len;i++){
            //newInt[i]=random.nextInt(); // it will give random number to 0 to maximum value
        newInt[i]=random.nextInt(100);  // it will give random number between 0 to 99 ; it excludes 100 the argument callled exclusive upper bound
        }
        return newInt;
    }
}
