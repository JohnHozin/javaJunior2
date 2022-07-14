package lesson9;

public class Main {
    public static void main(String[] args) {

        Book b1 = new Book("Мастер и Маргарита", 1940, "Художественная литература", 504, "Михаил Булгаков");
        Book b2 = new Book("Мёртвые души", 1842, "Азбука - классика", 352, "Николай Гоголь");
        Book b3 = new Book("Двенадцать стульев", 1928, "Текст", 416, "Евгений Петров");
        Book b4 = new Book("Собачье сердце", 1925, "Азбука - классика", 80, "Михаил Булгаков");
        Book b5 = new Book("Граф Монте-Кристо", 1845, "АСТ", 624, "Александр Дюма");
        Book b6 = new Book("Преступление и наказание", 1866, "Азбука", 608, "Федор Достоевский");

        Journal j1 = new Journal("Cosmopolitan", 2018, "Burda", 67, 4);
        Journal j2 = new Journal("National Geographic", 2020, "Национальное географическое общество", 112, 2);
        Journal j3 = new Journal("People", 2016, "Интер", 86, 5);
        Journal j4 = new Journal("Playboy ", 2022, "Burda", 160, 1);


        PrintPub supPublic[] = new PrintPub[]{b1, b2, b3, b4, b5, b6, j1, j2, j3, j4};


        PrintPub.printPublication(supPublic);
        Book.printMaxBook(supPublic);

        Book.sortBookAsk(supPublic);
        PrintPub.printPublication(supPublic);

        Book.sortBookDesc(supPublic);
        PrintPub.printPublication(supPublic);

        Book.sortBookDesc2(supPublic);
        PrintPub.printPublication(supPublic);


    }
}
