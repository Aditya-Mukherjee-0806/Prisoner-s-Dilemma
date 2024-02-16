public class GrimTrigger extends BasePrisoner{
    boolean opponentDefectedOnce = false;
    @Override
    protected boolean decideMove() {
        if(opponentDefectedOnce)
            return DEFECT;
        else return COOPERATE;
    }

    @Override
    public void setOpponentLastMove(boolean opponentLastMove) {
        if(opponentLastMove == DEFECT && !opponentDefectedOnce)
            opponentDefectedOnce = true;
    }
}
