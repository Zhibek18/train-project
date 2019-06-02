package kz.kakimzhanova.train.action.calculator;

import kz.kakimzhanova.train.entity.Train;

public interface TrainCalculator {
    int countPassengers(Train train);
    int countLuggage(Train train);
}
