public class Gulena extends People {
//Между прочим "Гулёна" литературное слово человека, который любит гулять)
    String firstName;
    String lastName;
    String havePet;
    String pet;
    int motivationtolive = 999999999;

    public Gulena(String race, String gender, int age, String firstName, String lastName, String havePet, String pet, int motivationtolive) {
        super(race, gender, age);
        this.firstName = firstName;
        this.lastName = lastName;
        this.havePet = havePet;
        this.pet = pet;
        this.motivationtolive = motivationtolive;
    }

    public Gulena() {
    }

    @Override
    public String toString() {
        return "Гулёна{" + "Имя= " + firstName + "; " + "Фамилия= " + lastName + "; " + "Наличие питомца= " + havePet + "; " + "Питомец= " + pet + "; " + "При этом желание жить= " + motivationtolive + ";}";
    }
}