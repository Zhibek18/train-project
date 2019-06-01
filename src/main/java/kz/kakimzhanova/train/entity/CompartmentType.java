package kz.kakimzhanova.train.entity;

public enum CompartmentType {
    LUX("lux", 5, 2), BUSINESS("business", 4, 2),
    ECONOM("econom", 3, 4), OPEN("open", 2, 6);

    private String name;
    private int comfort;
    private int placesNumber;

    CompartmentType(String name, int comfort, int placesNumber) {
        this.name = name;
        this.comfort = comfort;
        this.placesNumber = placesNumber;
    }

    public String toString() {
        StringBuffer s = new StringBuffer("");
        s.append(name);
        s.append("\n");
        s.append("Number of places in compartment: ");
        s.append(placesNumber);
        return s.toString();
    }

    public int getComfort(){
        return comfort;
    }
}
