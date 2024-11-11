package dev.lpa;   // tree structure in dev - lpa
                  // this class will be included in dev.lpa pakages
                    // package statement should be first statement except than comments
                    // the class written in this can be in only one package
             // package used to organised class

import com.abc.first.Item;
// impoert com.abc.first.&*   // to impoert all the classes in package

public class Main {
    public static void main(String[] args){
        Item item = new Item("burger");

        com.abc.first.Item item1 =new com.abc.first.Item("pizza");
                                 // here com.abc.first.Item is fully quallified class name(FQCN) for Item class
                              // if we use fully quallified class name then we don't have to use import statement
    System.out.println(item);
    System.out.println(item1);
    }
}
