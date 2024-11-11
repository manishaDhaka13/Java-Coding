import java.util.Scanner;

public class Main {


    public static void main(String[] args){
        Movie theMovie= new Movie("Star Wars");
        theMovie.watchMovie();  // we create a instance of Movie class and assigned it to Movie variable(theMovie Movie reference)
                                  // the object created is Movie object so runtime instance is Movie
        Movie theMoviee= new Adventure("Star Wars");  // Adventure is a type of Movie (Adventure is a subclass of Movie)
                                                           // so we can assign a Adventure instance to a Movie refernce
        theMoviee.watchMovie();      // declared type movie
                                     // run time type Adventure
                                   // the subclass method is called by jvm at run time
                                    // it's a example of polymorphism
                                    // when compiler  compile the code it see the declared type and search the method on that declared
                                    // type object but when JVM run this code it see the real run time type object and run that method on real time instance

        Movie theMovie1= Movie.getMovie("Adventure","Star Wars 2");
        theMovie1.watchMovie();

        Movie theMovie2= Movie.getMovie("Science","Star Wars 2");
        theMovie2.watchMovie();

        //this keep the information about movie and it's subclasses in control of the movie class

        // using Scanner class
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.println("enter types(A for Adventure , C for comedy , S for science fiction or Q to quit ");
            String type =s.nextLine();

            if("Qq".contains(type)){
                break;
            }
            System.out.print("enter movie title :");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type, title); // we assign it to movie variable // so we can call the Movie method
            movie.watchMovie();   // run time jvm called subclass method if it have unless base class method called
        }



    }
}

