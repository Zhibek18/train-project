package kz.kakimzhanova.train.entity;
import kz.kakimzhanova.train.util.IdGenerator;

public abstract class AbstractCar {
    private long carId;

    public AbstractCar() {
        this.carId = IdGenerator.generateCarId();
    }

    public String toString() {
        StringBuffer s = new StringBuffer("");
        s.append("Car id: ");
        s.append(carId);
        s.append("\n");
        return s.toString();
    }
    public abstract int getPassengersCount();
    public abstract int getLuggageCount();
    public abstract int getComfortLevel();
}
