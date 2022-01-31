package javacore.homework5;

import java.util.Arrays;
import java.io.File;
import javacore.homework5.AppData;

public class HomeWork {

    public static void main(String[] args) {
        String filePath = new File("").getAbsolutePath();
        AppData data = new AppData();
        data.readFromFile(filePath.concat("/javacore/homework5/example.csv"));
        System.out.println(Arrays.toString(data.getHeader()));
        System.out.println(Arrays.deepToString(data.getData()));

        data.writeToCSV(filePath.concat("/javacore/homework5/new_example.csv"));
    }

}
