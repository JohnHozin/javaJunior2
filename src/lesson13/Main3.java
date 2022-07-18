package lesson13;

public class Main3 {
    public static void main(String[] args) {
        String s = "Дамир";
        String s1 = new String("Дамир");
        String s2 = "Дамир";
        String s3 = s;

        System.out.println(s == s1);
        System.out.println(s == s2);
        System.out.println(s == s3);
        System.out.println(s1 == s2);

        String ss = "123";
        for (int i = 0;i<100000;i++){
            ss = ss + i;
        }
        System.out.println(ss);
    }
}
