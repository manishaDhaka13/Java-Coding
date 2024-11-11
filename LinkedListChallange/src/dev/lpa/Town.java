package dev.lpa;

public class Town {
    private String townName;
    private double distanceInKm;
    public Town(String townName,double distanceInKm){
        this.townName=townName;
        this.distanceInKm=distanceInKm;
    }
    public String getTownName(){
        return townName;
    }
    public double getDistanceInKm(){
        return distanceInKm;
    }

    @Override
    public String toString() {
        return String.format("%s(%f)",getTownName(),getDistanceInKm());
    }

}


