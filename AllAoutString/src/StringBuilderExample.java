public class StringBuilderExample {
    public static void main(String[] args){
        String helloWorld="Hello"+"World";  //string is immutable object when we perform a operation on it , it crate a new object
        printInformation(helloWorld);                   // and return the refernce to nerw object so to use it we have to assign it
        helloWorld.concat(" and goodbye");
        //StringBuilder builder="Hello"+"World"; // erroe
        StringBuilder builder = new StringBuilder("Hello" + "world"); // StringBuilder is mutable , it will change the existing string object
                                                                     // and return the self refernce so we don't have to assign it to access it
                                                                     // StringBuilder is in a java.lang package
                                                                    // java.lang is imported by default in evdery java file
// StringBuilder has append method for concating
        builder.append(" and goodbye");
        printInformation(helloWorld);
        printInformation(builder);

        StringBuilder emptyStart = new StringBuilder();       // default capacity is 16
        StringBuilder emptyStart32 = new StringBuilder(32);  // 32 is capacity of emptyStart32

                                                                    // it incresed if capacity is greater then it
                              // every time StringBuilder has to increse the capacity it copy the string to another location
        printInformation(emptyStart);
        printInformation(emptyStart32);
        emptyStart.append("a".repeat(17));  // every time StringBuilder has to increse the capacity it copy the string to another location
                                                  // and java reassign automatically to stringbuilder
                                                  // new capacity is determined by JVM
        printInformation(emptyStart);
        emptyStart32.append("a".repeat(17));
        printInformation(emptyStart32);

        StringBuilder builderPlus = new StringBuilder("Hello " + "world");
        builderPlus.append(" and GoodBye");

        builderPlus.deleteCharAt(16).insert(16,'g');
        System.out.println(builderPlus);
        builderPlus.replace(16,17,"G");
        System.out.println(builderPlus);
        builderPlus.reverse();
        System.out.println(builderPlus);
        builderPlus.setLength(7);  // truncating the stringbuilder text value to the 7 character
        System.out.println(builderPlus);


    }

    public static void printInformation(String string){
        System.out.println("string = "+ string);
        System.out.println("Length =  "+string.length());
    }
    public static void printInformation(StringBuilder builder){
        System.out.println("string builder  = "+ builder);
        System.out.println("builder Length =  "+ builder.length());
        System.out.println("builder capacity =  "+ builder.capacity());
    }
}
