public class Banker {
    final boolean COOPERATE = false;
    final boolean DEFECT = true;
    NoisyTitForTat player1 = new NoisyTitForTat();
    GrimClicker player2 = new GrimClicker();
    boolean player1Move;
    boolean player2Move;

    public static void main(String[] args) {
        Banker banker = new Banker();
        for (int i = 0; i < 100; i++) {
            banker.StartRound();
        }
        banker.DisplayScores();
    }

    public void StartRound() {
        player1Move = player1.playMove();
        player2Move = player2.playMove();
        AwardPoints();
        TellOpponentLastMove();
        DisplayMoves();
    }

    public void AwardPoints() {
        if (player1Move == COOPERATE && player2Move == COOPERATE) {
            player1.addPoints(3);
            player2.addPoints(3);
        } else if (player1Move == COOPERATE && player2Move == DEFECT) {
            player1.addPoints(0);
            player2.addPoints(5);
        } else if (player1Move == DEFECT && player2Move == COOPERATE) {
            player1.addPoints(5);
            player2.addPoints(0);
        } else if (player1Move == DEFECT && player2Move == DEFECT) {
            player1.addPoints(1);
            player2.addPoints(1);
        }
    }

    public void TellOpponentLastMove() {
        player1.setOpponentLastMove(player2Move);
        player2.setOpponentLastMove(player1Move);
    }

    public void DisplayMoves() {
        String player1MoveString = player1Move ? "Defect" : "Cooperate";
        String player2MoveString = player2Move ? "Defect" : "Cooperate";
        System.out.println(player1MoveString + "\t" + player2MoveString);
    }

    public void DisplayScores() {
        System.out.println(player1.score + "\t" + player2.score);
    }
}
