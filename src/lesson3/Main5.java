package lesson3;

public class Main5 {
    public static void main(String[] args) {


//        String ss = new String("123");
//        StringBuffer stringBuffer = new StringBuffer(s);
//        for (int i = 0; i < 1000000; i++) {
//
//        }

        String s = "123";
        int i = s.length(); // количество символов
        System.out.println(i);

        char c = s.charAt(2);
        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) == '2') {
                System.out.println("Двойка");
            } else System.out.println(s.charAt(j));
        }
    }
}
