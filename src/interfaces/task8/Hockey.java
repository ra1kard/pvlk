package interfaces.task8;

public class Hockey implements SportType {
    private final int scoreWin = 3;
    private final int scoreLose = 1;

    @Override
    public int getScoreWin() {
        return scoreWin;
    }

    @Override
    public int getScoreLose() {
        return scoreLose;
    }

}
