public class TitForTat extends BasePrisoner {
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

    public void setOpponentLastMove(boolean opponentLastMove) {
        this.opponentLastMove = opponentLastMove;
    }
}
