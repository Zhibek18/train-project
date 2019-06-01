package kz.kakimzhanova.train.main;
import kz.kakimzhanova.train.entity.*;
import kz.kakimzhanova.train.action.TrainAction;
import kz.kakimzhanova.train.report.TrainReport;

public class Runner {
    public static void main(String[] args) {
        Train train = new Train();
        AbstractCar dinningCar = new DinningCar(10);
        AbstractCar seatingCar = new SeatingCar(90, 100, 100);
        AbstractCar openCar = new SleepingCar(96, 90, CompartmentType.OPEN);
        AbstractCar freightCar = new FreightCar(160, 1000);
        train.addCar(dinningCar,seatingCar, openCar, freightCar);
        TrainAction trainAction = new TrainAction();
        Train sortedTrain = trainAction.sortCarsByComfort(train);

        TrainReport report = new TrainReport();
        report.printReport(train);
        report.printReport(sortedTrain);
    }
}
