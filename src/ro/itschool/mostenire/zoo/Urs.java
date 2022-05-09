package ro.itschool.mostenire.zoo;

public class Urs extends Animal{

    public Urs(String nume, String specie, int varsta) {
        super(nume, specie, varsta);
    }
    public void rage(){
        System.out.println(this.getNume() + " face Mor Mor!");
    }

    @Override
    public void mananca(){
        System.out.println(this.getNume() + " mananca mult!");
    }
}
