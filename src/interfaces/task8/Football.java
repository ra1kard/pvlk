package interfaces.task8;

public class Football implements SportType {
    private final int scoreWin = 3;
    private final int scoreLose = 0;
    private final int scoreTie = 1;

    @Override
    public int getScoreWin() {
        return scoreWin;
    }

    @Override
    public int getScoreLose() {
        return scoreLose;
    }

    public int getScoreTie() {
        return scoreTie;
    }

}
