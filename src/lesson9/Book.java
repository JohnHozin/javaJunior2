package lesson9;

public class Book extends PrintPub {
    private String avtor;


    public Book() {
    }

    public Book(String name, int year, String pub, int kolList, String avtor) {
        super(name, year, pub, kolList);
        this.avtor = avtor;
    }

    public String getAvtor() {
        return avtor;
    }

    public void setAvtor(String avtor) {
        this.avtor = avtor;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Book book = (Book) o;

        return avtor != null ? avtor.equals(book.avtor) : book.avtor == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (avtor != null ? avtor.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                " название: " + super.getName() +
                ", автор: " + avtor +
                ", год: " + super.getYear() +
                ", издательство: " + super.getPub() +
                ", кол-во страниц: " + super.getKolList() +
                '}';
    }


    public static void printMaxBook(PrintPub[] p) {
        Book b = null;
        for (PrintPub pub : p) {
            if (pub instanceof Book) {

                if (b == null)
                    b = (Book) pub;
                else if (b.getKolList() < ((Book) pub).getKolList())
                    b = (Book) pub;
            }
        }
        System.out.println("Самая большая книга: " + b + "\n");
    }


    public static PrintPub[] sortBookAsk(PrintPub[] p) {
        Book b = null;
        for (int i = 0; i < p.length - 1; i++) {
            if (p[i] instanceof Book) {
                for (int j = i + 1; j < p.length; j++) {
                    if (p[j] instanceof Book) {
                        if (((Book) p[i]).getKolList() < ((Book) p[j]).getKolList()) {
                            b = (Book) p[i];
                            p[i] = p[j];
                            p[j] = b;
                        }
                    }
                }
            }
        }
        return p;
    }

    public static PrintPub[] sortBookDesc(PrintPub[] p) {
        Book b = null;
        for (int i = 0; i < p.length - 1; i++) {
            if (p[i] instanceof Book) {
                for (int j = i + 1; j < p.length; j++) {
                    if (p[j] instanceof Book) {
                        if (((Book) p[i]).getKolList() > ((Book) p[j]).getKolList()) {
                            b = (Book) p[i];
                            p[i] = p[j];
                            p[j] = b;
                        }
                    }
                }
            }
        }
        return p;
    }

    public static PrintPub[] sortBookDesc2(PrintPub[] p) {
        for (int i = 0; i < p.length; i++) {
            for (int j = 1 + i; j < p.length; j++) {
                if (p[i].getKolList()>p[j].getKolList()){
                    int ii =  p[i].getKolList();
                    int jj =  p[j].getKolList();

                    p[i].setKolList(jj);
                    p[j].setKolList(ii);

                }
            }
        }
        return p;
    }
}
