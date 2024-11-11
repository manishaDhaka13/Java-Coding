import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int currentYear=2022;
        try {
            getInputFromConsole(currentYear);
        }
        catch (NullPointerException e){
           getInputFromScanner(currentYear);
        }
        System.out.println("helloooooooooooo");
    }

        public static void getInputFromConsole ( int currentY){

        String name = System.console().readLine("whats your name ");
        System.out.println("hi my name is  " + name);
        String yearOfBirth = System.console().readLine("whats your year of birth "); // System.console() does not work in Intellij
        // we use terminal for this
        // IntelliJ throw a Exception for System.console
        int age = currentY - Integer.parseInt(yearOfBirth);
        System.out.println("your age is " + age);
    }

    public static void getInputFromScanner(int currentYear1){
        System.out.println("whats your name ");
        Scanner scanner= new Scanner(System.in);
        String name= scanner.nextLine();
        System.out.println("Hi , my name is "+ name);
        System.out.println("whats your year of birth ");
        boolean isValid=false;
        int age= 0;
        do{
            System.out.println(" enter a year of birth >=" +(currentYear1-125) + " and <= "+ currentYear1);
            try {
                age = checkData(currentYear1, scanner.nextLine());
            }
            catch(NumberFormatException e){
                System.out.println("character are not allowed");
            }
            if(age>=0){
                isValid=true;
            }
        }while(!isValid);

        System.out.println("your age is "+ age);
    }

    public static int checkData(int currentYear, String yearOfBirth){
        int dob=Integer.parseInt(yearOfBirth);
        if(dob< (currentYear-125)||(dob> currentYear)){
            return -1;
        }
        return (currentYear-dob);

    }
}
