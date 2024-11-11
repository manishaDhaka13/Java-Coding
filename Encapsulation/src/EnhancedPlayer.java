public class EnhancedPlayer {  // with capsulation

    private String fullname;  // if we change the name here we don't have to change anything in calling code
    //private String name;   // becuse we are not directly accessing it (by name) in calling code

    private int healthPercentage;
    private String weapon;

    public EnhancedPlayer(String name){
        this(name,100,"Sword");
    }

    public EnhancedPlayer(String name, int health, String weapon){
        this.fullname =name;
        if(health <= 0){
            this.healthPercentage =1;
        }
        else if(health >100){
            this.healthPercentage =100;
        }
        else{
            this.healthPercentage =health;
        }
        this.weapon=weapon;
    }

    public void looseHealth(int damage){
    healthPercentage = healthPercentage -damage;
        if(healthPercentage <=0){
        System.out.println("System got knock out");
    }

}
public int healthRemaining(){
    return healthPercentage;
}
public int restoreHealth(int extraHealth){
    healthPercentage = healthPercentage +extraHealth;
    if(healthPercentage >100){
        System.out.println(" player restored to 100%");
    }
    return healthPercentage;

}

}
