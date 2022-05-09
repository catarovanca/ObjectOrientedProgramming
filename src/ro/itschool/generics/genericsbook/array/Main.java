package ro.itschool.generics.genericsbook.array;

import ro.itschool.generics.genericsbook.Book;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Book book = new Book();
        book.setName("Cartea junglei");
        book.setAuthor("Mihai");

        Book book2 = new Book();
        book2.setName("Luceafarul");
        book2.setAuthor("Eminescu");

        //Arraylist
        ArrayList<Book> container = new ArrayList<>();
        container.add(book);
        container.add(book2);

        for( int i = 0; i < container.size(); i ++ ){
            Book bookFromArray = container.get(i);
            System.out.println(bookFromArray.getName() + " " + bookFromArray.getAuthor());

        }
        container.remove(2);

    }
}
