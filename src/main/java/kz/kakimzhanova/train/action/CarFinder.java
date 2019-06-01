package kz.kakimzhanova.train.action;

import kz.kakimzhanova.train.entity.AbstractCar;
import kz.kakimzhanova.train.entity.Train;

public class CarFinder {
    public Train findByPassengersRange(Train train, int min, int max) {
        Train newTrain = new Train();
        int count;
        for (AbstractCar car : train.getCars()) {
            count = car.getPassengersCount();
            if (( count >= min)&&(count <= max)) {
                newTrain.addCar(car);
            }
        }
        return newTrain;
    }
}
