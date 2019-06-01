package kz.kakimzhanova.train.entity;

public class FreightCar extends AbstractCar{
    private int luggageQuantity;
    private double luggageWeight;

    public FreightCar(int luggageQuantity, double luggageWeight) {
        this.luggageQuantity = luggageQuantity;
        this.luggageWeight = luggageWeight;
    }

    public String toString() {
        StringBuffer s = new StringBuffer(super.toString());
        s.append("Freight car:");
        s.append("\nLuggage quantity: ");
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

    public int getComfortLevel(){
        return 0;
    }
}
