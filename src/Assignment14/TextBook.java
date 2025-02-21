
package Assignment14;

import java.util.Date;

public class TextBook extends Book {
    String status;
    public TextBook(){}
    public TextBook(String bookId,String publisher,Date entryDate,double unitPrice,double quantity,String status ){
        super(bookId, publisher, entryDate, unitPrice, quantity);
        this.status=status;
    }
    public void addBook(){
        super.addBook();
        System.out.println("Status:");
        status=scanner.nextLine();
    }
    public void updateBook(String id){
        super.updateBook(id);
        System.out.println("Status:");
        status=scanner.nextLine();
    }
    public void displayBook(){
        super.displayBook();
        System.out.println("Status:"+status);
    }
}
