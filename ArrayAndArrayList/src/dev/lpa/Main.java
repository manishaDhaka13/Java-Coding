package dev.lpa;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] originalArray = new String[]{"First","Second","Third"};
        var originalList = Arrays.asList(originalArray);
        // Arrays.asList() take array as argument
        // and return a list backed by array
        // means if we change using list then array will also change
        // array is not resizable means list that is backed by array is also
        // not resizable but mutable means we can change the value stored in Array
        // but we can use list method on list crated by this method

        System.out.println(Arrays.toString(originalArray));
        System.out.println(originalList);
       // originalList.add("fourth"); throw a Exception UnsupportedOperationException
      //  originalList.remove(1);  throws a Exception UnsupportedOperationException
         originalList.set(1,"one");
        System.out.println(originalList);
        System.out.println(Arrays.toString(originalArray));
        originalList.sort(Comparator.naturalOrder());  // capital alphabet value is less then lower
        System.out.println(originalList);
        System.out.println(Arrays.toString(originalArray));

        List<String> newList = Arrays.asList("Sunday", "Monday","Tuesday"); // here the variable argument passed make a array then it converted to List
        System.out.println(newList);


    }
}
