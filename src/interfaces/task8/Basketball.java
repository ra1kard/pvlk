package interfaces.task8;

public class Basketball implements SportType {
    private final int scoreWin = 2;
    private final int scoreLose = 0;

    @Override
    public int getScoreWin() {
        return scoreWin;
    }

    @Override
    public int getScoreLose() {
        return scoreLose;
    }

}
