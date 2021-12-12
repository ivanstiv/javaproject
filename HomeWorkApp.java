public class HomeWorkApp {
    static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void checkSumSign() {
        int a = 3;
        int b = 4;

        (a+b >= 0) ? System.out.println("Сумма положительная") : System.out.println("Сумма отрицательная");
    }

    static void printColor() {
        int value = 1;

        if (value <= 0) {
            System.out.println("Красная");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    static void compareNumbers() {
        int a = 3;
        int b = 4;

        (a >= b) ? System.out.println("a >= b") : System.out.println("a < b");
    }
}
