package kz.kakimzhanova.train.entity;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import kz.kakimzhanova.train.util.IdGenerator;

public class Train {
    private long trainId;
    private List <AbstractCar> cars;

    public Train() {
        trainId = IdGenerator.generateTrainId();
        cars = new ArrayList <AbstractCar>();
    }

    public Train(List <AbstractCar> cars) {
        trainId = IdGenerator.generateTrainId();
        this.cars = cars;
    }

    public List <AbstractCar> getCars() {
        return new ArrayList <AbstractCar>(cars);
    }
    public void addCar(AbstractCar... car) {
        cars.addAll(Arrays.asList(car));
    }

    public String toString() {
        StringBuffer s = new StringBuffer("");
        s.append("Train id: ");
        s.append(trainId);
        s.append("\n");
        for (AbstractCar car : cars) {
            s.append(car);
            s.append("---------------------------\n");
        }
        return s.toString();
    }

}
