public class Movie {

    // polymorphism means many form
    // polymorphism let us write code to call a method but at runtime this method's behaviour can be different for different object
    // it behave on runtime type object
    // runtime type can be different or same from the declared type in code
    // the declared type has to have some kind of relationship with run time type , inheritence is a way to establish this relationship
//  can think compile type as declared type
// run time is different from compile time because of polymorphism
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie(){
        String instanceType = this.getClass().getSimpleName();  // this refer to current object
        // getClass() = give information about instance class
        // getSimpleName() = get class name

        System.out.println(title + " is a "+ instanceType +" film");
    }
    public static Movie getMovie(String type , String title){ // all the classes are type of Movie so return type is Movie
                                                                // the method that return a new object is called factory method in software engineering

        return switch(type.toUpperCase().charAt(0)){
            case 'A'-> new Adventure(title);
            case 'C'-> new Comedy(title);
            case 'S'-> new ScienceFiction(title);
            default -> new Movie(title);
        };

    }
}

class Adventure extends Movie{
    public Adventure(String title){
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s %n".repeat(3),
                "pleasant scene",
                "Scary music",
                "something bed happens");
    }
    public void watchAdventure(){
        System.out.println("watching adventure");
    }
}

class Comedy extends Movie{
    public Comedy(String title){
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s %n".repeat(3),
                "funny scene",
                " even funny happen",
                "happy ending");
    }
    public void watchComedy(){
        System.out.println("watching comedy");
    }
}

class ScienceFiction extends Movie{
    public ScienceFiction(String title){
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s %n".repeat(3),
                "bad Alliens do bad Stuff",
                "Space Guy chase Aliens",
                "planet blows up");
    }
    public void watchScienceFiction(){
        System.out.println("watching science fiction");
    }
}
