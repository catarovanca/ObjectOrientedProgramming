package ro.itschool.generics.genericsbook.array;

import ro.itschool.generics.genericsbook.Book;

import java.util.HashMap;
import java.util.Map;

public class ExempluMap {
    public static void main(String[] args) {
        //la o litera sa memoram o carte.
        HashMap<Character,Book> dictionar = new HashMap<>();

        Book book = new Book();
        book.setName("Cartea Junglei");
        book.setAuthor("Mircea");
        dictionar.put('C',book);

        Book book1 = new Book();
        book1.setName("Cei trei muschetari");
        book1.setAuthor("Gabriel");

        dictionar.put('T',book1);
        //{'C',book},{'T',book1}
        for (Map.Entry<Character,Book> entry : dictionar.entrySet()){
            Character key = entry.getKey();
            Book bookInMap = entry.getValue();
            System.out.println("La cheia " + key + " se afla cartea! " + bookInMap.getName());

            }
        Book bookFound = dictionar.get('T');
        System.out.println("Cartea gasita:" + bookFound.getName());

    }
}
