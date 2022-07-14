package lesson4;

public class HomeHelp4 {
    //1.1 одна собачка
    public static void oneOfDog(String login) {
        String[] partsOfLoginDog = login.split("@");
        System.out.println("1.1) " + (partsOfLoginDog.length > 2 ? "Удалите лишнюю @" :
                (partsOfLoginDog.length == 1 ? "Не хватает @" : "Проверено!"))
        );
    }

    //1.2 должна быть одна точка
    public static void oneOfDot(String login) {
        String[] partsOfLoginDot = login.split("\\.");
        System.out.println("1.2) " + (partsOfLoginDot.length > 2 ||
                (login.charAt(login.length() - 1) == '.' && partsOfLoginDot.length > 1) ?
                "Удалите лишнюю ." : (partsOfLoginDot.length == 1 && (login.charAt(login.length() - 1) != '.')
                ? "Не хватает ." : "Проверено!"))
        );
    }

    //1.3 точка не должна быть вначале/конце слова, собачки, две подряд
    public static void chekOfDot(String login) {

        String[] partsOfchekOfDotDoble = login.split("\\.");
        for (int i = 0; i < partsOfchekOfDotDoble.length; i++) {
            if (partsOfchekOfDotDoble[i].length() < 1) {
                System.out.println("1.3) Точка стоит в недопустимом месте");
                return;
            }
        }

        String[] partsOfchekOfDot = login.split("@");
        char s1 = partsOfchekOfDot[0].charAt(0);
        char s2 = partsOfchekOfDot[0].charAt(partsOfchekOfDot[0].length() - 1);
        char s3 = partsOfchekOfDot[1].charAt(0);
        char s4 = partsOfchekOfDot[1].charAt(partsOfchekOfDot[1].length() - 1);

        if (s1 != '.' && s2 != '.' && s3 != '.' && s4 != '.') {
            System.out.println("1.3) Проверено!");
        } else System.out.println("1.3) Точка стоит в недопустимом месте");


    }

    //2.1 пароль не должен соответствовать почте
    public static void loginNotPassword(String login, String password) {
        System.out.println("2.1) " + (login.equals(password) ? "Логин и пароль не должны совпадать" : "Проверено!")
        );
    }

    //2.2 должен иметь минимум 8 символов
    public static void passwordHave8Simvol(String password) {
        System.out.println("2.2) " + (password.length() < 8 ? "Слишком короткий пароль" : "Проверено!")
        );
    }

    //2.3 одна заглавная
    public static void oneOfBigSimvol(String password) {
        System.out.println("2.3) " + (password.replaceAll("[^A-Z]", "").length() >= 1 ? "Проверено!" :
                "Необходимо ввести заглавную букву"));
    }

    // 2.4) один символ
    public static void oneOfSimvol(String password) {
        System.out.println("2.4) " + (password.replaceAll("\\D", "").length() >= 1 ? "Проверено!" :
                "Необходимо ввести символ"));
    }

    // 2.5) на английском
    public static void englishText(String password) {
        System.out.println("2.5) " + (password.replaceAll("[^a-zA-Z\\d]", "").length() < password.length()
                ? "Можно использовать только Латиницу и Цифры" : "Проверено!"));
    }


    // 2.6) не должно быть три символа подрят sdfgkeeehxjsd не должно быть!
    public static void not3Simvol(String password) {
        for (int i = 0; i < password.length() - 3; i++) {
            if ((password.charAt(i) == password.charAt(i + 1)) && (password.charAt(i) == password.charAt(i + 2))) {
                System.out.println("2.6) Не должно быть 3 символа подрят");
                return;
            }
        }
        System.out.println("2.6) Проверено!");
    }

    // 3) сделать калькулятор вотдельном класе
    public static void calcSumm(int a, int b) {
        System.out.println("3.1) a+b=" + (a + b));
        return;
    }

    public static void calcDiff(int a, int b) {
        System.out.println("3.2) a-b=" + (a - b));
        return;
    }

    public static void calcMultp(int a, int b) {
        System.out.println("3.3) a*b=" + (a * b));
        return;
    }

    public static void calcDivis(int a, int b) {
        double a1 = Double.valueOf(a);
        double c = a1 / b;
        System.out.println("3.4) a/b=" + c);
        return;
    }
}
