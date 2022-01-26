package src.main.java.javacore.homework3;

import src.main.java.javacore.homework3.Apple;
import src.main.java.javacore.homework3.Orange;
import src.main.java.javacore.homework3.BoxFruit;
import src.main.java.javacore.homework3.Fruit;

public class TestFruits {

    public static void main(String[] args) {
        dealWithFruits();
    }

    private static void dealWithFruits() {
        BoxFruit<Apple> appleBox = new BoxFruit<Apple>(1);
        BoxFruit<Orange> orangeBox = new BoxFruit<Orange>(1.5);
        BoxFruit<Apple> appleBox2 = new BoxFruit<Apple>(1);

        for (int i = 0; i < 4; i++) {
            orangeBox.addFruit(new Orange());
            appleBox.addFruit(new Apple());
            appleBox2.addFruit(new Apple());
        }

        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());

        appleBox2.addFruit(new Apple());


        System.out.println("Weight appleBox: " + appleBox.getBoxWeight());
        System.out.println("Weight orangeBox: " + orangeBox.getBoxWeight());
        System.out.println("Weights equals - " + appleBox.compare(orangeBox));
        System.out.println("---------------------------------------------");

        appleBox.addFruits(appleBox2);

    }
}
