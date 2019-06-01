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
        s.append("Passengers car:");
        s.append("\nPassengers quantity: ");
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
}
