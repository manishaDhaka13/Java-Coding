public class Main {
    public static void main(String[] args){
        StringBuilder Builder = new StringBuilder("Hello" );
        printInformation("Hello World");
        printInformation("");
        printInformation("\t \n");  //Length = 3 spaces are count in length
        String helloWorld="Hello World";
        System.out.printf("index of r = %d %n",helloWorld.indexOf('r'));   // 8
        System.out.printf("index of l =%d %n",helloWorld.indexOf('l'));   // from left to right index of first matching char   //2
        System.out.printf("index of l =%d %n",helloWorld.lastIndexOf('l'));// from right to left index of first matching char //9
        System.out.printf("index of l =%d %n",helloWorld.indexOf('l',3)); // from index =3 to end of string first matching
        System.out.printf("index of l =%d %n",helloWorld.lastIndexOf('l',8)); // from index=8 to left side first matching
        System.out.printf("index of l =%d %n",helloWorld.indexOf("World"));  // 6
        String helloWorldLower=helloWorld.toLowerCase();
        if(helloWorld.equals(helloWorldLower)){  // exactly match the value with case
            System.out.println("Value matching exactly") ;
        }
        if(helloWorld.equalsIgnoreCase(helloWorldLower)){
            System.out.println("Value matching ignoring case") ;
        }
        if(helloWorld.startsWith("hello")){
            System.out.println("string start with hello");
        }
        if(helloWorld.endsWith("World")){
            System.out.println("string ends with World");
        }
        if(helloWorld.contains("hello")){
            System.out.println("string contains hello");
        }
        if(helloWorld.contentEquals("Hello World")){   // like a equals() method but also support comparision with StingBuilder
            System.out.println("string matches exactly");
        }
    }
    public static void printInformation(String string){
        int length=string.length();
        System.out.printf("Length = %d%n" , length);
        if(string.isEmpty()){
            System.out.println("string is empty");
            return;
        }
        if(string.isBlank()){
            System.out.println("string just contain spaces means string is blank");
        }
        System.out.printf("first char = %c %n",string.charAt(0)); // index start with 0 in string

        System.out.printf("last char = %c%n ",string.charAt(length-1)); // index that is not vallid will cause run time exception
        System.out.printf("last char = %c%n ",string.charAt(string.length()-1));
    }
}
