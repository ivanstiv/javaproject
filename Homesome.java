public class Homesome {
    public static void main(String[] args) {
        invertArray();
        createArr(new int[100],5,7);
        checkArr();
        doubleArray();
        initialArray(6,3);
        minMax(new int[]{1, 11, 0, -6, 7, 0, 1, 1, 5, 0});
    }

    static void invertArray() {
        int[] arr1 = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 1) {
                arr1[i] = 0;
            } else {
                arr1[i] = 1;
            }
            System.out.println("arr[" + i + "] = " + arr1[i]);
        }
    }

    static void createArr(int[] array, int step, int shift) {
        for (int i = 0; i < 100; i++) {
            array[i] = shift + i * step;
            System.out.println("arr[" + i + "] = " + array[i]);
        }
    }

    static void checkArr() {
        int[] arr=new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }
    static void doubleArray() {
        int[][] table = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i==j) {
                    table[i][j] =1;
                }
                System.out.println("table[" + i + "][" + j + "] = " + table[i][j]);
            }
        }
    }
    static void initialArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }

    static void minMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
               max = arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}