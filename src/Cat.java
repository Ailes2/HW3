public class Cat extends Animal{
    private boolean cute;
    private String antennae;

    public Cat(int age, String name, String color, String male, boolean cute, String antennae) {
        super(age, name, color, male);
        this.cute = cute;
        this.antennae = antennae;
    }
    public Cat(){
    }
}
