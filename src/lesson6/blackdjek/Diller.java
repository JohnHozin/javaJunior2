package lesson6.blackdjek;

public class Diller extends Player {

    @Override
    public boolean needKartHad() {
        int count = 0;
        for (int i = 0; i < super.kartas.length - 1; i++) {
            if (super.kartas[i] != null) {
                count += super.kartas[i].getValue();
            }
        }
        if (count<18)
            return true;
        else
            return false;
    }
}
