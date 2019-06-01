package kz.kakimzhanova.train.entity;

public class DinningCar extends AbstractCar {
    private int places;

    public DinningCar(int places) {
        this.places = places;
    }

    public String toString() {
        StringBuffer s = new StringBuffer(super.toString());
        s.append("Dinning Car");
        s.append("\nDinning places: ");
        s.append(places);
        s.append("\n");
        return s.toString();
    }
    public int getPassengersCount() {
        return 0;
    }

    public int getLuggageCount() {
        return 0;
    }

    public int getComfortLevel(){
        return 6;
    }
}
