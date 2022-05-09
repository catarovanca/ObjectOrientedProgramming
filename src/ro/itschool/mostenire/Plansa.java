package ro.itschool.mostenire;

public class Plansa {

    private FormaGeometrica[] forme = new FormaGeometrica[4];


    public void addShape(int index,FormaGeometrica formaGeometrica){
        forme[index] = formaGeometrica;
    }
    public FormaGeometrica[] getForme() {
        return forme;
    }
}

