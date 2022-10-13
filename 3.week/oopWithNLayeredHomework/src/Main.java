import oopWithNLayeredHomework.business.CategoryManager;
import oopWithNLayeredHomework.business.CourseManager;
import oopWithNLayeredHomework.business.EducatorManager;
import oopWithNLayeredHomework.core.logging.DataBaseLogger;
import oopWithNLayeredHomework.core.logging.FileLogger;
import oopWithNLayeredHomework.core.logging.Logger;
import oopWithNLayeredHomework.core.logging.MailLogger;
import oopWithNLayeredHomework.dataAccess.HibernateCategoryDao;
import oopWithNLayeredHomework.dataAccess.JdbcCategoryDao;
import oopWithNLayeredHomework.dataAccess.JdbcCourseDao;
import oopWithNLayeredHomework.dataAccess.JdbcEducatorDao;
import oopWithNLayeredHomework.entities.Category;
import oopWithNLayeredHomework.entities.Course;
import oopWithNLayeredHomework.entities.Educator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Logger[] loggers = {new DataBaseLogger(), new FileLogger(), new MailLogger()};

        Category category1 = new Category(1, "Programlama");
        List<Category> categoryList = new ArrayList<Category>();
        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers, categoryList);
        categoryManager.add(category1);

        Course course = new Course("JAVA", 100);
        Course course1 = new Course("C#", 200);
        List<Course> courseList = new ArrayList<Course>();
        CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers, courseList);
        courseManager.add(course);
        courseManager.add(course1);

        Educator educator1 = new Educator("Engin", "Demiroğ");
        EducatorManager educatorManager = new EducatorManager(new JdbcEducatorDao(), loggers);
        educatorManager.add(educator1);


    }
}
