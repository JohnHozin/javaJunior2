package lesson6.shop;

public class Tovar {
    private String name = new String();
    private int price;
    private int cod;

    private Otziv[] otziv = new Otziv[1000];

    public Tovar(String name, int price, int cod) {
        this.name = name;
        this.price = price;
        this.cod = cod;
    }


    public void addOtziv(Otziv otziv) {
        int col =0;
        for (int i = 0; i < this.otziv.length; i++){
            if (this.otziv[i] == null){
                this.otziv[i] = otziv;
                col = i;
                break;
            }
        }
        System.out.println("Количество Свободных отзывов: "
                + (this.otziv.length - col -1));
    }
}
