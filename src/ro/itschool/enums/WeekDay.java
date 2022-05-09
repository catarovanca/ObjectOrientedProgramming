package ro.itschool.enums;

public enum WeekDay {

    LUNI(1), MARTI(2), MIERCURI(3), JOI(4),
    VINERI(5), SAMBATA(6), DUMINICA(7);

    private int dayNo;
    WeekDay(int dayNo){
        this.dayNo = dayNo;
    }

    public int getDayNo() {
        return dayNo;
    }
}
