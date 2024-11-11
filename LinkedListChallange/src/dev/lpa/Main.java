package dev.lpa;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

record places(String name, int distance){
    // we can also create a record for places in place of Town class

}

public class Main {
    public static void main(String[] args){
        LinkedList<Town> placesToVisit = new LinkedList<>();
        LinkedList<places> placesToVisit1 = new LinkedList<>();
        places p1 = new places("Sydeny",0);
        placesToVisit1.add(p1);
        System.out.println("list of record is "+placesToVisit1);
        Town town = new Town("Sydeny",0);
        addToList(placesToVisit,town);
        System.out.println(placesToVisit);
        Town town1 = new Town("Adelaide",1374);
        addToList(placesToVisit,town1);
        System.out.println(placesToVisit);
        Town town3 = new Town("nework",1370);
        addToList(placesToVisit,town3);
        System.out.println(placesToVisit);
        printItineryOfPlaces(placesToVisit);
        inputFromUser(placesToVisit);

    }
    public static void addToList(LinkedList<Town> list, Town town){

            ListIterator<Town> iterator = list.listIterator();
            if(list.isEmpty()){
                list.add(town);
                return;
            }
            while(iterator.hasNext()){
                Town city = iterator.next();
                if(city.getTownName().equalsIgnoreCase(town.getTownName())){
                    System.out.println("the city already exist in list");
                    return ;
                }
                if(town.getDistanceInKm()>= city.getDistanceInKm()){
                    iterator.add(town);
                }
            }
    }
    public static void printItineryOfPlaces(LinkedList<Town> list){
        System.out.println("the city is " + list.get(0).getTownName() + " and the distance from sydeny is "+ list.get(0).getDistanceInKm());
        ListIterator<Town> iterator = list.listIterator(1);
        Town prevCity = list.getFirst();
        while(iterator.hasNext()) {
            var city = iterator.next();
            //System.out.println("the city is " + list.get(i).getTownName() + " and the distance from sydeny is " + list.get(i).getDistanceInKm());
            System.out.println("from " +prevCity.getTownName() +" to "+ city.getTownName());
            prevCity = city;
        }
    }

    public static void inputFromUser(LinkedList<Town> list){
        ListIterator<Town> iterator = list.listIterator();
        Scanner scanner = new Scanner(System.in);
        String  tb= """
               Available Action(Select world or letter ):
                (F)orward
                (B)ackword
                (L)ist Places
                (M)enu
                (Q)uit""";
        System.out.println(tb);
        boolean flag = true;
        boolean forward = true;

        while(flag) {
            if(!iterator.hasPrevious()){
                System.out.println(" Start : "+ iterator.next());
                forward =true;
            }
           else if(!iterator.hasNext()){
                System.out.println("FInal : "+iterator.previous());
                forward =false;
            }
            System.out.print("Enter value- ");
            String input = scanner.nextLine().toUpperCase().substring(0,1);
            switch (input) {
                case "F" : {
                    System.out.println("user wants to go forward ");
                    if(!forward){
                        forward=true;
                        if(iterator.hasNext()){
                            iterator.next();
                        }
                    }
                    if (iterator.hasNext()) {
                        var city = iterator.next();
                        System.out.println("the next town in list is " + city.getTownName() + " and the distance from sydeny is " + city.getDistanceInKm());
                    }
//
                    break;
                }
                case "B" : {
                    System.out.println("user wants to move backword");
                    if(forward){
                          forward =false;
                        if(iterator.hasPrevious()){
                            iterator.previous();
                        }
                    }
                    if (iterator.hasPrevious()) {
                        var city = iterator.previous();
                        System.out.println("the previous town in list is " + city.getTownName() + " and the distance from sydeny is " + city.getDistanceInKm());
                    }
//
                    break;
                }
                case "L" : printItineryOfPlaces(list);
                break;
                case "M" : System.out.println(tb);
                break;
                default:  flag = false;
                break;
            }
        }
    }
}
