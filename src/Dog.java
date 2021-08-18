public class Dog extends Animal{
    private String breed;
    private String wool;

    public Dog(int age, String name, String color, String male, String breed, String wool) {
        super(age, name, color, male);
        this.breed = breed;
        this.wool = wool;

    }
    public Dog() {
    }

    @Override
    public void running(int hours) {
        super.running(hours + 3); //пока мы не видим, они бегают))))))
    }
}
