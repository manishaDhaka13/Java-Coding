public class Main {
    // in java encapuslation means hiding thing by making them private or inaccesible outside class
    // to protect the integrity of data
    public static void main(String[] args){
        Player player=new Player();
        player.name="Tim";  // the field are public so we can access them with instance outside of class
        player.health=20;   // omitting the constructor we can't validate the value  // bypass check
        player.weapon="Sword";

        int damage=10;
        player.looseHealth(damage);
        System.out.println(" Remaining health = "+ player.healthRemaining());
        player.health=200;  // setting player manually outside the normal game
                          // it taking  control from Player class
                         // it did not check for health >100
                         // bypass check
        player.looseHealth(11);
        System.out.println(" Remaining health = "+ player.healthRemaining());

        // enhanced player

        EnhancedPlayer tim = new EnhancedPlayer("tim", 200,"Sword");
        System.out.println(" Remaining health  of Enhance player = "+ tim.healthRemaining());

    }
}
