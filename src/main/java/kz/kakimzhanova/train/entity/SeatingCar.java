package kz.kakimzhanova.train.entity;

public class SeatingCar extends AbstractPassengerCar{
    private int seatsNumber;

    public SeatingCar(int passengersQuantity, int handLuggageQuantity,
                      int seatsNumber) {
        super(passengersQuantity, handLuggageQuantity);
        this.seatsNumber = seatsNumber;
    }
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("Seating Car:\n");
        s.append(super.toString());
        s.append("Seats Number: ");
        s.append(seatsNumber);
        s.append("\n");
        return s.toString();
    }

    public int getComfortLevel(){
        return 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        SeatingCar that = (SeatingCar) o;

        return seatsNumber == that.seatsNumber;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + seatsNumber;
        return result;
    }
}
