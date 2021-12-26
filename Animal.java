public class Animal  {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        dog.run(490);
        dog.swim(7);
        cat.run(10);
        cat.swim(30);
    }

    void run(int length, int maxRun) {
        int result = (length > maxRun) ? maxRun : length;
        System.out.println(this.getClass().getSimpleName() + " run " + result + " metres");
    }

    void swim(int length, int maxSwim) {
        int result = (length > maxSwim) ? maxSwim : length;
        System.out.println(this.getClass().getSimpleName() + " swim " + result + " metres");
    }
}
