package Assignment14;

import java.util.ArrayList;

public class BookList {

    ArrayList<Book> bookList = new ArrayList<>();

    public void addBook(Book book) {
        bookList.add(book);
        System.out.println("Book added to list: " + book.bookId);
    }

    public void updateBook(String id) {
        for (Book book : bookList) {
            if (book.bookId.equals(id)) {
                book.updateBook(id);
                return;
            }
        }
        System.out.println("Not found " + id);
    }

    public void deleteBookById(String id) {
        bookList.removeIf(book -> book.bookId.equals(id));
    }

    public void findBookById(String id) {
        for (Book book : bookList) {
            if (book.bookId.equals(id)) {
                book.displayBook();
            }
        }
    }

    public void displayAllBooks() {
        for (Book book : bookList) {
            book.displayBook();
        }
    }
}
