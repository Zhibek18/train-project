package kz.kakimzhanova.train.entity;

public class SeatingCar extends AbstractPassengerCar{
    private int seatsNumber;

    public SeatingCar(int passengersQuantity, int handLuggageQuantity,
                      int seatsNumber) {
        super(passengersQuantity, handLuggageQuantity);
        this.seatsNumber = seatsNumber;
    }

    public String toString() {
        StringBuffer s = new StringBuffer(super.toString());
        s.append("Seats Number: ");
        s.append(seatsNumber);
        s.append("\n");
        return s.toString();
    }

    public int getComfortLevel(){
        return 1;
    }
}
