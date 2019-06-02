package kz.kakimzhanova.train.action.finder;

import kz.kakimzhanova.train.entity.Train;

public interface CarFinder {
    Train findByPassengersRange(Train train, int min, int max);
}
