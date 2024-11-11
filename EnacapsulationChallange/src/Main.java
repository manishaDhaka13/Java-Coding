public class Main {
    public static void main(String[] args){
        Printer printer = new Printer(50,true);
        System.out.println(printer.addToner(20));
        System.out.println(" initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(8);
        System.out.printf("current job pages printed  : %d. printer total pages printed: %d %n" ,pagesPrinted,
                           printer.getPagesPrinted());
        pagesPrinted = printer.printPages(5);
        System.out.printf("current job pages printed  : %d. printer total pages printed: %d %n" ,pagesPrinted,
                printer.getPagesPrinted());

    }
}
