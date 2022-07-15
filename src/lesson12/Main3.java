package lesson12;

public class Main3 {
    public static void main(String[] args) throws CustomException {
        StringUtils utils = new StringUtilsLesson();

        double ret = 0;
        try {
            ret = utils.div("254", "25");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Введите нормальные числа");
        }
        System.out.println(ret);
        System.out.println("Конец");


        System.out.println();
        int[] map = new int[1];
        try {
            map = utils.findWord("Hello word, many user can word word 1, word!", "word");

        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i = 0; i < map.length; i++) {
            System.out.println(map[i]);
        }
        System.out.println("Конец 1");


        System.out.println();
        double[] d = new double[1];
        try {
            d = utils.findNumbers("bikyhkuyhgvk124 bkhbkhb2.4 hblkbv124,jhkh42.4 jkhbib 4.424 43. 43 dedf .3");
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int j = 0; j < d.length; j++) {
            System.out.println(d[j]);
        }
        System.out.println("Конец 2 ");


    }
}
