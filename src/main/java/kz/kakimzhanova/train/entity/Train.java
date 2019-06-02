package kz.kakimzhanova.train.entity;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

import kz.kakimzhanova.train.action.calculator.TrainCalculator;
import kz.kakimzhanova.train.action.calculator.TrainCalculatorImpl;
import kz.kakimzhanova.train.util.IdGenerator;

public class Train {
    private long trainId;
    private List <AbstractCar> cars;

    public Train() {
        trainId = IdGenerator.generateTrainId();
        cars = new ArrayList <>();
    }

    public Train(List <AbstractCar> cars) {
        trainId = IdGenerator.generateTrainId();
        this.cars = cars;
    }

    public long getId(){
        return trainId;
    }

    public List <AbstractCar> getCars() {
        return Collections.unmodifiableList(cars);
    }

    public void addCar(AbstractCar... car) {
        cars.addAll(Arrays.asList(car));
    }
    @Override
    public String toString() {
        TrainCalculator trainCalculator = new TrainCalculatorImpl();
        StringBuilder s = new StringBuilder();
        String border = "\n************************************\n";
        s.append(border);
        s.append("Train id: ");
        s.append(trainId);
        s.append("\n");
        if (!cars.isEmpty()) {
            for (AbstractCar car : cars) {
                s.append(car);
                s.append("------------------------------------\n");
            }
            s.append("Total passengers count: ");
            s.append(trainCalculator.countPassengers(this));
            s.append("\nTotal luggage count: ");
            s.append(trainCalculator.countLuggage(this));
        }
        else{
            s.append("This train is empty\n");
        }
        s.append(border);
        return s.toString();
    }

}
