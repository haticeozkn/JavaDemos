package oopWithNLayeredHomework.dataAccess;

import oopWithNLayeredHomework.entities.Category;

public class HibernateCategoryDao implements CategoryDao {
    public void add(Category category) {
        System.out.println("Hibernate ile veri tabanına eklendi.");
    }
}
