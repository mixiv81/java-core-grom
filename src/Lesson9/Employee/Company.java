package Lesson9.Employee;

public class Company {
    private String name;
    private String countryFounded;

    protected String code;

    public int someField;

    public Company(String name, String countryFoundad) {
        this.name = name;
        this.countryFounded = countryFoundad;
    }

    public String getName() {
        return name;
    }

    public String getCountryFounded() {
        return countryFounded;
    }

    public void setCountryFounded(String countryFounded) {
        this.countryFounded = countryFounded;
    }
}
