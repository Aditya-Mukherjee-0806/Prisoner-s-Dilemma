public class Appeaser extends BasePrisoner {
    boolean myChoice = COOPERATE;
    boolean opponentLastMove = COOPERATE;

    @Override
    protected boolean decideMove() {
        if (opponentLastMove == DEFECT)
            myChoice = !myChoice;
        return myChoice;
    }

    public void setOpponentLastMove(boolean opponentLastMove) {
        this.opponentLastMove = opponentLastMove;
    }
}
