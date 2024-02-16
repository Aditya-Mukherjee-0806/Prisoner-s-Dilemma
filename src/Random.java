public class Random extends BasePrisoner {
    @Override
    protected boolean decideMove() {
        double rand = Math.random();
        if (rand < 0.5)
            return COOPERATE;
        else return DEFECT;
    }
}