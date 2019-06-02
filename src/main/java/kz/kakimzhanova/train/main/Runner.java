package kz.kakimzhanova.train.main;
import kz.kakimzhanova.train.action.sorter.CarSorterImpl;
import kz.kakimzhanova.train.entity.*;
import kz.kakimzhanova.train.report.TrainReport;

public class Runner {
    public static void main(String[] args) {
        Train train = new Train();

        AbstractCar dinningCar = new DinningCar(10);
        AbstractCar seatingCar = new SeatingCar(90, 100, 100);
        AbstractCar openCar = new SleepingCar(96, 90, CompartmentType.OPEN);
        AbstractCar freightCar = new FreightCar(160, 1000);
        AbstractCar luxCar = new SleepingCar(35, 40, CompartmentType.LUX);
        AbstractCar businessCar = new SleepingCar(50, 50, CompartmentType.BUSINESS);
        AbstractCar economCar = new SleepingCar(120, 128, CompartmentType.ECONOM);

        train.addCar(dinningCar,seatingCar, openCar, freightCar, luxCar, businessCar, economCar);
        CarSorterImpl carSorter = new CarSorterImpl();
        Train sortedTrain = carSorter.sortCarsByComfort(train);

        TrainReport report = new TrainReport();
        report.printReport(train);
        report.printByPassengersRange(train, 90, 100);
        report.printReport(sortedTrain);

        Train emptyTrain = new Train();
        report.printReport(emptyTrain);


    }
}
