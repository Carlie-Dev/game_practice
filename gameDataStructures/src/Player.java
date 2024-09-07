import java.util.Random;

public class Player {
    private String name;
    private int health;
    private Weapon weapon;

    //function sets the name of the player when the game asked.
    public void setName(String name){
        this.name = name;
    }
    public void setHealth(int health){
        this.health = health;
    }

    //Set weapon creates the weapon that the user selects - see weapon's class
    public void setWeapon(String type, String action){
        this.weapon = new Weapon();
        this.weapon.setType(type);
        this.weapon.setAction(action);
    }

    //Getting health and name. these methods return the health and name of the player when called. This is needed whenever the player is attacked or giving damage
    public int getHealth(){
        return this.health;
    }
    public String getName(){
        return this.name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    //Attack method
    public String attack(Player enemy){
        Random dice = new Random();
        int d8 = dice.nextInt(9) + 1;
        this.health = this.health - d8;
        return this.name + " was attacked by " + enemy.name + " and now has " + this.health + " health points";
    }

}
