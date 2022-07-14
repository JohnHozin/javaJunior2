package lesson7.figura;

public class Main {
    public static void main(String[] args) {
        Krug k1 = new Krug(3);
        Krug k2 = new Krug(5);

        Kvadrat kv1 = new Kvadrat(4);
        Kvadrat kv2 = new Kvadrat(6);

        Figura[] figuri = new Figura[4];
        figuri[0]=k1;
        figuri[1]=k2;
        figuri[2]=kv1;
        figuri[3]=kv2;

        for (Figura p:figuri){
            p.printObem();
            p.printPloshad();
        }


    }
}
