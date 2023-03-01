import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Comparison {
    public static void main(String[] args) {
        //create player in a list

        ArrayList<Player> players = new ArrayList<>();
        players.add(new Player("Djoko", 198));
        players.add(new Player("Kirgios", 220));
        players.add(new Player("Fils", 212));
        players.add(new Player("Zverev", 225));
        players.add(new Player("Nadal", 204));

        Collections.sort(players);
        
        for (Player player : players) {
            System.out.println(player.getName() + " serve at " + player.getSpeed());
        }

    }
}