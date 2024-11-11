import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        boolean isValid =false;
        int sum=0;
        int counter=1;
        while(counter<=5) {
            System.out.println("Enter number #"+counter);
            try {
                int number = Integer.parseInt(scanner.nextLine());
                sum += number;
                counter++;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid number");
            }
        }
        System.out.println("sum is "+sum);
        minAndMax();
    }

    public static void minAndMax(){
        Scanner scanner=new Scanner(System.in);
        double max=0;
        double min=0;
        int count=0;
        while(true) {
            System.out.println("enter a number ");
            try {
                double number = Double.parseDouble(scanner.nextLine());
                count++;
                if(min==0|| number<min){
                    min=number;
                }
                if(max==0|| number>max){
                    max=number;
                }
            }
            catch(NumberFormatException nfe){
                break;
            }
        }
        if(count>0){
        System.out.println("the minimum number enterd is "+min);
        System.out.println("the maximum number  is "+max);}
        else{
            System.out.println("no valid number is enterd");
        }
    }
}
