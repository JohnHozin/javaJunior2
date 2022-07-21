package default2.lesson14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        String text = "Hello world!";
        try {
            FileOutputStream fos = new FileOutputStream("C://Java/test.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
