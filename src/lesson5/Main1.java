package lesson5;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("Выберете фигуру: ");
        System.out.println("1 - треугольник");
        System.out.println("2 - круг");
        System.out.println("3 - параллелограмм");
        System.out.println("4 - конус");
        System.out.println("5 - овал");
        System.out.println("6 - тетраэдр");

        Scanner sc = new Scanner(System.in);
        int secFigura = sc.nextInt();

        switch (secFigura) {
            case 1:
                System.out.println("Введите A:");
                int a = sc.nextInt();
                System.out.println("Введите B:");
                int b = sc.nextInt();
                System.out.println("Введите C:");
                int c = sc.nextInt();

                if (Treugolnik.pravilniyTreul(a, b, c)) {
                    Treugolnik tr = new Treugolnik();
                    tr.setA(a);
                    tr.setB(b);
                    tr.setC(c);

                    System.out.println("Периметр равен: " + tr.perimetr());
                    System.out.println("Площадь равна: " + tr.ploshd());

                } else {
                    System.out.println("Треугольник неправльный");
                }
                break;
            case 2:
                System.out.println("Введите радиус круга R:");
                int r = sc.nextInt();

                if (Krug.pravilniyKrug(r)) {
                    Krug kr = new Krug();
                    kr.setR(r);

                    System.out.println("Периметр равен: " + kr.dlinaaOkr());
                    System.out.println("Площадь равна: " + kr.ploshd());

                } else {
                    System.out.println("Круг неправльный");
                }
                break;
            case 3:
                System.out.println("Введите сторону A:");
                int a1 = sc.nextInt();
                System.out.println("Введите сторону B:");
                int b1 = sc.nextInt();
                System.out.println("Введите высоту H:");
                int h = sc.nextInt();

                if (Parallelogramm.pravilniyParallelogramm(a1, b1, h)) {
                    Parallelogramm pr = new Parallelogramm();
                    pr.setA(a1);
                    pr.setB(b1);
                    pr.setH(h);

                    System.out.println("Периметр равен: " + pr.perimetr());
                    System.out.println("Площадь равна: " + pr.ploshd());

                } else {
                    System.out.println("Параллелограмм неправльный");
                }
                break;
            case 4:
                System.out.println("Введите радиус R:");
                int r1 = sc.nextInt();
                System.out.println("Введите высоту H:");
                int h1 = sc.nextInt();
                System.out.println("Введите образующую L:");
                int l = sc.nextInt();

                if (Konus.pravilniyKonus(r1, h1, l)) {
                    Konus kn = new Konus();
                    kn.setR(r1);
                    kn.setH(h1);
                    kn.setL(l);

                    System.out.println("Площадь основания равна: " + kn.ploshdOsnovania());
                    System.out.println("Площадь боковой поверхности равна: " + kn.ploshdBokovaya());
                    System.out.println("Площадь полная равна: " + kn.ploshdPolnaya());
                    System.out.println("Объём равен: " + kn.obiem());

                } else {
                    System.out.println("Конус неправльный");
                }
                break;
            case 5:
                System.out.println("Введите первую полуось A:");
                int ra = sc.nextInt();
                System.out.println("Введите вторую полуось B:");
                int rb = sc.nextInt();

                if (Oval.pravilniyOval(ra, rb)) {
                    Oval oval = new Oval();
                    oval.setRA(ra);
                    oval.setRB(rb);

                    System.out.println("Длина овала равна: " + oval.dlina());
                    System.out.println("Площадь равна: " + oval.ploshd());

                } else {
                    System.out.println("Овал неправльный");
                }
                break;
            case 6:
                System.out.println("Введите длину ребра A:");
                int a2 = sc.nextInt();

                if (Tetraedr.pravilniyTetraedr(a2)) {
                    Tetraedr tet = new Tetraedr();
                    tet.setA2(a2);

                    System.out.println("Площадь равна: " + tet.ploshd());
                    System.out.println("Объём равен: " + tet.obiem());

                } else {
                    System.out.println("Тетраедр неправльный");
                }
                break;
            default:
                System.out.println("Неверное число");
        }
    }
}
