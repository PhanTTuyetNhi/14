
package Assignment14;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public abstract class Book implements IBook{
    String bookId;
    String publisher;
    Date entryDate;
    double unitPrice;
    double quantity;
    public Book(){}
    public Book(String bookId,String publisher,Date entryDate,double unitPrice,double quantity){
        this.bookId=bookId;
        this.publisher=publisher;
        this.entryDate=entryDate;
        this.unitPrice=unitPrice;
        this.quantity=quantity;
    }
            Scanner scanner=new Scanner(System.in);

    public void addBook(){
        System.out.print("ID:");
        bookId=scanner.nextLine();
        System.out.print("Publisher:");
        publisher=scanner.nextLine();
        System.out.println("Enter Date:");
  String dateOfBirthString = scanner.nextLine();
        try {
           SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            entryDate = sdf.parse(dateOfBirthString);
        } catch (ParseException e) {
            System.out.println("Invalid.");
        }
        scanner.nextLine();
        System.out.println("UnitPrice:");
        unitPrice=scanner.nextDouble();
        System.out.println("Quantity:");
        quantity=scanner.nextDouble();
    }
    public void  updateBook(String id){
       addBook();
    }
    public void displayBook(){
        System.out.println("Book ID:"+bookId);
        System.out.println("Publisher:"+publisher);
        System.out.println("Enter Daate:"+entryDate);
        System.out.println("UnitPrice:"+unitPrice);
        System.out.println("Quantily:"+quantity);
    }
}
