public class Game {
    public static void game(Player player1, Player player2){
        int player1health = player1.getHealth();
        int player2health = player2.getHealth();
        while (player1health > 0 && player2health > 0){

            //Player 1 logic
            String attackstring = player2.attack(player1);
            player1health = player1.getHealth();

            if (player2health <= 0) {
                System.out.println("KO!");
                break;  // Exit loop if Player 2 is dead
            } else if (player1health > 0){
                System.out.println(player1.getName() + "'s " + player1.getWeapon().strike());
                System.out.println(attackstring);
            }

            //Player 2 logic
            attackstring = player1.attack(player2);
            player2health = player2.getHealth();


            if (player1health <= 0) {
                System.out.println("KO!");
                break;  // Exit loop if Player 1 is dead
            }else if (player2health > 0){
                System.out.println(player2.getName() + "'s " + player2.getWeapon().strike());
                System.out.println(attackstring);
            }
        }

        //These are the results
        if (player1.getHealth() <= 0 && player2.getHealth() <= 0){
            System.out.println("Tie!");
        }else if (player1.getHealth() <= 0){
            System.out.println(player2.getName() + " wins!");
        } else if (player2.getHealth() <= 0) {
            System.out.println(player1.getName() + " wins!");
        }
    }
}
