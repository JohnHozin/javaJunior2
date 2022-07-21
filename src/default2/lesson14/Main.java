package default2.lesson14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        String text = "Hello world!";
        try {
            FileOutputStream fos = new FileOutputStream("C://Java/test.txt");
            byte[] buffer = text.getBytes();

            fos.write(buffer, 0 , buffer.length);
            System.out.println("The file has been written");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
