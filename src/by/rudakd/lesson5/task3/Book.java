package by.rudakd.lesson5.task3;

public class Book {
    public static int id = 1;
    public String name;
    public String author;
    public String publisher;
    public int year;
    public int numberOfPages;
    public double price;

    public static int getId() {
        return id;
    }

    public Book(String name, String author, String publisher, int year, int numberOfPages, double price) {
        id++;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.numberOfPages = numberOfPages;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", year=" + year +
                ", numberOfPages=" + numberOfPages +
                ", price=" + price +
                '}';
    }
}
