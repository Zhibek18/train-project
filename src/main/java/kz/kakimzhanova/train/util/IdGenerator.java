package kz.kakimzhanova.train.util;

public class IdGenerator {
    private static long trainCounter = 1;
    private static long carCounter = 1;

    public static long generateTrainId() {
        return trainCounter++;
    }

    public static long generateCarId() {
        return carCounter++;
    }
}
