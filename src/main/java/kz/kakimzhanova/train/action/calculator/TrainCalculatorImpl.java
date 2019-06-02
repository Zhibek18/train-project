package kz.kakimzhanova.train.action.calculator;

import kz.kakimzhanova.train.entity.Train;
import kz.kakimzhanova.train.entity.*;

public class TrainCalculatorImpl implements TrainCalculator {
    public int countPassengers(Train train) {
        int count = 0;
        for (AbstractCar car : train.getCars()) {
            count += car.getPassengersCount();
        }
        return count;
    }

    public int countLuggage(Train train) {
        int count = 0;
        for (AbstractCar car : train.getCars()) {
            count += car.getLuggageCount();
        }
        return count;
    }
}
