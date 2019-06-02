package kz.kakimzhanova.train.entity;

public class SleepingCar extends AbstractPassengerCar {
    private CompartmentType type;

    public SleepingCar(int passengersQuantity, int handLuggageQuantity,
                       CompartmentType type) {
        super(passengersQuantity, handLuggageQuantity);
        this.type = type;
    }
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("Sleeping Car:\n");
        s.append(super.toString());
        s.append("Compartment type: ");
        s.append(type);
        s.append("\n");
        return s.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        SleepingCar that = (SleepingCar) o;

        return type == that.type;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }

    public int getComfortLevel(){

        return type.getComfort();
    }
}
