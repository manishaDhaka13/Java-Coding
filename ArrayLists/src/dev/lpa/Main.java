package dev.lpa;
// Array is not resizable so we have other library in java for this
// list in java is a type of interface
// ArrayList is a class that inherit from list

// ArrayList is resizable   // ArrayList is mutable
//ArrayList is a class that really maintain an array in memory that is actually bigger then what we need
//it keep track of capacity which is the actual size of array in memory
// it also keep track of the element that have been assigned , which is size of ArrayList
// element are added to ArrayList and capacity may need to grow , this all happen automatically , behind the scene
// ArrayList also start with index 0
import java.util.ArrayList;
import java.util.Arrays;

 record GroceryItem(String name, String type, int count ){   // the value in record does not change after we set it

      public GroceryItem(String name){
          this(name , "DIARY", 1);    // record always have implicit default constructor
      }

      public String toString(){
          return String.format("%d %s in %s" ,count, name.toUpperCase(),type);
  }
}


public class Main {
    public static void main(String[] args ){

        Object[] groceryArray = new Object[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples","PRODUCE",6);
        groceryArray[2] = "5 Oranges";
        // grocerArray is a object array so it can also take String
        System.out.println(Arrays.toString(groceryArray));  // without override toString in record[GroceryItem[name=milk, type=DIARY, count=1], GroceryItem[name=apples, type=PRODUCE, count=6], 5 Oranges]
                                                  // override toString [1 MILK in DIARY, 6 APPLES in PRODUCE, 5 Oranges]
        GroceryItem[] groceryArray1 = new GroceryItem[3];
        groceryArray1[0] = new GroceryItem("milk");
        groceryArray1[1] = new GroceryItem("apples","PRODUCE",6);
        // groceryArray1[2] = "5 Oranges"; //it's give error
        // grocerArray is a GroceryItem array so it can  take GroceryItem
        groceryArray1[2] =new GroceryItem("oranges","PRODUCE",5);
        System.out.println(Arrays.toString(groceryArray1));


        // ArrayList

        ArrayList objectList = new ArrayList();   // raw use of parameterized class // like when we create a object array it will get assign to any type of data
                                                 // if we don't specify type of ArrayList it will take Object by default
        objectList.add(new GroceryItem("Butter"));
        objectList.add("Yogurt");

        //ArrayList<GroceryItem> groceryList = new ArrayList<GroceryItem>();   // <> angle brackets , in this we declare the type of elements in Array
                                                                            //list to be
        // compiler can do compile type checking that assign element is type of GroceryItem
        // when the type of ArrayList is same in decalartion and initiazation part we can simply use <> , the empty angle brackets also called diamond operator
        ArrayList<GroceryItem> groceryList = new ArrayList<>();

        groceryList.add(new GroceryItem("Butter"));
        //groceryList.add("Yogurt"); // compiler will give error because it only want GroceryItem

        ArrayList<GroceryItem> groceryList1 = new ArrayList();  // if we forget <> diamond operator then we are using raw parameterized class  // it will take values that
                                                               // may be subclass/type  of GroceryItem like String is a type of Object
        groceryList1.add(new GroceryItem("Butter"));
        //groceryList1.add("Yogurt"); // compiler will give error because it only want GroceryItem

        // add() method that add item to simply in the end of list

        //for ArrayList when we want to print it we simply used it's instance name
        System.out.println(groceryList);
        groceryList.add(new GroceryItem("curd"));  // add item to the end of list
        groceryList.add(new GroceryItem("milk"));
        groceryList.add(new GroceryItem("oranges","PRODUCE", 5));
        groceryList.add(0, new GroceryItem("apples", "PRODUCE", 6));   // first argument is index where the item will be insert moving other element

        System.out.println(groceryList);
        // set method will replace the item with new item at  index

        groceryList.set(1, new GroceryItem("banana", "PRODUCE", 6));


        System.out.println(groceryList);

        // remove item in ArrayList

        groceryList.remove(1);
        System.out.println(groceryList);


    }
}
