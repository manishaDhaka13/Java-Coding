public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex){
        pagesPrinted=0;
        this.tonerLevel=tonerLevel;
        if(tonerLevel<0 || tonerLevel >100){
            this.tonerLevel=-1;
        }

        this.duplex=duplex;
    }

    public int addToner(int tonerAmount){
        int tempAmount =tonerAmount+tonerLevel;
        if(tempAmount <0 || tempAmount >100){
            return -1;
        }
        tonerLevel+=tonerAmount;
        return tonerLevel;
    }

    public int printPages(int pages){
        if(tonerLevel<0){
            return -1;
        }
      int sheets =(duplex)?(pages/2 + pages%2):(pages);
        pagesPrinted+=sheets;
        return sheets;
    }

    public int getPagesPrinted(){
        return pagesPrinted;
    }
}
