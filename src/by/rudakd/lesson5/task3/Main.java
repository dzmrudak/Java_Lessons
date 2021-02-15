package by.rudakd.lesson5.task3;
//3.Book: id, Название, Автор (ы), Издательство, Год издания, Количество страниц, Цена.

public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[5];
        Book book1 = new Book("A", "Remark", "E", 1986, 500, 200);
        Book book2 = new Book("B", "London", "F", 1945, 600, 300);
        Book book3 = new Book("C", "Markes", "G", 1917, 700, 400);
        Book book5 = new Book("E", "Remark", "E", 1988, 505, 210.5);
        Book book4 = new Book("D", "Rend", "H", 1939, 800, 500);

        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        books[4] = book5;

        BookLibrary.booksByAuthor(books);
        BookLibrary.booksByPublisher(books);
        BookLibrary.booksByYear(books);
    }
}
