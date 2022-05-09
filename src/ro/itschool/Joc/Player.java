package ro.itschool.Joc;

public class Player {
    private int viata;
    private int putere;


    public Player() {
        this.viata = 100;
        this.putere = 30;
    }

    public int getPutere() {
        return putere;
    }

    public int getViata() {
        return viata;
    }

    public void heal() {
        if (viata <= 92) {
            viata = viata + 8;
        }
    }

    public void attack(Player enemy){
        enemy.viata = enemy.viata - putere;
    }
}