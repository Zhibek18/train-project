package kz.kakimzhanova.train.action.sorter;

import kz.kakimzhanova.train.entity.AbstractCar;
import kz.kakimzhanova.train.entity.Train;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CarSorterImpl implements CarSorter {
    public Train sortCarsByComfort(Train train) {
        List<AbstractCar> cars = train.getCars();
        Collections.sort(cars, new Comparator<AbstractCar>() {
            public int compare(AbstractCar car1, AbstractCar car2) {
                Integer lvlCar1 = car1.getComfortLevel();
                Integer lvlCar2 = car2.getComfortLevel();
                return lvlCar1.compareTo(lvlCar2);
            }
        });
        return new Train(cars);
    }
}
