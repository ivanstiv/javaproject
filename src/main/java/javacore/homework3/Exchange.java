public class Exchange {
    public static void main(String[] args) {
        arrayExchange(new int[]{4,67,8},0,2);
    }
    public static void arrayExchange(int[] array, int a,int b) {
        int tmp_b = array[b];
        array[b] = array[a];
        array[a] = tmp_b;
        for (int i = 0; i < array.length; i++) {
            System.out.println("arr[" + i + "] = " + array[i]);
        }
    }
}