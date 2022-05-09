package ro.itschool.mostenire.zoo;

public class Main {
    public static void main(String[] args) {

        Maimuta maimutaCici = new Maimuta("Cici","Macac",24);
        maimutaCici.setCatara();

        Urs urs = new Urs("Marinel","Brun",34);
        urs.rage();


        Animal[] animals = new Animal[2];

        animals[0] = maimutaCici;
        animals[1] = urs;

        for(int i = 0; i < animals.length; i++){
            animals[i].mananca();
        }
    }
}
