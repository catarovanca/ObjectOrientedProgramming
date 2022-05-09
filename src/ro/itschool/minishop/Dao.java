package ro.itschool.minishop;

import java.util.List;

public interface Dao<T> {

    /**
     * Sa obtina toate elementele dintr-un fisier
     * @return Lista de elemente din fisier
     */
    List<T> getAll();

    /**
     * Gaseste un element dupa un  id
     * @param id Identficator unic
     * @return elementul gasit in fisier dupa id
     */
    T findById(String id);

    /**
     * Sterge un element din fisier dupa id.
     * @param id Id-ul elementului pe care il va sterge.
     */
    void remove(String id);

    /**
     * Adauga un obiect in fisier.
     * @param objectToBeAdded Obiecctul se va adauga in fisier.
     */
    void add(T objectToBeAdded);
}
