package ro.itschool.Joc;

import java.util.Scanner;

public class Game {
    private Player player1;
    private Player player2;


    public void startGame() {
        this.player1 = new Player();
        this.player2 = new Player();

        Scanner cititor = new Scanner(System.in);
        do {
            // meniu player1
            System.out.println("Player1:");
            System.out.println("1.Ataca");
            System.out.println("2.Videca-te");
            int optiune = cititor.nextInt();
            cititor.nextLine();
            if (optiune == 1) {
                this.player1.attack(player2);
            } else if (optiune == 2) {
                this.player1.heal();
            }
            //meniu player2

            System.out.println("Player 2:");
            System.out.println("1.Ataca");
            System.out.println("2.Videca-te");
            int optiune2 = cititor.nextInt();
            cititor.nextLine();
            if (optiune2 == 1) {
                this.player2.attack(player1);
            } else if (optiune2 == 2) {
                player2.heal();
            }

            System.out.println("Player1: " + player1.getViata());
            System.out.println("Player2:" + player2.getViata());

        } while (player1.getViata() != 0 ||
                player2.getViata() != 0);
    }
}
