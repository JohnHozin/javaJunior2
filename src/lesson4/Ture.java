package lesson4;

public class Ture {
    public static void getCountry(String[][] mass, String country) {
        for (int i = 0; i < mass.length; i++) {
            System.out.printf((mass[i][0] == country ?
                            "Страна %s, стоимость %s, %s звёзд, добираться %s, кормят %s\n" : ""),
                    mass[i][0], mass[i][1], mass[i][2], mass[i][3], mass[i][4]);

        }
    }

    public void delCountry(String[][] mass, String country) {

    }

    public static void getCountry(String[][] mass, String country, int max) {
        for (int i = 0; i < mass.length; i++) {
            if (Integer.parseInt(mass[i][1]) < max) {


                System.out.printf((mass[i][0] == country ?
                                "Страна %s, стоимость %s, %s звёзд, добираться %s, кормят %s\n" : ""),
                        mass[i][0], mass[i][1], mass[i][2], mass[i][3], mass[i][4]);


            }
        }
    }

    public static void getCountrySum(String[][] mass, int min, int max) {
        for (int i = 0; i < mass.length; i++) {
            System.out.printf((Integer.parseInt(mass[i][1]) >= min && Integer.parseInt(mass[i][1]) <= max ?
                            "Страна %s, стоимость %s, %s звёзд, добираться %s, кормят %s\n" : ""),
                    mass[i][0], mass[i][1], mass[i][2], mass[i][3], mass[i][4]);

        }
    }

    public static int summ(int a, int b) {
        return a+b;
    }
}


/**
 * Всё это сделать в новом классе
 * alphaBet "[^a-zA-Z]"
 * content
 *
 * 1) Проверить почту на правильность
 * 1.1) одна собачка
 * 1.2) должна быть одна точка
 * 1.3) точка не должна быть вначале/конце слова, собачки, две подряд
 *
 * 2) Проверить пароль
 * 2.1) пароль не должен соответствовать почте
 * 2.2) должен иметь минимум 8 символов
 * 2.3) одна заглавная
 * 2.4) один символ
 * 2.5) на английском
 * 2.7) не должно быть три символа подрят sdfgkeeehxjsd не должно быть!
 *
 * 3) сделать калькулятор вотдельном класе
 */