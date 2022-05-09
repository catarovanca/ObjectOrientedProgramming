package ro.itschool.compozitie.computerSet;

public class Main {
    public static void main(String[] args) {
        /**
         * Vreau sa am un set de calculator numit
         * "Back To school" cu 500euro  care sa contina
         *  Un Mouse Logitech de tip optic cu 800 dpi
         *  Un Monitor Samsung cu diagonala de 17.
         */

        Mouse mouse = new Mouse();
        mouse.setDpi(800);
        mouse.setOptical(true);
        mouse.setName("Logitech");

        Monitor monitor = new Monitor();
        monitor.setName("Samsung");
        monitor.setDisplaySize(17);


        ComputerSet computerSet = new ComputerSet();
        computerSet.setName("Back To school");
        computerSet.setPrice(500);

//        computerSet.setMouse(mouse);
//        computerSet.setMonitor(monitor);

    }
}

