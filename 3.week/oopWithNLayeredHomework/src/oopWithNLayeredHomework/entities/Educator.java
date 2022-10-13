package oopWithNLayeredHomework.entities;

public class Educator {
    private String educatorFirstName;
    private String educatorLastName;

    public Educator() {
    }

    public Educator(String educatorFirstName, String educatorLastName) {
        this.educatorFirstName=educatorFirstName;
        this.educatorLastName=educatorLastName;
    }

    public String getEducatorFirstName() {
        return educatorFirstName;
    }

    public void setEducatorFirstName(String educatorFirstName) {
        this.educatorFirstName = educatorFirstName;
    }

    public String getEducatorLastName() {
        return educatorLastName;
    }

    public void setEducatorLastName(String educatorLastName) {
        this.educatorLastName = educatorLastName;
    }
}
