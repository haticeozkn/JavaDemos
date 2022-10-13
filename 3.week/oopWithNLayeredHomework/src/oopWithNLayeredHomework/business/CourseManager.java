package oopWithNLayeredHomework.business;

import oopWithNLayeredHomework.core.logging.Logger;
import oopWithNLayeredHomework.dataAccess.CourseDao;
import oopWithNLayeredHomework.entities.Course;

import java.util.List;

public class CourseManager {
    private CourseDao courseDao;
    private Logger[] loggers;
    private List<Course> courses;

    public CourseManager(CourseDao courseDao, Logger[] loggers, List<Course> courses) {
        this.courseDao=courseDao;
        this.loggers=loggers;
        this.courses=courses;
    }

    public void add(Course course) throws Exception {
        for(Course course1: courses) {
            if(course1.getCourseName() == course.getCourseName()) {
                throw new Exception("Kurs ismi aynı olamaz.");
            }
        }
        if (course.getCoursePrice() <= 0) {
            throw new Exception("Ürün fiyatı 0'dan küçük olamaz.");
        }

        courseDao.add(course);
        courses.add(course);
        for(Logger logger: loggers) {
            logger.log(course.getCourseName());
        }
    }
}
