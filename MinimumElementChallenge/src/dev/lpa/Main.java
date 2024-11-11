package dev.lpa;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int[] myIntArray = readIntegers();
        System.out.println(Arrays.toString(myIntArray));
        int minimum = findMin(myIntArray);
        System.out.println("minimum value is "+minimum);

    }

    private static int[] readIntegers(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a list of Integer , seperated by commas");
        String input = scanner.nextLine();
        String[] splits =input.split(",");
        int[] value = new int[splits.length];
        for(int i=0; i< splits.length;i++){
            value[i]=Integer.parseInt(splits[i]);
        }
        return value;

    }
    private static int findMin(int[] array){
        int min= Integer.MAX_VALUE;
        for(int element : array){
            if(element<min){
                min = element;
            }
        }
        return min;
    }
}

