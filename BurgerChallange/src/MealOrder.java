public class MealOrder {

    Burger burger;
    Drink drink;
    SideItem sideItem;

    public MealOrder(){
     this.burger=new Burger("Regular",200);
     this.drink = new Drink("coke" ,"small");
     this.sideItem=new SideItem("fries",50 );

    }

    public MealOrder(Burger burger, Drink drink, SideItem sideItem) {
        this.burger = burger;
        this.drink = drink;
        this.sideItem = sideItem;
    }

    public void printTHePriceOfItem(){
        System.out.println("price of burger and extra toppings = "+ burger.calPrice());
        System.out.println(" price of drink = "+drink.calPrice() +" drink size = "+drink.getSize() );
        System.out.println("price of side items = "+sideItem.calPrice());
    }
    public int calculatePrice(){
        int price=burger.calPrice()+drink.calPrice()+sideItem.calPrice();
        return price;
    }

}
class MealItem{
    private String type;
    private int price;

    public MealItem(String type, int price) {
        this.type = type;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
class Extratoppings extends MealItem{
    public Extratoppings(String type , int price){
        super(type ,switch(type.toUpperCase()){
            case "organio"-> 100;
            default -> 50;
        });
    }
}

class Burger extends MealItem{

    private int extraToppings=0;
    public Burger(String type ){
        super(type, switch(type.toUpperCase()){
            case "HAM"-> 100;
            case  "CHEESE" -> 200;
            case "REGULAR"-> 500;
            default -> 300;
        }
        );
    }
    public Burger(String type, int price){
        super(type,price);
    }
    public void addExtraToppings(int extraToppings){
        this.extraToppings=getExtraToppings()+extraToppings;
        if(extraToppings>3 || extraToppings <0){
            System.out.println("extra topping maximum can be 3");
            this.extraToppings=0;
        }

    }

    public int getExtraToppings() {
        return extraToppings;
    }

    public int calPrice(){
        int price;
        price = getPrice()+extraToppings*50;
        return price;
    }

}

class DeluxBurger extends Burger{
    public DeluxBurger(String type , int price){
        super(type,price);

    }
    public int calPrice(){
        int price;
        if(getExtraToppings()>2){
        price = getPrice()+(getExtraToppings()-2)*50;
    }
    else
        {
        price =getPrice();
    }
    return price;
}

}


class Drink extends MealItem{
    private String type;
    private String size;
    private int price;
    public Drink(String type ,String size){
        super(type, switch(size.toUpperCase()){
            case "SMALL"-> 100;
            case  "MEDIUM" -> 200;
            case "BIG"-> 500;
            default -> 300;
        });
        this.size=size;
    }
    public void changeSize(String size){
        this.size=size;
        switch(size.toUpperCase()){
            case "SMALL"-> setPrice(50);
            case  "MEDIUM" -> setPrice(100);
            case "BIG"-> setPrice(200);
            default -> setPrice(150);
        };

    }
    public String getSize(){
        return size;
    }
    public int calPrice(){
        int price;
        price = getPrice();
        return price;
    }

}

class SideItem extends MealItem{
    public SideItem(String type, int price){
        super(type, price);
    }
    public int calPrice(){
        int price;
        price = getPrice();
        return price;
    }

}