package ro.itschool.mostenire;

public class Line extends FormaGeometrica {

    private double endX;
    private double endY;

    public Line(double startX, double startY, String color) {
        super(startX, startY, color);
    }

    public double getEndX() {
        return endX;
    }

    public void setEndX(double endX) {
        this.endX = endX;
    }

    public double getEndY() {
        return endY;
    }

    public void setEndY(double endY) {
        this.endY = endY;
    }
}
