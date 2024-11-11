public class Animal {
    //private String type;
    protected String type;
    private String size;
    private double weight;
    public Animal(){
        // we have to create this so super() does not give error
        System.out.println("default constructor---------");
    }

    public Animal(String type, String size, double weight){
        this.type=type;
        this.size=size;
        this.weight=weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void move(String speed){
        System.out.println(type+" move "+speed);

    }
    public void makeNoise(){
      System.out.println(type +" make some kind of noise  ")  ;
    }
}
