package kz.kakimzhanova.train.entity;

public abstract class AbstractPassengerCar extends AbstractCar{
    private int passengersQuantity;
    private int handLuggageQuantity;

    AbstractPassengerCar(int passengersQuantity, int handLuggageQuantity) {
        this.passengersQuantity = passengersQuantity;
        this.handLuggageQuantity = handLuggageQuantity;
    }
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder(super.toString());

        s.append("Passengers quantity: ");
        s.append(passengersQuantity);
        s.append("\nHand luggage quantity: ");
        s.append(handLuggageQuantity);
        s.append("\n");
        return s.toString();
    }

    public int getPassengersCount() {

        return passengersQuantity;
    }

    public int getLuggageCount() {

        return handLuggageQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        AbstractPassengerCar that = (AbstractPassengerCar) o;

        if (passengersQuantity != that.passengersQuantity) return false;
        return handLuggageQuantity == that.handLuggageQuantity;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + passengersQuantity;
        result = 31 * result + handLuggageQuantity;
        return result;
    }
}
