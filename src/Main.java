public class Main {
    public static void main(String[] args){
        Animal dog = new Dog();
        dog.running(5);
//----------------------

        Animal cat0 = new Cat();
        Animal dog0 = new Dog();

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
       Homebody homebody0 = new Homebody();
       homebody0.firstName = "Ким";
       homebody0.lastName = "Чен Ын";
       homebody0.havePet = "Есть питомец";
       homebody0.pet = "Котик";

       Gulena gulena0 = new Gulena();
       gulena0.firstName = "Настенька";
       gulena0.lastName = "ЛюбительПирожков3000";
       gulena0.havePet = "Есть питомец";
       gulena0.pet = "Собака";

        System.out.println(homebody0);


        for (int i = 0; i < animal.length; i++){
            if (animal[i] instanceof Cat){
                System.out.println("Котик есть у -  " +homebody0);
            }
            else if (animal[i] instanceof Dog){
                System.out.println("Собачка есть у -  " +gulena0);
            }
        }

//В идеале хотел в gulena0.pet ссылаться на классы. После того как вспомню какой должен быть тип данных, чтобы можно было указать gulena0 = Cat; ))








    }
}
