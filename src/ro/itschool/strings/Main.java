package ro.itschool.strings;

public class Main {
    public static void main(String[] args) {
        String a = "Gabi";
        String b = "Gabi";
        String c = new String("Gabi");

        if(a.equals(b) ){
            System.out.println("a == b True");
        } else {
            System.out.println("a == b False");
        }
        if ( b.equals(c)){
            System.out.println("b == c True");
        } else {
            System.out.println("b == c False");
        }
    }
}
