package lesson4;

public class Main {
    public static void main(String[] args) {
//        if (true/false){
//            1
//        }else {
//            2
//        }
//
//        (true/false)?1:2;

        int i = 5;
        if (i > 5) {
            System.out.println("I больше 5");
        } else {
            System.out.println("I меньше 5");
        }

        System.out.println(i > 5 ? "I больше 5" : "I меньше 5"); //тернальный оператор аналогичен иф


    }
}
