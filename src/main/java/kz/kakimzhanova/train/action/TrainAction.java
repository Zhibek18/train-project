package kz.kakimzhanova.train.action;
import kz.kakimzhanova.train.entity.Train;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.lang.Integer.*;

import kz.kakimzhanova.train.entity.*;
public class TrainAction {
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
    public Train sortCarsByComfort(Train train) {
        List<AbstractCar> cars = train.getCars();
        Collections.sort(cars, new Comparator<AbstractCar>() {
            public int compare(AbstractCar car1, AbstractCar car2) {
                Integer lvlCar1 = new Integer(car1.getComfortLevel());
                Integer lvlCar2 = new Integer(car2.getComfortLevel());
                return lvlCar1.compareTo(lvlCar2);
            }
        });
        return new Train(cars);
    }

    public Train findCarsPassengersRange(Train train, int min, int max) {
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
