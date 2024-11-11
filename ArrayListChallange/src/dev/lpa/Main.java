package dev.lpa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ArrayList<String> groceryList= new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        while(flag){
            String textBlock = """
                    enter 0 to shutdown
                    enter 1 to add item
                    enter 2 to remove item
                    enter other than 1 , 2 to quit""";
            System.out.println(textBlock);
            int number = Integer.parseInt(scanner.nextLine());
            if(number==0){
                scanner.close();
                flag =false;
            }
            else if(number==1){
                System.out.println("enter item  to add(comma delimited list");
                String[] addItem = scanner.nextLine().split(",");
                for(String item:addItem){
                    String trimed = item.trim();  // to remve whitespace // whitespace has higher precedence when sorting than letter
                    if(!groceryList.contains(trimed)){
                    groceryList.add(trimed);
                    }
                    else{
                        System.out.println(item +" is already in list duplicte item is not allowed");
                    }
                }

                printSortedArrayList(groceryList);
            }
            else if(number==2){
                System.out.println("enter item  to remove(comma delimited list");
                String[] removeItem = scanner.nextLine().split(",");
                for(String item:removeItem){
                    String trimed = item.trim();
                    groceryList.remove(trimed);

                }

            }
            else{

                flag = false;
            }

         printSortedArrayList(groceryList);
        }

    }
    public static void printSortedArrayList(ArrayList<String>  arrayList){
        arrayList.sort(Comparator.naturalOrder());
        System.out.println(arrayList);
    }
}
