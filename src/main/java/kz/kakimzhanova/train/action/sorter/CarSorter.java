package kz.kakimzhanova.train.action.sorter;

import kz.kakimzhanova.train.entity.Train;

public interface CarSorter {
    Train sortCarsByComfort(Train train);
}
