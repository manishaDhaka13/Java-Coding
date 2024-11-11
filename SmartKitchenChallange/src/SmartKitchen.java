public class SmartKitchen {
    private CofeeMaker brewMaster;
    private Refrigerator iceBox;
    private DishWasher dishWasher;

    public SmartKitchen(){
        brewMaster =new CofeeMaker();
        iceBox = new Refrigerator();
        dishWasher=new DishWasher();

    }

//    public CofeeMaker getBrewMaster() {
//        return brewMaster;
//    }
//
//    public Refrigerator getIceBox() {
//        return iceBox;
//    }
//
//    public DishWasher getDishWasher() {
//        return dishWasher;
//    }

    public void setKitchenState(boolean cofeeFlag, boolean fridgeFlag, boolean dishWasherFlag){
        brewMaster.setHasWorkTODo(cofeeFlag);
        iceBox.setHasWorkToDo(fridgeFlag);
        dishWasher.setHasWorkToDo(dishWasherFlag);
    }
    public void doKitchenWork(){
        brewMaster.brewCofee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }
}
