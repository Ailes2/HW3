public class Dog extends Animal{
    String breed;
    String Wool;

    public Dog(int age, String name, String color, String male, String breed, String wool) {
        super(age, name, color, male);
        this.breed = breed;
        Wool = wool;

    }
    public Dog() {
    }

    @Override
    public void running(int hours) {
        super.running(hours + 3); //пока мы не видим, они бегают))))))
    }
}
