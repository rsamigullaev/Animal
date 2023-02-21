public class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public static int countAnimal;

    {
        countAnimal += 1;
    }

    public void run(Double length) {
        System.out.println(name + " пробежал(a) " + length + " m");
    }

    public void swim(Double length) {
        System.out.println(name + " может проплыть " + length + " m");
    }
}
