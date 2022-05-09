package ro.itschool.compozitie.computerSet;

public class Mouse {
    private int dpi;
    private String name;
    boolean optical;

    public int getDpi() {
        return dpi;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOptical() {
        return optical;
    }

    public void setOptical(boolean optical) {
        this.optical = optical;
    }

}
