public class StringMethods {
    public static void main(String[] args){
        String birthDate = "25/11/1982";
        int startingIndex=birthDate.indexOf("1982");  //6
        System.out.println("startingIndex = " + startingIndex);
        System.out.println("birth year = "+birthDate.substring(startingIndex));   // retrive a string starting at the index pass to remaining string  //1982
        System.out.println(" month "+birthDate.substring(3,5));   // retriev string from index 3 to  5 (excluding 5)  // 11

        String newDate=String.join("/","15","04","1995");  // String static method join elements with delimeter  // 15/04/1995
        System.out.println("newDate = "+newDate);
        newDate="25";
        newDate=newDate.concat("/");
        newDate=newDate.concat("11");
        newDate=newDate.concat("/");   // String object is immutable so each operation will create a new object
        newDate=newDate.concat("1982");
        System.out.println("new date is = "+newDate);
        newDate="25"+"/"+"11"+"/"+"1982";  // compiler do byte code of full string // it recognised that it's a single string
        System.out.println("new date isss = "+newDate);
        newDate="25".concat("/").concat("11").concat("/").concat("1925"); // each concat create a new statement but it not assigned to variable


        // replace method
        System.out.println(newDate.replace('/','-'));// replace every / with char -    25-11-1925
        System.out.println(newDate.replace("25","12")); // replace every 25 with 12    12/11/1912
        System.out.println(newDate.replaceFirst("/","-")); //replace first string / with -    25-11/1925
        System.out.println(newDate.replaceAll("/","-")); // replace all string / with -   25-11-1925

        // repeat() method

        System.out.println("Abc\n".repeat(3));   //Abc
                                                       //Abc
                                                       //Abc
        System.out.println("-".repeat(20));



        //indent() method

        System.out.println("Abc\n".indent(5));   //     Abc   // give 5 space before Abc indent by 5 spaces
        System.out.println("Abc\n".repeat(3).indent(8));
        System.out.println("     Abc\n".repeat(3).indent(-2));  // it will remove space because indent bym-2


    }
}
