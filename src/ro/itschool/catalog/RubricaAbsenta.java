package ro.itschool.catalog;

import java.util.ArrayList;

public class RubricaAbsenta {

        private Materie materie;

        private ArrayList<Absenta> absente = new ArrayList<>();

        public Materie getMaterie() {
            return materie;
        }

        public void setMaterie(Materie materie) {
            this.materie = materie;
        }

        public ArrayList<Absenta> getAbsente() {
            return absente;
        }

        public void setAbsente(ArrayList<Absenta> absente) {
            this.absente = absente;
        }

        public void addAbsenta(Absenta absenta1) {
            absente.add(absenta1);
        }
    }

