public class Dog extends Animal {
    public static int countDog;

    {
        countDog += 1;
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public void run(Double length) {
        Double maxLength = 500.0;
        if (length > maxLength) {
            System.out.println(name + " не сможет пробежать " + length + " m");
        } else {
            System.out.println(name + " пробежал(a) " + length + " m");
        }

    }

    @Override
    public void swim(Double length) {
        Double maxLength = 10.0;
        if (length > maxLength) {
            System.out.println(name + " не сможет проплыть " + length + " m");
        } else {
            System.out.println(name + " проплыл(a) " + length + " m");
        }
    }
}
