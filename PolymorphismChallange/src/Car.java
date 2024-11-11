public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }
    public void startEngine(){
        System.out.println(" Car -> startEngine");
    }
    public void runEngine(){
        System.out.println("Car -> runEngine");
    }
    public void drive(){
        System.out.println(" Car -> driving, type is "+getClass().getSimpleName());
             // here the this.getClass().getSimpleName implied , this(current instance)
        runEngine();
    }
}

class GasPoweredCar extends Car{
    private double avgKmperLiter;
    private int cylinders=6;

    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, double avgKmperLiter, int cylinders) {
        super(description);
        this.avgKmperLiter = avgKmperLiter;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {

        System.out.printf(" gas -> all %d cyllinders are fired up , Ready! %n",cylinders);
    }

    @Override
    public void runEngine() {
      System.out.printf("Gas -> usage exceeds the average : %.2f %n",avgKmperLiter );
    }
}
class ElectricCar extends Car{
    private double avgKmperCharge;
    private int batterySize =6;

    public ElectricCar(String description) {
        super(description);
    }

    public ElectricCar(String description, double avgKmperCharge, int batterySize) {
        super(description);
        this.avgKmperCharge = avgKmperCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {

        System.out.printf(" BEV -> switch %d kWh battery on , Ready! %n", batterySize);
    }

    @Override
    public void runEngine() {
        System.out.printf("BEV -> usage under the average : %.2f %n", avgKmperCharge);
    }
}

class HybridCar extends Car{
    private double avgKmperLiter;
    private int cylinders=6;
    private int batterySize;

    public HybridCar(String description) {
        super(description);
    }

    public HybridCar(String description, double avgKmperLiter, int cylinders,int batterySize) {
        super(description);
        this.avgKmperLiter = avgKmperLiter;
        this.cylinders = cylinders;
        this.batterySize=batterySize;
    }

    @Override
    public void startEngine() {

        System.out.printf("Hybrid ->  %d cyllinders are fired up ,  %n",cylinders);
        System.out.printf("Hybrid -> switch %d kWh battery on, Ready ! %n ",batterySize);
    }

    @Override
    public void runEngine() {
        System.out.printf("Hybrid -> usage below average : %.2f %n",avgKmperLiter );
    }
}
