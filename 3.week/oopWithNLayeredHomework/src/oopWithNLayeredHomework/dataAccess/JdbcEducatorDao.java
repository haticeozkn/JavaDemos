package oopWithNLayeredHomework.dataAccess;

import oopWithNLayeredHomework.entities.Educator;

public class JdbcEducatorDao implements EducatorDao {
    public void add(Educator educator) {
        System.out.println("JDBC ile veri tabanına eklendi.");
    }
}
