package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreList {
    public static void main(String[] args){
        String[] items ={"apples","bananas", "milk", "eggs"};

        List<String> list = List.of(items);   // List.of() is a static method on List ; it's a factory(return new instance) method that returns a List of String element back
            // List.of()  this method transfer array of String to List of String
        System.out.println(list);    //[apples, bananas, milk, eggs]
        // List is not ArrayList
          //  list.set(1,"hello"); it's imutable so we can't change the value in it
        System.out.println(list.getClass().getName());  //java.util.ImmutableCollections$ListN
                                                       // list is a imuttable list // we can't add item in it
       // list.add("yogurt");  // Exception in thread "main" java.lang.UnsupportedOperationException

        // but we can create ArrayList using List
        // ArrayList is mutable and Array is also mutable means we can change the value but we can't add or delete element

        ArrayList<String> groceries = new ArrayList<>(list);  // it will take the element of list and make a ArrayList of item
                                                               // now ArrayList is mutable so we can add element in it (resize it)
        groceries.add("yogurt");
        System.out.println(groceries);

        System.out.println(groceries.getClass().getName());   //java.util.ArrayList

        ArrayList<String> nextList = new ArrayList<>(
                List.of("pickles","musterd","cheese")
        );

        System.out.println(nextList);
        groceries.addAll(nextList);   // adding ArrayList nextList to ArrayList grocerries
        System.out.println(groceries);   // [apples, bananas, milk, eggs, yogurt, pickles, muserd, cheese]

        // getting  a element in ArrayList

        System.out.println("Third Item = " +groceries.get(2));

        // searching a item in ArrayList

        if(groceries.contains("musterd")){
            System.out.println("List contains musterd");
        }
        groceries.add("yogurt");
        System.out.println("first = "+groceries.indexOf("yogurt"));
        System.out.println("last = " +groceries.lastIndexOf("yogurt"));

        // remove element

        System.out.println(groceries);
        groceries.remove(1);
        System.out.println(groceries);
        groceries.remove("yogurt");  // removing first match element remove // single element remove
        System.out.println(groceries);
        groceries.add("eggs");
        System.out.println(groceries);
        groceries.removeAll(List.of("apples","eggs"));
        System.out.println(groceries);

        groceries.retainAll(List.of("apples","milk","musterd", "cheese"));  // remove other element other than mentioned from ArrayList
        System.out.println(groceries);

        // removing all element from ArrayList

        groceries.clear();  // remove all element
        System.out.println(groceries);
        System.out.println("IsEmpty = "+ groceries.isEmpty());

        groceries.addAll(List.of("apples","milk","musterd","cheese"));

        groceries.addAll(Arrays.asList("eggs", "pickles","musterd","ham"));  // Arrays.asList() is a factory method that return a special instance of a list
             // that is not resizable but mutable
        System.out.println(groceries);

        // sorting ArrayList

        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);
        groceries.sort(Comparator.reverseOrder());  // sort in reverse order alphabatically
        System.out.println(groceries);


        // creating a Array from ArrayList

        var grocerryArray= groceries.toArray(new String [groceries.size()]);    // return a new String array with lenth grocarry.size() having grocarry element in it
        // if passed size is greater then ArrayList size then default value will be filled
        // if size is less then ArrayList size then Array with size equal to ArrayList size will be returned with ArrayList element
        System.out.println(Arrays.toString(grocerryArray));



    }
}
//