package designpatterns.Behavioral.Iterator;

public class Client {
    public static void main(String[] args) {
        BookCollection bookCollection = new BookCollection();
        bookCollection.addBook(new Book("C++"));
        bookCollection.addBook(new Book("Java"));
        bookCollection.addBook(new Book("Python"));
        bookCollection.addBook(new Book("Design Patterns"));

        Iterator<Book> iterator= bookCollection.createIterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println("Book title: " + book.getTitle());
        }
    }
}
