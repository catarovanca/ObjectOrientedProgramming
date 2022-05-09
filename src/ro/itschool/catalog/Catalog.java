package ro.itschool.catalog;

import java.util.ArrayList;
import java.util.List;

public class Catalog {

    private String name;
    private ArrayList<Student> students =  new ArrayList<>();
    private ArrayList<Materie> materies =  new ArrayList<>();

    public Catalog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Materie> getMateries() {
        return materies;
    }

    public void setMateries(ArrayList<Materie> materies) {
        this.materies = materies;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addMaterie(Materie materie) {
        for(Student student : students){
            RubricaAbsenta rubricaAbsenta = new RubricaAbsenta();
            rubricaAbsenta.setMaterie(materie);
            student.addRubrica(rubricaAbsenta);
        }
        materies.add(materie);
    }

    public void display() {
        for (Materie materie : materies) {
            System.out.print(materie.getName() + " ");
        }
        System.out.println();
        for(Student student: students){
            System.out.print(student.getFirstName() + " " + student.getLastName() + " ");

            ArrayList<RubricaAbsenta> studentAbs = student.getRubricaAbsentas();
            for(RubricaAbsenta rubricaAbsenta : studentAbs){
                System.out.print("[");
                List<Absenta> absenteDinRubrica = rubricaAbsenta.getAbsente();
                for(Absenta absenta : absenteDinRubrica){
                    System.out.print(absenta.getDate() + " ");
                }
                System.out.print("]");
            }
            System.out.println();
        }
    }

    public void addStudent(Student student) {
        for(int i = 0; i < materies.size(); i ++){
            RubricaAbsenta rubricaAbsenta =new RubricaAbsenta();
            Materie materie = materies.get(i);
            rubricaAbsenta.setMaterie(materie);
            student.addRubrica(rubricaAbsenta);
        }

        students.add(student);
    }

    public void markAbsent(String nameOfStudent, String absentSubject, String date) {
        Student studentFound = null;
        for(Student student : students){
            String numeComplet = student.getLastName() + " " + student.getFirstName();
            if(numeComplet.equals(nameOfStudent)){
                studentFound = student;
                break;
            }
        }
        if(studentFound == null){
            System.out.println("Student " + nameOfStudent + " not found!");
            return;
        }

        RubricaAbsenta rubricaAbsentaFound = null;
        List<RubricaAbsenta> rubrici = studentFound.getRubricaAbsentas();
        for(RubricaAbsenta rubrica : rubrici){
            Materie materie = rubrica.getMaterie();
            if(materie.getName().equals(absentSubject)){
                rubricaAbsentaFound = rubrica;
                break;
            }
        }
        if(rubricaAbsentaFound == null){
            System.out.println("Subject " + absentSubject + " not found!");
            return;
        }

        Absenta absenta = new Absenta(date);
        rubricaAbsentaFound.addAbsenta(absenta);

    }
}