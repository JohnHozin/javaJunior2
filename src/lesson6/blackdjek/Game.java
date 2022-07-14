package lesson6.blackdjek;

import java.util.ArrayList;
import java.util.Random;

public class Game implements IGame {
    private Coloda col =new Coloda();

    private Player[] players = new Player[6];

    public Game(Player player) {
        playersArr.add(player);
        //players[0] = player;
    }

    public Game() {

    }

    private ArrayList<Player> playersArr = new ArrayList<Player>();


    @Override
    public void addPlayer(Player player) {
        playersArr.add(player);

//        for (Player p:players){
//            if (p==null){
//                p=player;
//                return;
//            }
//        }

//        for (int i = 0; i < players.length; i++) {
//            if (players[i] == null) {
//                players[i] = player;
//                return;
//            }
//        }
    }

    @Override
    public void addTwoKartaToPlayer() {
        for (Player player:playersArr){
            player.addKart(this.col.getsRandomKart());
            player.addKart(this.col.getsRandomKart());
        }
//        player.addKart(new Coloda().getsRandomKart());
//        player.addKart(new Coloda().getsRandomKart());

//        kartas[0]= new Coloda().getsRandomKart();
//
//        kartas[1]= new Coloda().getsRandomKart();


    }

    @Override
    public void needMoreKarta() {
//        Random rnd = new Random();
//        int b = rnd.nextInt(100);
//
//        for (int i = 0; i < players.length; i++) {
//            if (players[i] == null) {
//                return;
//            }
//            int value = players[i].getValuesKart();
//
//            if (value < 10) {
//                addKartaToPlayer(players[i]);
//            } else if (value < 15) {
//                if (b < 60) {
//                    addKartaToPlayer(players[i]);
//                }
//            } else if (value < 19) {
//                if (b < 20) {
//                    addKartaToPlayer(players[i]);
//                }
//            }
//        }


        /**
         * если меньше 10 очков 100% запрашивать карту
         * если меньше 15 очков 60% запрашвать карту
         * если меньше 19 очков 20% запрашвать карту
         * рандом
         */

        for (Player player:playersArr){
            boolean b = player.needKartHad();
            while (b){
                    player.addKart(this.col.getsRandomKart());
                    b = player.needKartHad();
            }
        }

    }



    @Override
    public void printToWin() {
//        Integer[] values = new Integer[players.length];
//
//        for (int j = 21; j > 0; j--) {
//            for (int i = 0; i < players.length; i++) {
//                if (players[i] == null) {
//                    break;
//                }
//                values[i] = players[i].getValuesKart();
//               //System.out.println(new Player().getValuesKart());
//                //System.out.println(players[i].getValuesKart());
//                if (j == values[i]) {
//                    System.out.println("Победил " + players[i]);
//                }
//            }
//
//        }


//        for (int j = 0; j < values.length - 1; j++) {
//            for (int k = 1; k < values.length; k++) {
//                if (values[j] < values[k]) {
//                    int valuesHelp = values[j];
//                    values[j] = values[k];
//                    values[k] = valuesHelp;
//                }
//            }
//        }
//        for (int m = 0; m < values.length; m++) {
//
//        }


        /**
         * если пролетел 21 очко то проиграл
         * вывести игрока с максимальным количесвом очков
         */

        int count = 0;

        for (Player player:playersArr){
            if (player.showPowerPlayer()>21){
                player.setGame(false);
            }
            else count++;
        }
        int winValue=0;
        if (count>0){
            if (count==1){
                for (Player player:playersArr){
                    if(player.isGame()){
                        System.out.println("Победил единственный игрок");
                        player.vskritie();
                        return;
                    }
                }
            }
            else {
                for (Player player:playersArr){
                    if (winValue<player.showPowerPlayer()){
                        winValue=player.showPowerPlayer();
                    }
                }
                for (Player player:playersArr){
                    if (winValue==player.showPowerPlayer()){
                        System.out.println("Победитель!");
                        player.vskritie();
                    }
                }
            }
        }else {
            System.out.println("Диллер победил");

        }

    }
}
