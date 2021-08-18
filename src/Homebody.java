public class Homebody extends Person {
    private String firstName;
    private String lastName;
    private Cat cat;
    private int motivationtolive;

    public Homebody(String race, String gender, int age, String firstName, String lastName, Cat cat, int motivationtolive) {
        super(race, gender, age);
        this.firstName = firstName;
        this.lastName = lastName;
        this.cat = cat;
        this.motivationtolive = motivationtolive;
    }

    @Override
    public String toString() {
        return "Homebody{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cat=" + cat +
                ", motivationtolive=" + motivationtolive +
                '}';
    }

    public Cat getCat() {
        return cat;
    }
}
