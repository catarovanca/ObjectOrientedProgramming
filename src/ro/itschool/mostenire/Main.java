package ro.itschool.mostenire;

public class Main {
    public static void main(String[] args) {

        Line line = new Line(1, 1, "Black");
        line.setEndX(2);
        line.setEndY(2);

        Cerc cerc = new Cerc(1,1,"Black");
        cerc.setRaza(3);

        FormaGeometrica[] forme = new FormaGeometrica[2];
        forme[0] = line;
        forme[1] = cerc;

        for(int i = 0; i < forme.length; i++){
            FormaGeometrica forma = forme[i];
            if(forma instanceof Cerc){
                Cerc cercForma = (Cerc) forma;
                System.out.println("Cercul cu punctul de inceput " + forma.getStartX() + " " + forma.getStartY()
               + " " + forma.getColor() + "Raza: " + cercForma.getRaza() );
            }
            if( forma instanceof Line){
                Line lineForma = (Line) forma;
                System.out.println("Linie cu coordonatele " + lineForma.getStartX());
            }
        }
    }
}
