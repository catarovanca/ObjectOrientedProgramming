package ro.itschool.generics.genericsbook;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book();
        book1.setName("Cartea Junglei");
        book1.setAuthor("Mihai");

        Book book2 = new Book();
        book2.setName("Batman");
        book2.setAuthor("Alexandru");


        Container<Book> library = new Container(new Book[20]);
        library.add(book1);
        library.add(book2);

        Book[] booksFromLibrary= library.getObjects();

        for (int i = 0 ; i < booksFromLibrary.length ; i++){
            Book book = booksFromLibrary[i];
            if (book != null){
                System.out.println(book.getName() + " " + book.getAuthor());
            }
        }

        library.remove(1);
        System.out.println("---------------------");
        for (int i = 0 ; i < booksFromLibrary.length ; i++){
            Book book = booksFromLibrary[i];
            if (book != null){
                System.out.println(book.getName() + " " + book.getAuthor());
            }
        }
    }
}
