package ro.itschool.enums;

public class Main {
    public static void main(String[] args) {
        System.out.println(WeekDay.LUNI.getDayNo());
        for(WeekDay weekDay : WeekDay.values()){
            System.out.println("Week: " + weekDay.getDayNo());
        }
    }
}
