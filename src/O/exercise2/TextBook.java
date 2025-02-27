package O.exercise2;
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
        System.out.println("Status new or old:");
        status=scanner.nextLine();
    }
    public void updateBook(String id){
        super.updateBook(id);
        System.out.println("Status new or old:");
        status=scanner.nextLine();
    }
    public void display(){
        super.displayBook();
        System.out.println("Status new or old:"+status);
    }
public double calculateDiscount(){
    if(status=="new")
        return super.calculateDiscount()*0.1;
    else 
        return super.calculateDiscount()*0.05;
}
    @Override
    public double calculateTotal() {
        return super.calculateDiscount()-calculateDiscount();
    }
}
