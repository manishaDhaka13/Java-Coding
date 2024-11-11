public class Main {
    public static void main(String[] args){
      MealOrder defaultMeal=new MealOrder();
      defaultMeal.printTHePriceOfItem();
      System.out.println("default price "+defaultMeal.calculatePrice());
      Burger burger =new Burger("reg");
      burger.addExtraToppings(3);

      Drink drink = new Drink("orange juice","small");
      SideItem sideItem=new SideItem("friees",50);
      MealOrder meal = new MealOrder(burger,drink,sideItem);
      meal.printTHePriceOfItem();
      System.out.println(" meal price is "+meal.calculatePrice());

        Burger deluxBurger =new Burger("reg");
        deluxBurger.addExtraToppings(3);

        Drink deluxDrink = new Drink("orange juice","small");
        SideItem deluxSideItem=new SideItem("friees",50);
        MealOrder deluxMeal = new MealOrder(deluxBurger,deluxDrink,deluxSideItem);
        deluxMeal.printTHePriceOfItem();
        System.out.println(" delux price is "+deluxMeal.calculatePrice());

    }

    
}
