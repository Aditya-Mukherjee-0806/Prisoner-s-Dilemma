public class Alternator extends BasePrisoner {
    boolean lastMove = DEFECT;
    @Override
    protected boolean decideMove() {
        lastMove = !lastMove;
        return lastMove;
    }
}
