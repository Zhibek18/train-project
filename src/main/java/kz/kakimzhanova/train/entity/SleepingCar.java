package kz.kakimzhanova.train.entity;

public class SleepingCar extends AbstractPassengerCar {
    private CompartmentType type;

    public SleepingCar(int passengersQuantity, int handLuggageQuantity,
                       CompartmentType type) {
        super(passengersQuantity, handLuggageQuantity);
        this.type = type;
    }

    public String toString() {
        StringBuffer s = new StringBuffer(super.toString());
        s.append("Compartment type: ");
        s.append(type);
        s.append("\n");
        return s.toString();
    }

    public int getComfortLevel(){
        return type.getComfort();
    }
}
