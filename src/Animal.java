import javax.sql.rowset.serial.SQLOutputImpl;
import java.sql.SQLOutput;

public class Animal {
    private int age;
    private String name;
    private String color;
    private String male;

    public Animal(int age, String name, String color, String male) {
        this.age = age;
        this.name = name;
        this.color = color;
        this.male = male;
    }
    public Animal () {
    }
    public void running(int hours){
        System.out.println("Running hours = " + hours);
    }
}
