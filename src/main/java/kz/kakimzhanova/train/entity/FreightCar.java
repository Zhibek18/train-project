package kz.kakimzhanova.train.entity;

public class FreightCar extends AbstractCar{
    private int luggageQuantity;
    private double luggageWeight;

    public FreightCar(int luggageQuantity, double luggageWeight) {
        this.luggageQuantity = luggageQuantity;
        this.luggageWeight = luggageWeight;
    }
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("Freight car:\n");
        s.append(super.toString());
        s.append("Luggage quantity: ");
        s.append(luggageQuantity);
        s.append("\nLuggage weight: ");
        s.append(luggageWeight);
        s.append("kg\n");
        return s.toString();
    }

    public int getPassengersCount() {
        return 0;
    }

    public int getLuggageCount() {
        return luggageQuantity;
    }

    public int getComfortLevel() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        FreightCar that = (FreightCar) o;

        if (luggageQuantity != that.luggageQuantity) return false;
        return Double.compare(that.luggageWeight, luggageWeight) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        result = 31 * result + luggageQuantity;
        temp = Double.doubleToLongBits(luggageWeight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
