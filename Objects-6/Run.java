/**
 *
 */
public class Run {

    public static void main(final String[] args) {
        Player russianPlayer = new Player("Gari", "Kasparow", 2851);
        Player usaPlayer = new Player("Hikaru", "Nakamura", 2816);
        Player[] players = new Player[] {russianPlayer, usaPlayer};

        Game chess = new Game("Chess", players);
        Player winner = chess.winner();
        if (winner == null) {
            System.out.println("There is no winner in " + chess.name + " game.");
        } else {
            System.out.println("And the winner is " + winner.fullName() + ".");
        }
    }
}
