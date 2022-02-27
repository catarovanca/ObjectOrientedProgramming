package ro.itschool;

public class Dressing {

    int usa;
    int sertare;
    int oglinda;
    int rafturi;
    String culoare;
    String nume;

    public Dressing(int usaData,int sertareDat,int oglindaData,int rafturiDat){
        usa = usaData;
        sertare = sertareDat;
        oglinda = oglindaData;
        rafturi = rafturiDat;
    }
    public Dressing(String culoareData,String numeDat){
        culoare = culoareData;
        nume = numeDat;
    }
}
