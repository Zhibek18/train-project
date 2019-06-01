package kz.kakimzhanova.train.report;
import kz.kakimzhanova.train.entity.Train;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TrainReport {
    private static Logger logger = LogManager.getLogger();
    public void printReport(Train train) {
        logger.log(Level.INFO, train);
    }
}
