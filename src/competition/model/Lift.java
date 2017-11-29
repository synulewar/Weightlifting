package competition.model;

import static competition.model.Constans.GOOD_LIFT;
import static competition.model.Constans.NUMBER_OF_ATTEMPTS;

public class Lift {

    private static final int WEIGHT = 0;
    private static final int VERDICT = 1;
    private static final int NO_SCORE = 0;
    private int[][] mAttempts;

    public Lift() {
        mAttempts = new int[NUMBER_OF_ATTEMPTS][2];
    }

    public int getBestAttemp() {
        for (int i = NUMBER_OF_ATTEMPTS - 1; i >= 0; i--)
        {
            if (mAttempts[i][VERDICT] == GOOD_LIFT) {
                return mAttempts[i][WEIGHT];
            }
        }
        return NO_SCORE;
    }

    public void setAttemptWeight(int attemptNubmer, int weight) {
        mAttempts[attemptNubmer][WEIGHT] = weight;
    }

    public void setAttemptVerdict(int attemptNumber, int verdict) {
        mAttempts[attemptNumber][VERDICT] = verdict;
    }

    public int getAttempWeight(int attemptNumber) {
        return mAttempts[attemptNumber][WEIGHT];
    }

    public int getAttemptVerdict(int attemptNumber) {
        return mAttempts[attemptNumber][VERDICT];
    }
}
