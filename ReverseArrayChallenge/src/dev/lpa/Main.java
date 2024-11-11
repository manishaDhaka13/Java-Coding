package dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args){

   int[] myIntArray =getRandomArray(5);
      System.out.println(Arrays.toString(myIntArray));
      reverseArray(myIntArray);
      System.out.println(" reverse array is "+ Arrays.toString(myIntArray));
        reverse(myIntArray);
        System.out.println(" reverse array is "+ Arrays.toString(myIntArray));

    }
    private static void reverseArray(int[] array){
        // the method that change calling code data are called mutating method
       // Arrays.sort(array);
        int[] copiedArray =Arrays.copyOf(array,array.length);
        for(int i=0;i<array.length;i++){
            array[i]=copiedArray[array.length-1-i];
        }
    }

    // swapping array
    public static void reverse(int[] array){
        int maxIndex = array.length-1;
        int halfLength =array.length/2;
        for(int i=0 ; i<halfLength;i++){
            int temp= array[i];
            array[i]=array[maxIndex-i];
            array[maxIndex-i]=temp;

        }
    }
    private static int[] getRandomArray(int len){
        Random random = new Random();
        int[] array = new int[len];
        for(int i=0; i< len; i++){
            array[i]=random.nextInt(1000);
        }
        return array;
    }
}
