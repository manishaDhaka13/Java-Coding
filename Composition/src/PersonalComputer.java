public class PersonalComputer extends Product{  // extends inheritence

    private ComputerCase computerCase;
    private Monitor monitor;                      // personal computer is consist of ComputerCase ,Monitor ,MotherBoard
                                                  // this is composition
    private Motherboard motherBoard;

    public PersonalComputer(String model, String manufacturer, ComputerCase computerCase, Monitor monitor, Motherboard motherBoard) {
        super(model, manufacturer);
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }

//    public ComputerCase getComputerCase() {
//        return computerCase;
//    }
//
//    public Monitor getMonitor() {
//        return monitor;
//    }
//
//    public Motherboard getMotherBoard() {
//        return motherBoard;
//    }

    private void drwaLogo(){
        monitor.drawPixelAt(1200,50,"yellow");
    }
    public void powerUp(){
        computerCase.pressPowerButton();
        drwaLogo();
    }
}
