package lesson14;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        ////////////////////////База данных////////////////////////////////
        Tovar tovar1 =new Tovar("Компьютер" , 50000);
        Tovar tovar2 =new Tovar("Мышь" , 750);
        Tovar tovar3 =new Tovar("Ноутбук" , 70000);
        Tovar tovar4 =new Tovar("Ведро" , 123);
        Tovar tovar5 =new Tovar("Мотоцикл" , 200000);

        Otziv otziv1 = new Otziv(4,"Нормально");
        Otziv otziv2 = new Otziv(2,"Для друга норм");
        Otziv otziv3 = new Otziv(5,"Отлично");
        Otziv otziv4 = new Otziv(3,"Так себе");
        Otziv otziv5 = new Otziv(1,"Не берите");
        Otziv otziv6 = new Otziv(5,"Не дырявое");
        Otziv otziv7 = new Otziv(2,"Неудобная");
        Otziv otziv8 = new Otziv(1,"Упал");

        tovar1.setOtzivs(otziv1);
        tovar1.setOtzivs(otziv2);
        tovar3.setOtzivs(otziv3);
        tovar5.setOtzivs(otziv4);
        tovar5.setOtzivs(otziv5);
        tovar4.setOtzivs(otziv6);
        tovar2.setOtzivs(otziv7);
        tovar5.setOtzivs(otziv8);

        Obzor obzor = new Obzor("Огонь, надел на друга и он уснул");
        tovar4.setObzors(obzor);
        ////////////////////////База данных////////////////////////////////

        TreeSet<Tovar> tovars = new TreeSet<>();

        tovars.add(tovar1);
        tovars.add(tovar2);
        tovars.add(tovar3);
        tovars.add(tovar4);
        tovars.add(tovar5);

        System.out.println("////////// Сортировка по возрастанию цены /////////");
        for (Tovar t:tovars) {
            System.out.println(t);
        }
        System.out.println();

        TreeSet<Tovar> sortTovar1 = SortTovars.SortTovarPriceDescending(tovars);
        System.out.println("////////// Сортировка по убыванию цены /////////");
        for (Tovar p:sortTovar1) {
            System.out.println(p);
        }
        System.out.println();

        TreeSet<Tovar> sortTovar2 = SortTovars.SortTovarRateAscending(tovars);
        System.out.println("////////// Сортировка по возрастанию рейтинга /////////");
        for (Tovar p:sortTovar2) {
            System.out.println(p);
        }
        System.out.println();

        TreeSet<Tovar> sortTovar3 = SortTovars.SortTovarRateDescending(tovars);
        System.out.println("////////// Сортировка по убыванию рейтинга /////////");
        for (Tovar p:sortTovar3) {
            System.out.println(p);
        }
        System.out.println();

        TreeSet<Tovar> sortTovar4 = SortTovars.SortTovarOtzivAscending(tovars);
        System.out.println("////////// Сортировка по возрастанию отзывов /////////");
        for (Tovar p:sortTovar4) {
            System.out.println(p);
        }
        System.out.println();

        TreeSet<Tovar> sortTovar5 = SortTovars.SortTovarOtzivDescending(tovars);
        System.out.println("////////// Сортировка по убыванию отзывов /////////");
        for (Tovar p:sortTovar5) {
            System.out.println(p);
        }
        System.out.println();
    }
}
