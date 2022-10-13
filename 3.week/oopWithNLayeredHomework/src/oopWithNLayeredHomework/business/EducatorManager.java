package oopWithNLayeredHomework.business;

import oopWithNLayeredHomework.core.logging.Logger;
import oopWithNLayeredHomework.dataAccess.EducatorDao;
import oopWithNLayeredHomework.entities.Educator;

public class EducatorManager {
    private EducatorDao educatorDao;
    private Logger[] loggers;

    public EducatorManager(EducatorDao educatorDao, Logger[] loggers) {
        this.educatorDao=educatorDao;
        this.loggers=loggers;
    }
    public void add(Educator educator)  {
        educatorDao.add(educator);
        for (Logger logger : loggers) {
            logger.log(educator.getEducatorFirstName());
            logger.log(educator.getEducatorLastName());
        }

    }


}
