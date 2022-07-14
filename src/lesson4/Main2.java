package lesson4;

public class Main2 {
    public static void main(String[] args) {
        /**
         *  1) public доступен всему проекту
         *      "    " доступен внутри проекта
         *      private доступен внутри класса
         *      protected доступен внутри пакета
         *
         *  2)    static - относится к классу
         *      "    " - относится к объекту
         *
         *  3) возвращаемое значение пример: void - пустой
         *  int число / string текст
         *
         *  4) Наименование метода любое
         *  5) Параметры ()
         *  6) Тело метода {}
         */

//        String s ="1";
//        char i = s.charAt(1);
//
//    }
//    protected void dd(){

        String[][] mas = {{"Турция", "60", "3 звезды", "Самолёт", "3 раза"},
                {"Турция", "70", "4 звезды", "Самолёт", "3 раза"},
                {"Турция", "100", "5 звезды", "Самолёт", "3 раза"},
                {"Египет", "50", "2 звезды", "Самолёт", "0 раз"},
                {"Дагестан", "60", "3 звезды", "Поезд", "3 раза"},
                {"Германия", "100", "3 звезды", "Автобус", "1 раза"}};

        Ture.getCountry(mas, "Турция");
        Ture t = new Ture();
        t.delCountry(mas, "Турция");

        int i = Integer.parseInt("11");
        System.out.println();

        Ture.getCountry(mas, "Турция", 71);
        System.out.println();

        // метод печатает все направления в диапазоне цены
        Ture.getCountrySum(mas, 70, 100);

        int a = Ture.summ(3,5);
        System.out.println(a);

    }
}
