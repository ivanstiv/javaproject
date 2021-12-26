public class Cat extends Animal {
    int maxRunLength = 200;
    int maxSwimLength = 0;

    void run(int length) {
        super.run(length, maxRunLength);
    }

    void swim(int length) {
        super.swim(length, maxSwimLength);
    }
}
