package ro.itschool.mostenire;

public class FormaGeometrica {

    private double startX;
    private double startY;
    private String color;

    public FormaGeometrica(double startX, double startY, String color) {
        this.startX = startX;
        this.startY = startY;
        this.color = color;
    }

    public double getStartX() {
        return startX;
    }

    public double getStartY() {
        return startY;
    }

    public String getColor() {
        return color;
    }

    public void setStartX(double startX) {
        this.startX = startX;
    }

    public void setStartY(double startY) {
        this.startY = startY;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
