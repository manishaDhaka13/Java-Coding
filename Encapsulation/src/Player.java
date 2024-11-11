public class Player {    // without encapsulation

    public String name;   // everytime we change field name we have to change it also in calling code
    public int health;
    public String weapon;

    public void looseHealth(int damage){
        health=health-damage;
        if(health<=0){
            System.out.println("System got knock out");
        }

    }
    public int healthRemaining(){
        return health;
    }
    public int restoreHealth(int extraHealth){
        health=health+extraHealth;
        if(health>100){
            System.out.println(" player restored to 100%");
        }
        return health;

    }
}
