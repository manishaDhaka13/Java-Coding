public class Car {

    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean convertible;

    // we use getter or setter method to retrieve or assign the private field of class
    // getter and setter method use instance field of class so they can't be static method

    public String getMake(){
        return make;  // field of that instance of class
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }
    public boolean isConvertible() {
        return convertible;
    }
    public void setMake(String make){
       // make=make; it will reassign the parameter make in itself
       // to differentiate between parameter and field of object we use "this" keyword
       // this keyword always refer to that instance of class which is calling the fuction
       // this.make=make;
        if(make==null){
            make = "UnKnown";
        }
        String makeLowerCase = make.toLowerCase();
        switch(makeLowerCase){
            case "porsche", "holden", "tesla"-> this.make=make;
            default-> this.make = "unSupported";
        }


    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describeCar(){
        System.out.println("make "+ make +" model " +model+" color "+color+ " doors "+doors +" convertible "+convertible);
    }
}
