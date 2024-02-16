public class ForgivingTitForTat extends BasePrisoner {
    private boolean isFirstMove = true;
    private boolean opponentLastMove;

    @Override
    protected boolean decideMove() {
        if (isFirstMove) {
            isFirstMove = false;
            return COOPERATE;
        } else {
            if (opponentLastMove == COOPERATE)
                return COOPERATE;
            else
                return DEFECT;
        }
    }

    @Override
    public boolean playMove() {
        double rand = Math.random();
        boolean move = decideMove();
        if (rand < 0.1)
            return COOPERATE;
        return move;
    }

    public void setOpponentLastMove(boolean opponentLastMove) {
        this.opponentLastMove = opponentLastMove;
    }
}
