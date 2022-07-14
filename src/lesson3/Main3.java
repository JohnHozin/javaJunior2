package lesson3;

public class Main3 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 24; j++) {
                for (int k = 0; k < 60; k++) {
                    for (int l = 0; l < 60; l++) {
                        System.out.printf("Прошло %d дней, %d часов, %d минут," +
                                " %d секунд \n", i, j, k, l);
                        Thread.sleep(1000);
                    }
                }
            }
        }
    }
}
