package lesson4;

public class HomeWorkHozin4 {
    public static void main(String[] args) {
        String login = "Ivanov216@mail.ru";
        String password = "qwS3errr4ty";

        // 1) Проверить почту на правильность
        // 1.1) одна собачка
        HomeHelp4.oneOfDog(login);

        // 1.2) должна быть одна точка
        HomeHelp4.oneOfDot(login);

        // 1.3) точка не должна быть вначале/конце слова, собачки, две подряд
        HomeHelp4.chekOfDot(login);

        // 2) Проверить пароль
        // 2.1) пароль не должен соответствовать почте
        HomeHelp4.loginNotPassword(login, password);

        // 2.2) должен иметь минимум 8 символов
        HomeHelp4.passwordHave8Simvol(password);

        // 2.3) одна заглавная
        HomeHelp4.oneOfBigSimvol(password);

        // 2.4) один символ
        HomeHelp4.oneOfSimvol(password);

        // 2.5) на английском
        HomeHelp4.englishText(password);

        // 2.6) не должно быть три символа подрят sdfgkeeehxjsd не должно быть!
        HomeHelp4.not3Simvol(password);

        // 3) сделать калькулятор вотдельном класе
        int a = 17;
        int b = 9;
        HomeHelp4.calcSumm(a, b);
        HomeHelp4.calcDiff(a, b);
        HomeHelp4.calcMultp(a, b);
        HomeHelp4.calcDivis(a, b);
    }
}
