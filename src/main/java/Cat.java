public class Cat extends Animal {
    public static int countCat;

    {
        countCat += 1;
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(Double length) {
        Double maxLength = 200.0;
        if (length > maxLength) {
            System.out.println(name + " не сможет пробежать " + length + " m");
        } else {
            System.out.println(name + " пробежал(a) " + length + " m");
        }
    }

    @Override
    public void swim(Double length) {
        System.out.println(name + " не умеет плавать");

    }
}
