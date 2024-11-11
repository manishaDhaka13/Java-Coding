public class Dog extends Animal {

    // we can only extends one class
    // child can have one direct parent in java
    // when we don't call constructor then default constructor of base class(parent class) is called
    // but we declare a constructor in Animal class so default constructor is not created in Animal class


    private String earShape;
    private String tailShape;
    public Dog(){  // if we don't create constructor then default constructor like this is created implicitly
        // by java
       // super();  //if we don't call any constructor using super this is implicitly called
                    // super must be the first statement of constructor
        super("mutt","huge",50);  // we are adding call to super so default super() is not called here
        System.out.println("dog s default constructor");

    }

    public Dog(String type,double weight){
        this(type,weight,"perky","curled");
    }
    public Dog(String type, double weight, String earShape, String tailShape){
        //super(); implicitly called if we don't call explicitly
        super(type,(weight<15)?"small":(weight<35?"medium":"large"),weight);
        this.earShape=earShape;
        this.tailShape=tailShape;
    }

    public void makeNoise(){  //overriding method is when you create a method on subclass that has same signature
                              // as a method on super class
        //System.out.println("it's a Dog object");
        if(type=="wolf"){ //type is a field of animal class to directly acces it like this we have to make type protected type
            // because if type access modifier is private then subclass do inherit it(we set the value using super) but can't access it without using animal object
            System.out.print("ooo woooo");
            bark();
        System.out.println();
        }

    }

    @Override
    public void move(String speed) {
        super.move(speed);
       // System.out.println("Dogs walk, run and wag their tail");
        if(speed=="slow"){
            walk();
            wagTail();
        }
        else{
            run();
            bark();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    private void bark(){
        System.out.print("Woof! ");
    }
    private void run(){
        System.out.print("Dog running");
    }
    private void walk(){
        System.out.print("dog Walking");
    }
    private void wagTail(){
        System.out.print("Tail Wagging");
    }
}
