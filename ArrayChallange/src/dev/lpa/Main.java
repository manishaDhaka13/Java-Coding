package dev.lpa;

import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));

        int[] secondArray = Arrays.copyOf(firstArray,firstArray.length);
        Arrays.sort(secondArray);   // sort in assending order lowest to highest
        System.out.println(Arrays.toString(secondArray));
        int[] thirdArray = new int[firstArray.length];
        for(int i= 0 ; i<thirdArray.length;i++){
            thirdArray[i]=secondArray[thirdArray.length-1-i];
        }
        System.out.println(Arrays.toString(thirdArray));


    }

    public static int[] getRandomArray(int len){
        Random random = new Random();
        int[] newIntArray = new int[len];
        for(int i=0; i< newIntArray.length;i++){
            newIntArray[i]=random.nextInt(1000);

        }
        return newIntArray;
    }
}
