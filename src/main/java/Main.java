public class Main {

    public static void main(String[] args) {

        Dog dogBobik = new Dog("Bobik");
        dogBobik.run(501.0);
        dogBobik.swim(100.0);

        Dog dogBella = new Dog("Bella");
        dogBella.run(150.0);

        Cat catMurzik = new Cat("Murzik");
        catMurzik.run(200.0);
        catMurzik.swim(10.0);

        System.out.println("Создано собак: " + Dog.countDog);
        System.out.println("Создано кошек: " + Cat.countCat);
        System.out.println("Создано животных: " + Animal.countAnimal);
    }
}
