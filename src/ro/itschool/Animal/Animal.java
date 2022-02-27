package ro.itschool.Animal;

public class Animal {

    private int varsta;
    private String nume;
    private String culoare;

    public Animal(String nume,String culoare,int varsta){
        this.nume = nume;
        this.culoare = culoare;
        this.varsta = varsta;
    }
    public void setNume(String nume){
        this.nume = nume;
    }
    public void setCuloare(String culoare){
        this.culoare = culoare;
    }

    public void manancGranule(){
        System.out.println("Mananc granule!");
    }
    public void doarme(){
        System.out.println("Dorm!");
    }
    public void joaca(){
        System.out.println("Ma joc!");
    }

    public void latra(){
        System.out.println("How how!");
    }

    public String getNume(){
        return this.nume;
    }
    public void animalDetails(){
        System.out.println(this.nume);
        System.out.println(this.culoare);
        System.out.println(this.varsta);
    }
}
