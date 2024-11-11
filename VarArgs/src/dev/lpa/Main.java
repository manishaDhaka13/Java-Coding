package dev.lpa;

public class Main {

    //public static void main(String[] args){ here String[] args take array as argument

    //}
    public static void main(String... args){   // here this argument take a string or many string / value and process
                                             // them in a array called args
                                         // we can also pass array
 // ... args is called variable argument (Varargs)
        // there can be only one variable argument in a method
        // the variable argument must be the last argument
        System.out.println("Hello world again");
        String[] splitString = "Hello world again".split(" ");
         // split is a String instance method it split String with passing argument (here " ") and create a
        // array of splited parts , array of string
        // it opposite of join() method
        printText(splitString);
        String s= "hello world again";
       // printText(s);  // error incompatible types: java.lang.String cannot be converted to java.lang.String[]
        printTextt(s);
        System.out.println("-".repeat(30));
        printTextt("Hello");
        System.out.println("-".repeat(30));
        printTextt("Hello","world","again");
        printTextt();

        String[] sArray = { "first" ,"second", "third","fourth","fifth"};  // anomynus initializer because right side type is not included
        printTextt(sArray);
        System.out.println(String.join(", ", sArray));
    }

    private static void printText(String[] textList){

        for(String t : textList){
            System.out.println(t);
        }
    }

    //private static void printText(String[] textList){}
    //private static void printText(String... textList){}
    // we can't overload method like this it will give error
    //so we change the name of method
    private static void printTextt(String... textList){  // we can pass a aaray , simple string , many string
                                                     // call this method with no argument

        for(String t : textList){
            System.out.println(t);
        }
    }
}
