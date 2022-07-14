package lesson12;

public class Main3 {
    public static void main(String[] args) {
        StringUtils utils = new StringUtilsLesson();


        try {
            utils.div("254","0");
        }catch (Exception e ){
            e.printStackTrace();
            System.out.println("Введите нормальные числа");
        }


        System.out.println("Конец программы");




    }
}
