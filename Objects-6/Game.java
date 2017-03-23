/**
 *
 */
public class Game {
    String name;
    Player[] players;

    public Game(String name, Player[] players) {
        this.name = name;
        this.players = players;
    }

    public Player winner() {
        Player winner = null;
        int bestPoints = 0;

        for(Player player: players) {
            if (player.getPoints() > bestPoints) {
                bestPoints = player.getPoints();
                winner = player;
            }
        }
        if (bestPoints > 100) {
            return winner;
        } else {
            return null;
        }
    }
}
