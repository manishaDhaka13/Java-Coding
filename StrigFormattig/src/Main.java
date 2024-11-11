public class Main {
    public static void main(String[] args){
        String bulletIt = "print a bulleted list:" + "\n"+ // we have to "\n" unless error
                "\t\u2022  first point"+
                "\t\t\u2022 sub point";
                  // to print string value with all new line and space
        System.out.println(bulletIt);
                // without using \n \t it will print string in same line without extra space
//        String bulletIt = "print a bulleted list:" +  // when we tried to write in next line + operator is used
//                " first point"+
//                " sub point";
       // System.out.println(bulletIt); print :print a bulleted list: first point sub point

        // to print the string with all the spaces and new line we use (exact format we are assigning the string)
        // we use Text Block they are part of java from JDK15
        // starting three ''' should have their own line
        String textBlock = """   
                Print a bulleted list:
                       \u2022 first point
                           \u2022 sub point""";
        System.out.println(textBlock);

        // we can also use Sustem.out.printf method for formatting , it use specifier for this
        // printf help in mostly formatting number in text
        //System.out.format also behave like System.out.printf method
        int age=25;
        System.out.printf("your age is %d ", age);  // printf does not add new line by default
                                                  // the first argument is the string that will be printed to the console
                                                  //other are the value that are used in String
                                                 // %d is a special indicator that is format specifier
                                                  // age value will replace %d in text
        System.out.printf("your age is %d \n",age); // it will add new line after
                                                    // we can replace \n with specifier %n in printf method
        System.out.printf("your age is %d%n",age);
        System.out.printf("your age is %f%n",(float)age);
        System.out.printf("your age is %.2f%n",(float)age); // we can also use pricision in specifier // how many no after decimal
        int yearOfBirth=2023-age;
        System.out.printf("age =%d,Birth year =%d%n", age,yearOfBirth);
        for(int i=1; i<=100000;i*=10){// formatting number pattern
           // System.out.printf("Printing %d %n",i);  //Printing 1
                                                    //Printing 10
                                                    //Printing 100
                                                    //Printing 1000
                                                    //Printing 10000
                                                    //Printing 100000
            System.out.printf("Printing %6d %n",i);// the width will be 6 character now
//            Printing      1
//            Printing     10
//            Printing    100
//            Printing   1000
//            Printing  10000
//            Printing 100000
        }
        // String also have method for formatting
        String formattedString=String.format("Your age is %d%n",age);  // format is a static method of String class

        System.out.println(formattedString);

        formattedString="yor age is %d".formatted(age);
        System.out.println(formattedString);

    }
}
