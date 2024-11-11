package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    // ArrayList and LinkList does not support primitive type data as collection type
    // each primitive have their Wrapper class

    // creating a Wrapper class instance of primitive with it's value called Boxing
    //  each wrapper class supports a method to return the primitive value it contains
    // this called UnBoxing

    public static void main(String[] args){

        Integer boxedInt = Integer.valueOf(15);   // Integer belong to java.lang.Integer
                                                    // valueOf is a factory method on Integer that return a
                                                    // Integer class instance which data value is 15
                                                   // prefered but unneceaaary
        System.out.println("boxedInt = "+boxedInt);   // 15
        //Integer deprecatedBoxing = new Integer(15);   // it's error but the code can run  but don't use this in future may not supported // depricated since JDK 9
                                                          // no longer use

        // unboxing
        int unboxedInt = boxedInt.intValue();   // it will return the data value of instance variable of wrapper class  // unnecessary unboxing
        System.out.println("unboxedInt = "+unboxedInt);      //15


        //autoBoxing

        Integer boxedInt1 = 15;  // assigning a primitive type to Integer wrapper class refernce ; java will automatically do the boxing and create a Integer instance
                                 // with value of 15 and assign the instance to boxedInt1
        System.out.println("boxedInt1 = "+boxedInt1);
        System.out.println(boxedInt1.getClass().getName());  // java.lang.Integer
        int unboxedInt1 = boxedInt1;   // automatically unboxing
        //System.out.println(unboxedInt1.getClass().getName());  // compile error bcoz unboxedInt1 is primitive type not a class instance
        System.out.println("unboxedInt1 = "+unboxedInt1);

       Double resultBox = getLiteralDoublePrimitive();
       System.out.println(resultBox.getClass().getName());
       double resultUnbox = getDoubleObject();
       System.out.println(resultUnbox);

       Integer[] wrapperArray = new Integer[5];
       wrapperArray[0] =50;  // autoBoxing
       System.out.println(Arrays.toString(wrapperArray));  // [50, null, null, null, null]
        System.out.println(wrapperArray[0].getClass().getName());  // java.lang.Integer
        Character[] characterArray = {'a','b','c','d'};   // JVM autoBox each value
        System.out.println(Arrays.toString(characterArray));
        var ourList = getList(1,2,3,4,5);  // it take the primitive value but parameter type is Integer so autobox the value
                                                  // so in factory method we can use primitive value and wrapper instance interchangibaly
        var ourList1 = List.of(1,2,3,4,5);   // here the ourList1 is a list of Integer Wrapper class  // LinkList does not support primitive value as collection type
                                           // but when we pass primitive value in factory method then they automatically convert to Integer wrapper class
                                          // and List.of give a list with Integer wrapper class as collection type
        System.out.println(ourList);
        System.out.println(ourList1.get(1).getClass().getName());


    }
    private static double getLiteralDoublePrimitive(){
        return 100.0;
    }
    private static Double getDoubleObject(){
        return Double.valueOf(100.0);
    }

    //autoBoxing and unboxing supported at method parameter type and return type in method itself

    private static int returnAnInt(Integer i){
        return i;  // java unbox the i to return a primitive value
    }
    private static Integer returnAnIntegerObject(int i){
        return i; // auto boxing
    }

//    private static ArrayList<Integer> getList(int ...vargs){
//        ArrayList<Integer> aList = new ArrayList<>();
//        for(int i : vargs){
//            aList.add(i);   // autoboxing automatic
//         }
//        return aList;
//    }
    private static ArrayList<Integer> getList(Integer ...vargs){
        ArrayList<Integer> aList = new ArrayList<>();
        for(int i : vargs){
            aList.add(i);   // autoboxing automatic
        }
        return aList;
    }



}

