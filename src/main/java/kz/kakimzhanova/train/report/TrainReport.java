package kz.kakimzhanova.train.report;
import kz.kakimzhanova.train.action.finder.CarFinder;
import kz.kakimzhanova.train.action.finder.CarFinderImpl;
import kz.kakimzhanova.train.entity.Train;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TrainReport {
    private static Logger logger = LogManager.getLogger();
    public void printReport(Train train) {
        logger.log(Level.INFO, train);
    }

    public void printByPassengersRange(Train train, int min, int max){
        CarFinder carFinder = new CarFinderImpl();
        Train rangeTrain = carFinder.findByPassengersRange(train, min, max);
        StringBuilder s = new StringBuilder();
        s.append("Printing cars from train with trainId:");
        s.append(train.getId());
        s.append(" with passengers number in range from ");
        s.append(min);
        s.append(" to ");
        s.append(max);
        s.append("\n");
        s.append(rangeTrain);
        logger.log(Level.INFO, s);
    }

}
