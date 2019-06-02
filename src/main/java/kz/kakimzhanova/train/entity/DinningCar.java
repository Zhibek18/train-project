package kz.kakimzhanova.train.entity;

public class DinningCar extends AbstractCar {
    private int places;

    public DinningCar(int places) {
        this.places = places;
    }
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder(super.toString());
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DinningCar that = (DinningCar) o;

        return places == that.places;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + places;
        return result;
    }
}
