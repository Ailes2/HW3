public class Person {
    private String race;
    private String gender;
    private int age;

    public Person(String race, String gender, int age) {
        this.race = race;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "race='" + race + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
