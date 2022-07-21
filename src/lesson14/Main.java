package lesson14;

import java.util.Comparator;
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

        tovar1.setOtzivs(otziv1);
        tovar1.setOtzivs(otziv2);
        tovar3.setOtzivs(otziv3);
        tovar5.setOtzivs(otziv4);
        tovar5.setOtzivs(otziv5);

        Obzor obzor = new Obzor("Огонь, надел на друга и он уснул");
        tovar4.setObzors(obzor);
        ////////////////////////База данных////////////////////////////////

        TreeSet<Tovar> tovars = new TreeSet<>();


        tovars.add(tovar1);
        tovars.add(tovar2);
        tovars.add(tovar3);
        tovars.add(tovar4);
        tovars.add(tovar5);

        for (Tovar t:tovars) {
            System.out.println(t);
        }
        System.out.println();

        TreeSet<Tovar> sortTovar = SortTovars.SortTovarRateFromTo(tovars);

        for (Tovar p:sortTovar) {
            System.out.println(p);
        }

//        TreeSet<Tovar> sortTovar = SortTovars.SortTovarNameFromTo(tovars);
//        TreeSet<Tovar> sortTovar = SortTovars.SortTovarOtzivFromTo(tovars);


    }
}
