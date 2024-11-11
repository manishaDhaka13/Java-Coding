public class Main {
public static void main(String[] args) {
    Item coke = new Item("drink", "coke", 1.50);
    coke.printItem();
    coke.setSize("LARGE");
    coke.printItem();

    Item avocado = new Item("topping", "avocado", 1.50);
    avocado.printItem();

    Burger burger = new Burger("regular ", 4.00);
    burger.addToppings("BACON", "CHESSE", "MAYO");
    burger.printItem();

    MealOrder regularMeal = new MealOrder();
    regularMeal.addBurgerToppings("BACON", "CHEESE", "MAYO");
    regularMeal.setDrinkSize("LARGE");
    regularMeal.printItemizedList();

    MealOrder secondMeal = new MealOrder("turkey", "7-up","chili");
    secondMeal.addBurgerToppings("LETTUCE","CHEESE","MAYO");
    secondMeal.setDrinkSize("SMALL");
    secondMeal.printItemizedList();

    MealOrder deluxMeal = new MealOrder("deluxe","7-up","chili");
    deluxMeal.addBurgerToppings("AVOCADO","BACON","LETTUCE","CHESSE","MAYO");
    deluxMeal.setDrinkSize("SMALL");
    deluxMeal.printItemizedList();

}
 }
