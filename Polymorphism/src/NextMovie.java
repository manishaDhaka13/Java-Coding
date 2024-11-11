import java.lang.Object;
public class NextMovie {
    public static void main(String[] args){
        Movie movie=Movie.getMovie("A","jaws");
        movie.watchMovie();
    //Adventure jawa= Movie.getMovie("A" , "jaws");  // error compiler does not know that it will give a error
                                           // compiler will ask that every Movie is a adventure type or not
                                           // it's not then we can't assign every movie type to adventure type
        // casting class
        Adventure jaws =(Adventure) Movie.getMovie("A", "jaws");  // right statement
                                                                            // casting the getMovie ressult to Advanture type
        jaws.watchMovie();

        //Adventure jaa =(Adventure) Movie.getMovie("C", "jaws");   // it will not give error at compile time
                                                                            // but throw a classCastException at run time
              // because we are trying to assign a comedy object to Adventure Object

        // Object is a base class of every class
        // so object type can use as refernce for other object


        Object comedy = Movie.getMovie("C" , "Airplane");

        //comedy.watchMovie();  // error bcoz compiler does not figure out that it's comedy object
                              // it treat as Object instance and try to find watchMovie() method in Object class
                             // but Object class does not have this method

        // a subclss object can assign to the base class(direct / indirect parant class) varriable /reference
        //Movie comedyMovie = (Comedy)comedy;
        // comedyMovie.watchComedy();  // error watchComedy is not in Movie instance //  compiler does not figure out that comedyMovie
        // is a Comedy instance it treat it as Movie instance

        Comedy comedyMovie = (Comedy)comedy;
        comedyMovie.watchComedy();


        // var is a special contexual keyword in java , that let us our code take advantage of Local Variable type Interface(LVTI)
        //var keyword decide automatically the refernce type acording to the object that is assigned in reference
        // by using var as type , we are telling java to figure out the compile time type for us;
        var airplane=Movie.getMovie("C","airplane");  // here the refernce will be Movie type because we know in every type
                                                                // Movie will be return
        airplane.watchMovie();

        var plane = new Comedy("airplane");  // Comedy object is assigned to var type plane
                                              // compiler identify the type of plane
        plane.watchComedy();

        // var Local variable type inference :
        // it can't be used in field declaration on a class
        // it can't use in method signature , parameter type and return type
        // it can't used without an assignment because the type can't be inferred in that case
        // it can't be assigned a null literal

        // run time instance

       Object r= Movie.getMovie("A","asd");
       if(r.getClass().getSimpleName()=="Comedy"){
           Comedy c= (Comedy)r;
           c.watchComedy();
       }
        else if( r  instanceof Adventure){   // r is instance of Adventure
           ((Adventure) r).watchAdventure();
        }
        else if( r instanceof ScienceFiction sf){      // pattern matching support

                                                   //if r is instanceof ScienceFiction then r is assigned to  ScienceFiction sf (binding variable)
                                                 // JVM can identify that the object matches the type, it can extract data from the object without casting
            sf.watchScienceFiction();
       }

    }
}
