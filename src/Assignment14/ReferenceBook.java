
package Assignment14;
import java.util.Date;
public class ReferenceBook extends Book {
    double tax;
    public ReferenceBook(){}
    public ReferenceBook(String bookId,String publisher,Date entryDate,double unitPrice,double quantity,double tax){
        super(bookId, publisher, entryDate, unitPrice, quantity);
        this.tax=tax;
    }
    public void addBook(){
    super.addBook();
        System.out.println("Tax:");
        tax=scanner.nextDouble();
    }
    public void updateBook(String id){
        super.updateBook(id);
        System.out.println("Tax:");
        tax=scanner.nextDouble();
    }
    public void displayBook(){
        super.displayBook();
        System.out.println("Tax:"+tax);
    }
    
}
