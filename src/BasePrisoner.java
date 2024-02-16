public abstract class BasePrisoner {
    final boolean COOPERATE = false;
    final boolean DEFECT = true;
    int score = 0;

    protected abstract boolean decideMove();

    protected boolean playMove() {
        return decideMove();
    }

    public void setOpponentLastMove(boolean opponentLastMove) {
    }

    public void addPoints(int points) {
        score += points;
    }
}
