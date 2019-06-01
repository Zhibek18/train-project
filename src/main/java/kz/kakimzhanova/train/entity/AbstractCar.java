package kz.kakimzhanova.train.entity;
import kz.kakimzhanova.train.util.IdGenerator;

import java.util.Objects;

public abstract class AbstractCar {
    private long carId;

    public AbstractCar() {
        this.carId = IdGenerator.generateCarId();
    }
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("");
        s.append("Car id: ");
        s.append(carId);
        s.append("\n");
        return s.toString();
    }
    public abstract int getPassengersCount();
    public abstract int getLuggageCount();
    public abstract int getComfortLevel();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractCar that = (AbstractCar) o;
        return carId == that.carId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(carId);
    }
}
