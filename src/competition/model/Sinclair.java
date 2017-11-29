package competition.model;

public class Sinclair {

    private static final double MAX_WEIGHT_MEN = 175.508;
    private static final double MAX_WEIGHT_WOMEN = 153.655;

    public static double getSinclairFactor(Sex sex, double weight) {

        if (sex == Sex.MEN) {
            if (weight >= MAX_WEIGHT_MEN) {
                return 1;
            } else {
                return Math.pow(10,0.75194503*(Math.log10(weight/MAX_WEIGHT_MEN)*Math.log10(weight/MAX_WEIGHT_MEN)));
            }
        } else if (sex == Sex.WOMEN) {
            if (weight >= MAX_WEIGHT_WOMEN) {
                return 1;
            } else {
                return Math.pow(10,0.783497476*(Math.log10(weight/MAX_WEIGHT_WOMEN)*Math.log10(weight/MAX_WEIGHT_WOMEN)));
            }
        }
        return 0;
    }
}