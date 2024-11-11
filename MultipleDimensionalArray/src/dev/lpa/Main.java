package dev.lpa;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[][] array2=new int[4][4];  // 2 dimensional array
        System.out.println(Arrays.toString(array2));   // [[I@65ab7765, [I@1b28cdfa, [I@eed1f14, [I@7229724f]

        System.out.println("array2.length = "+ array2.length); // array2.length = 4
        for(int[] outer :array2){
            System.out.println(Arrays.toString(outer));  // now it will take one inner array at a time and print the element of it;
        }

        for(int i= 0 ; i<array2.length; i++){
            var innerArray = array2[i];   // var will determine that it is integer array
            for(int j=0; j<innerArray.length; j++){
                System.out.print(array2[i][j] +" ");   // i for row j for column
            }
            System.out.println();
        }


        for(var outer : array2){
            for(var element : outer){
                System.out.print(element +" " );
            }
            System.out.println();
        }


        // to print multiDimensional array we use Arrays.deepToString() method

        System.out.println(Arrays.deepToString(array2));        //[[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]]

        for(int i=0; i< array2.length;i++){
             var innerArray = array2[i];
            for(int j=0; j< innerArray.length ; j++){
                array2[i][j] = (i*10)+(j+1);
            }
        }
        System.out.println(Arrays.deepToString(array2));

        array2[1] =new int[]{10,20,30};
        System.out.println(Arrays.deepToString(array2));
       // array2[1] = {10,20,30};  // error we can't use array initailizer  like this we have to use new int[]

        Object[] anyArray = new Object[3];
        System.out.println(Arrays.deepToString(anyArray));    // [null, null, null]

        anyArray[0] = new String[] {"a", "b", "c"};
        System.out.println(Arrays.deepToString(anyArray));

        anyArray[1] = new String[][] {   // because anyArray refernce type is Object
                {"1" ,"2"},
                {"3","4","5"},
                {"6","7","8"}

        };
       System.out.println(Arrays.deepToString(anyArray));
       anyArray[2] =new int[2][2][2];
        System.out.println(Arrays.deepToString(anyArray));

        for(Object element : anyArray){
            System.out.println("Element type = "+ element.getClass().getSimpleName());
            System.out.println(" element toString() "+ element);
            System.out.println(Arrays.deepToString((Object []) element));  // compiler does not know that element is a array so we have to cast it to Object[] to avoid error

        }

        anyArray[2] ="hello";
        System.out.println(Arrays.deepToString(anyArray));  // it will work
       // for(Object element : anyArray){
         //   System.out.println("Element type = "+ element.getClass().getSimpleName());
           // System.out.println(" element toString() "+ element);
            //System.out.println(Arrays.deepToString((Object []) element));  // compiler does not know that element is a array so we have to cast it to Object[] to avoid error

        // the above Arrays.deepToString((Object []) element ) will throw a exception because we try to cast a string to a array  of object


        }
    }

