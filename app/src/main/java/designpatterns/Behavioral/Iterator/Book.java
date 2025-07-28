package designpatterns.Behavioral.Iterator;

public class Book {
    private final String name;

    public Book(String name) {
        this.name = name;
    }

    public String getTitle() {
        return this.name;
    }
}
