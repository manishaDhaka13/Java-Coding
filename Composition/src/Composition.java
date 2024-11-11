public class Composition {
    // inheritence is a relationship child parent has a relationship
     // monitor , motherboard is type of product thay are subclass of product

    // composition is another component of object oreiented prograamming
    // composition has a relationship
    // a class is made of another class object
    //composition is a object within a object
    // personalcomputer is made of monitor , motherboard

    // combination is a way to make combination od=f classes act like a single coherent object

    public static void main(String[] arga){
        ComputerCase theCase = new ComputerCase("2208","Dell","240");
        // in method we declare local variable // public int a ; will give error we don't use access modifier in method
        Monitor theMonitor = new Monitor("27inch Beast","Acer",27,"2540*1440");
        Motherboard theMotherboard = new Motherboard("BJ-200","asus",4,6,"v2.44");
        PersonalComputer thePC = new PersonalComputer("2208","Dell",theCase,theMonitor,theMotherboard);
//        thePC.getMonitor().drawPixelAt(10,10,"red");
//
//        thePC.getMotherBoard().loadProgram("windows OS");
//        thePC.getComputerCase().pressPowerButton();

        thePC.powerUp();

    }
}

