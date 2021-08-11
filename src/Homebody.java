public class Homebody extends People{
    String firstName;
    String lastName;
    String havePet;
    String pet;
    int motivationtolive = 0;

    public Homebody(String race, String gender, int age, String firstName, String lastName, String havePet, String pet, int motivationtolive) {
        super(race, gender, age);
        this.firstName = firstName;
        this.lastName = lastName;
        this.havePet = havePet;
        this.pet = pet;
        this.motivationtolive = motivationtolive;
    }


    public Homebody(){

    }

    @Override
    public  String toString (){
        return "Домосед{" + "Имя= "+firstName+ "; "+"Фамилия= " +lastName+ "; "+ "Наличие питомца= " + havePet + "; "+ "Питомец= " + pet + "; "+ "При этом желание жить= " + motivationtolive + ";}";
    }
}
