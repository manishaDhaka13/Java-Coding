package dev.lpa;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    // An ArrayList is implement on top of array , behind the scene the address of value in ArrayList is stored
    // in Array

    // LinkedList is a doubly linked list
    // both implement list method but linkedList also implements the Queue and Stack method as well
    // queue is FIFO structure
    // stack is LIFO structure
    // in stack the the first top element of Stack is first element of LinkedList
    // we have to import java.util.LinkedList to use LinkedList
    public static void main(String[] args) {
        //LinkedList<String> placesToVisit = new LinkedList<>();
        var placesToVisit = new LinkedList<String>();

          placesToVisit.add("sydney");  // add to end of list
          placesToVisit.add(0,"Canberra");
          System.out.println(placesToVisit);
          addMoreElements(placesToVisit);
          System.out.println(placesToVisit);
         removeElements(placesToVisit);
         System.out.println(placesToVisit);
         addMoreElements(placesToVisit);
         System.out.println(placesToVisit);
         geetingElements(placesToVisit);
         System.out.println(placesToVisit);
         printItinerary(placesToVisit);
        System.out.println(placesToVisit);
        printItinerary2(placesToVisit);
        System.out.println(placesToVisit);
        printItinerary3(placesToVisit);
        testIterator(placesToVisit);
        testIterator1(placesToVisit);
    }

    // LinkedList method

    private static void addMoreElements(LinkedList<String> list){
        list.addFirst("Drawin");  // only on LinkedList not on ArrayList
        list.addLast("Hobart");

        // Queue Method
        list.offer("Melbourne");   // add to end of Linkedlist
        list.offerFirst("Brisbane"); // add to start of Linkedlist
        list.offerLast("Toowoomba");  // add to end of Linkedlist

        // Stack method

        list.push("Alice Springs");  // add element to start of list

    }
    private static void removeElements(LinkedList<String> list){
        list.remove(4);
        list.remove("Brisbane");

        System.out.println(list);
        String s1= list.remove(); // no argument only on LinkedList  // remove first element in LinkedList //  remove element from start of LinkedList // return remove element
       System.out.println(s1 + " was removed");
       System.out.println(list);
        String s2= list.removeFirst(); // remove first element
        System.out.println(s2 + " was removed");
        System.out.println(list);
        String s3= list.removeLast(); // remove last element
        System.out.println(s3 + " was removed");
        System.out.println(list);

        // Queue / Deque poll methods

        String p1 = list.poll();  // remove the first element
        System.out.println(p1 + " was removed");
        System.out.println(list);
        String p2 = list.pollFirst();  // remove the first element
        System.out.println(p2 + " was removed");
        System.out.println(list);
        String p3 = list.pollLast();  // remove the last element
        System.out.println(p3 + " was removed");

        // pushing the element
        list.push("Sydeny");
        list.push("Brisbane");
        list.push("Canberra");
        System.out.println(list);

        // pop method
        String p4 = list.pop(); // remove first element
        System.out.println(p4+ " was removed");
        System.out.println(list);

    }
    private static void geetingElements(LinkedList<String> list){
        System.out.println(" 5th element of list "+list.get(4));
        System.out.println("First Element = "+list.getFirst());   // LinkedList method to get first element
        System.out.println("Last element = "+list.getLast());     // LinkedList method to get last element

        System.out.println("Darwin is at position "+ list.indexOf("Darwin"));
        System.out.println("Darwin is at position "+ list.indexOf("Melbourne"));

        //  Queue retrieval method FIFO

        System.out.println("Element from element() = "+ list.element());    // list.element() retrieve/get  starting element
        System.out.println(list);

        // Stack retrieval Method LIFO

        System.out.println(" Element from peek() = " + list.peek());   // list.peek() get element from start of LinkedList
        System.out.println(" Element from peekFirst() = "+ list.peekFirst());
        System.out.println(" Element from peekLast() = " + list.peekLast());   // last element of LinkedList
    }

    // traversing and manuplating the element in LinkedList
    public static void printItinerary(LinkedList<String> list){
        System.out.println("Trip starts at " + list.getFirst());
        for(int i=1 ; i< list.size() ; i++){
            System.out.println(" -->from: "+ list.get(i-1) +" to "+ list.get(i));
        }

        System.out.println("Trip ends at  "+ list.getLast());
    }
    public static void printItinerary2(LinkedList<String> list){
        System.out.println("Trip starts at " + list.getFirst());
        String previousCity = list.getFirst();
        for(String city : list){
            System.out.println("-->from: "+ previousCity + " to "+ city);
            previousCity=city;

        }
        System.out.println("Trip ends at  "+ list.getLast());
    }
    public static void printItinerary3(LinkedList<String> list){
        System.out.println("Trip starts at " + list.getFirst());
        String previousCity = list.getFirst();
        //ListIterator<String> iterator = list.listIterator();    // ListIterator is a type that got assign a listiterator
                                                          // with the help of iterator we can traverse through loop
                                                       // listIterator() create a iterator cursor is before index 0
                                   // after the iterator.next() curser goes to between index 0 to index 1 and so on then in last it goes(points) to after last index
                                                       //  next of iterator goes index 0 to index 1 to index n
// a listIterator can be used to go both forward and backword and in addition to the remove method , it also support add and set method
        ListIterator<String> iterator = list.listIterator(1);  // cursor will be between index 0 to index 1
                                                                      // so the iterator.next() will be index 1 value
                                                                     // iterator.previous() will be index 0

        while(iterator.hasNext()){  // iterator.hasNext() return true if iterator have next element
            var city = iterator.next();   // move to the next and return the value // retrieve the element
            System.out.println("-->from: "+ previousCity + " to "+ city);
            previousCity=city;

        }
        System.out.println("Trip ends at  "+ list.getLast());
    }
    public static void testIterator(LinkedList<String> list){
        System.out.println("testing "+list);
        var iterator = list.iterator();   // create a iterator that traverse through list but move only forward and support only remove method

        while(iterator.hasNext()){
            //System.out.println(iterator.next());
            if(iterator.next().equals("Brisbane")){
              //  list.remove();  // Exception in thread "main" java.util.ConcurrentModificationException , we can't use list.remove() when looping
                               // but we can call this on iterator
                iterator.remove();
            }
        }
        System.out.println(list);
    }
    public static void testIterator1(LinkedList<String> list){
        System.out.println("testing "+list);
        var iterator = list.listIterator();   // create a listiterator that traverse through list but move  forward and backword and support add. set ,remove method
                                          // Iterator's cursor positions, are between the elemments (in start before first element , after traversing all list , after the last element)
        while(iterator.hasNext()){
            //System.out.println(iterator.next());
            if(iterator.next().equals("Drawin")){
                //  list.remove();  // Exception in thread "main" java.util.ConcurrentModificationException , we can't use list.remove() when looping
                // but we can call this on iterator
                //iterator.remove();
                iterator.add("Lake ");  // add after Drawin
            }
            // after the above loop ends the iterator.hasNext() become false and the cursor at the after last element
            // we move backword using iterator.previous()

        }
        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
        System.out.println(list);
        var iterator2 = list.listIterator(3);  // cursor wil be between index 2 and index 3
        //System.out.println(iterator2.next());
        System.out.println(iterator2.previous());
    }
}