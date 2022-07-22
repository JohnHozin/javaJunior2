package default2.lesson15;

import java.io.FileInputStream;
import java.io.*;
import java.net.*;

public class Main1 {
    public static void main(String[] args) {

        try {
            FileInputStream fin = new FileInputStream("C://Java/ip.txt");
            int i;
            String result = "";
            while ((i = fin.read()) != -1) {
                if (i == 13) continue;
                else if (i == 10) {
                    String ip = result.split(":")[0];
                    int port = Integer.parseInt(result.split(":")[1]);
                    MyThreadHome thread = new MyThreadHome(ip, port);
                    thread.start();
                    result = "";
                } else if (i == 9) {
                    result += ":";
                } else {
                    result += (char) i;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void checkProxy(String ip, int port) {
        try {
            Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(ip, port));
            URL url = new URL("https://vozhzhaev.ru/test.php");
            URLConnection connection = url.openConnection(proxy);
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            FileOutputStream fos = new FileOutputStream("C://Java/testIpProxy.txt", true);
            String testIP = ip + ":" + port + "\n";
            byte[] buffer = testIP.getBytes();
            fos.write(buffer, 0, buffer.length);
            in.close();
        } catch (Exception e) {
            //System.out.println("ip: " + ip + " port: " + port + " - НЕ РАБОТАЕТ!");
        }
    }
}

class MyThreadHome extends Thread {
    private String ip;
    private int port;

    public MyThreadHome(String ip, int port) {
        this.ip = ip;
        this.port = port;
    }

    @Override
    public void run() {
        Main1.checkProxy(this.ip, this.port);
    }
}