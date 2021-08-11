public class Cat extends Animal{
    boolean cute = true;
    String Antennae;

    public Cat(int age, String name, String color, String male, boolean cute, String antennae) {
        super(age, name, color, male);
        this.cute = cute;
        Antennae = antennae;
    }
    public Cat(){
    }

}
