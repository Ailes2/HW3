public class Main {
    public static void main(String[] args){
        Animal dog = new Dog();
        dog.running(5);
//----------------------

        Cat cat0 = new Cat();
        Dog dog0 = new Dog();

        Animal[] animal = new Animal[2];
        animal[0] = dog0;
        animal[1] = cat0;

        for (int i = 0; i < animal.length; i++){
            if (animal[i] instanceof Cat){
                System.out.println("Обнаруженное животное - кот. Похой мальчик((");
            }
            else if (animal[i] instanceof Dog){
                System.out.println("Обнаруженное животное - собака. Ну очень хороший мальчик!!))");
            }
        }
//------------------
       Homebody homebody0 = new Homebody("asiat", "male", 45, "Ким", "Чен Ын", cat0, 0);
       Gulena gulena0 = new Gulena("asiat", "famale", 27, "Настенька","ЛюбительПирожков3000", dog0, 999999999);

        System.out.println(homebody0);

            if (homebody0.getCat() != null){
                System.out.println("Котик есть у -  " +homebody0);
            }
            if (gulena0.getDog() != null){
                System.out.println("Собачка есть у -  " +gulena0);

        }

    }
}
