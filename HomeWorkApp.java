public class HomeWorkApp {
    public static void main(String[] args) {
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
        String result = (a+b >= 0) ? "Сумма положительная" : "Сумма отрицательная";

        System.out.println(result);
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
        String result = (a >= b) ? "a >= b" : "a < b";

        System.out.println(result);
    }
}
