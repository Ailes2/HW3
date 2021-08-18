public class Gulena extends Person {
//Между прочим "Гулёна" литературное слово человека, который любит гулять)
    private String firstName;
    private String lastName;
    private Dog dog;
    private int motivationToLive;

    public Gulena(String race, String gender, int age, String firstName, String lastName, Dog dog, int motivationToLive) {
        super(race, gender, age);
        this.firstName = firstName;
        this.lastName = lastName;
        this.dog = dog;
        this.motivationToLive = motivationToLive;
    }

    @Override
    public String toString() {
        return "Gulena{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dog=" + dog +
                ", motivationToLive=" + motivationToLive +
                '}';
    }

    public Dog getDog() {
        return dog;
    }
}