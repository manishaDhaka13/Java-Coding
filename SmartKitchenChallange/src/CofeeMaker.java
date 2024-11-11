public class CofeeMaker {
    private boolean hasWorkTODo;

    public void setHasWorkTODo(boolean hasWorkTODo) {
        this.hasWorkTODo = hasWorkTODo;
    }


    public void brewCofee(){
        if(hasWorkTODo){
            System.out.println("Cofee is brewing");
            this.hasWorkTODo=false;
        }
    }

}
