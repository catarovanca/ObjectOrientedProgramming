package ro.itschool.incapsulation;

public class PC {

    private int numarProcesare; // 0
    private int memorieRam; // 0
    private int capacitateHDD; // 0

                                        // -5
    public void setNumarProcesoare(int nrProcesoare){
        if(nrProcesoare > 0){
            numarProcesare = nrProcesoare;
        }
    }
    public void setMemorieRam(int memorieRam){
        this.memorieRam = memorieRam;
    }
    public void setCapacitateHDD(int capacitateHDD){
        this.capacitateHDD = capacitateHDD;
    }
    public int getMemorieRam(){
        return this.memorieRam;
    }
    public int getNumarProcesare(){
        return this.numarProcesare;
    }
    public int getCapacitateHDD(){
        return this.capacitateHDD;
    }
}
