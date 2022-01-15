public class Dog extends Animal {
    private int maxRunLength = 500;
    private int maxSwimLength = 10;

    void run(int length) {
        super.run(length, maxRunLength);
    }

    void swim(int length) {
        super.swim(length, maxSwimLength);
    }
}
