public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Magic Rumble!");
        Player test = new Player();
        Player test2 = new Player();
        test.setName("Dave");
        test.setHealth(100);
        test.setWeapon("Axe","Hacks");

        test2.setName("Jack");
        test2.setHealth(100);
        test2.setWeapon("Sword","Slashes");


        Game.game(test,test2);
    }
}