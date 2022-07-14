package lesson5;

public class Main {
    public static void main(String[] args) {

        Treugolnik tr1 = new Treugolnik();
        Treugolnik tr2 = new Treugolnik();

        if (Treugolnik.pravilniyTreul(3,4,5)) {

            tr1.setA(3);
            tr1.setB(4);
            tr1.setC(5);

            tr2.setA(6);
            tr2.setB(7);
            tr2.setC(8);


            tr1.pravilniyTreul();
            int a = tr1.getA();
            int b = tr1.getB();
            int c = tr1.getC();

            if (tr1.perimetr() == -1) {
                System.out.println("Не введена какая-то из сторон");
            } else {
                System.out.println("Периметр равен: " + tr1.perimetr());
            }

            if (tr1.ploshd() == -1) {
                System.out.println("Не введена какая-то из сторон");
            } else {
                System.out.println("Площадь равен: " + tr1.ploshd());
            }

        } else{
            System.out.println("Не правльный треугольник");
        }


    }
}
