public class Filework {
    public static void main(String[] args) {
        doFour(6);
        check(2, 5);
        doFive(10);
        printWordNTimes("dog", 7);
        isLeapYearBool(2008);
    }

    static boolean check(int a, int b) {
        int s = a + b;
        System.out.println((10 <= s) && (s <= 20));
        return (10 <= s) && (s <= 20);
    }

    static void doFour(int a) {
        System.out.println("\nЗадание 4.");
        if (a >= 0) {
            System.out.println(a + "положительное");
        } else {
            System.out.println(a + " отрицательное");
        }
    }

    static boolean doFive(int a) {
        System.out.println("10");
        if (a < 0) return true;
        return false;
    }

    static void printWordNTimes(String word, int times) {
        for (int j = 0; j < times; j++) {
            System.out.println(word);
        }
    }

    static void isLeapYearBool(int x) {
        System.out.println(x % 4 == 0 && x % 100 != 0 || x % 400 == 0);
    }
}

    