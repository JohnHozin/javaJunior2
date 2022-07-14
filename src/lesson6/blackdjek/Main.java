package lesson6.blackdjek;

public class Main {
    public static void main(String[] args) {
//        Coloda col = new Coloda();
//
//        Player play1 = new Player(col.getsRandomKart(), col.getsRandomKart());
//
//        play1.vskritie();
//        System.out.println();
//        System.out.println();
//
//        play1.addKart(col.getsRandomKart());
//
//        play1.vskritie();
//
//        System.out.println();



        Diller d = new Diller();

        Player player1 = new Player();
//        Player player2 = new Player();
//        Player player3 = new Player();

        Game blackjek = new Game(d);
      //  blackjek.addPlayer(d);
        blackjek.addPlayer(player1);
 //       blackjek.addPlayer(player2);




        blackjek.addTwoKartaToPlayer();


        blackjek.needMoreKarta();

  //      blackjek.needMoreKarta();


 //       blackjek.addKartaToPlayer(player1);

//        player1.getValuesKart();

        blackjek.printToWin();




    }
}
