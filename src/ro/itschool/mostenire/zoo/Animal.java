package ro.itschool.mostenire.zoo;

public class Animal {

    private String nume;
    private String specie;
    private int varsta;

    public Animal(String nume, String specie, int varsta) {
        this.nume = nume;
        this.specie = specie;
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void mananca(){

        System.out.println(this.nume + " mananca!");
    }
}
