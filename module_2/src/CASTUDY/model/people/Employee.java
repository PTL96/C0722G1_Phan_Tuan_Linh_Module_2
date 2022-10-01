package CASTUDY.model.people;

public class Employee extends Person{
    private String level;
    private String location;
    private String wage;
    private double iDNumber;

    public Employee() {
    }

    public Employee(String code, String name, String dateOfBirth, String sex, String phoneNumber, String email) {
        super(code, name, dateOfBirth, sex, phoneNumber, email);
    }

    public Employee(String level, String location, String wage, double iDNumber) {
        this.level = level;
        this.location = location;
        this.wage = wage;
        this.iDNumber = iDNumber;
    }

    public Employee(String code, String name, String dateOfBirth, String sex, String phoneNumber, String email, String level, String location, String wage, double iDNumber) {
        super(code, name, dateOfBirth, sex, phoneNumber, email);
        this.level = level;
        this.location = location;
        this.wage = wage;
        this.iDNumber = iDNumber;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getWage() {
        return wage;
    }

    public void setWage(String wage) {
        this.wage = wage;
    }

    public double getiDNumber() {
        return iDNumber;
    }

    public void setiDNumber(double iDNumber) {
        this.iDNumber = iDNumber;
    }

    @Override
    public String toString() {
        return super.toString()+"Employee{" +
                "level='" + level + '\'' +
                ", location='" + location + '\'' +
                ", wage='" + wage + '\'' +
                ", iDNumber=" + iDNumber +
                '}';
    }
}
