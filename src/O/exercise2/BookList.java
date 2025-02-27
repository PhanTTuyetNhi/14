/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package O.exercise2;
import java.util.ArrayList;

public class BookList {
     ArrayList<Book> bookList = new ArrayList<>();

    public void addBook(Book book) {
        bookList.add(book);
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
    public double calculateTotalAmount(){
        int S=0;
        for (Book book : bookList) {
            S+=book.calculateTotal();
        }
        return S;
    }
}
