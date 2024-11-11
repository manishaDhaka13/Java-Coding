package dev.lpa;

public abstract class ProductForSale {

    protected String type;
    protected String description;
    protected int price;

    public ProductForSale(String type, String description, int price) {
        this.type = type;
        this.description = description;
        this.price = price;
    }

    public int getSalePrice(int quantity){
        return quantity*price;
    }
    public void printPricedLineItem(int quantity){
        System.out.println("type of product : "+ type);
        System.out.println("price of single product : "+price);
        System.out.println("quantity orderd : "+quantity);
        System.out.println("total price : "+getSalePrice(quantity));
    }
    public abstract void showDetails();

}

class OrderItem{
    private int quantity;
    private ProductForSale productForSale;
}

class Jeans extends ProductForSale{
    public Jeans(String type, int price , String discription){
        super(type,discription,price);
    }
    public void showDetails(){

    }

}
