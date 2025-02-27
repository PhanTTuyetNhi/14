
package O.exercise2;

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
    public void display(){
        super.displayBook();
        System.out.println("Tax:"+tax);
    }
    public double calculateDiscount(){
        return super.calculateDiscount()*0.1;
    }
    @Override
    public double calculateTotal() {
return super.calculateDiscount()+tax-calculateDiscount();
    }
}
