public class Main {
    public static void main(String[] args ){

        Car car=new Car();
        // car.make="pr" will give a error because we are trying to access the private field of class
        // Car car=null will not give compile time error but throw a exception because we can't call describeCar on null
        // Car car; will give a compile time error because we can't call variable before initialising it
        car.describeCar();        // describeCar() is a public method
        car.setMake("cgjhgjh");
        car.setModel("Carrera");
        car.setDoors(2);
        car.setConvertible(true);
        car.setColor("black");
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getColor());
        System.out.println(car.isConvertible());
        System.out.println(car.getDoors());


        car.describeCar();


}
}
