package ro.itschool.mostenire.zoo;

public class Maimuta extends Animal {

    private int numarDegete;

    public Maimuta(String nume, String specie, int varsta) {
        super(nume, specie, varsta);
    }

    public int getNumarDegete() {
        return numarDegete;
    }

    public void setNumarDegete(int numarDegete) {
        this.numarDegete = numarDegete;
    }
    public void setCatara(){
        String nume = this.getNume();
        System.out.println(nume + " se catara!");
    }
}
