
package O.Exercise4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

public class Person {
    String id;
    String fullName;
    Date dateOfBirth;
    Date bookBorrowDate;
    Date bookReturnDate;

    public Person(String id, String fullname, Date dateOfBirth, Date bookBorrowDate, Date bookReturnDate) {
        this.id = id;
        this.fullName = fullname;
        this.dateOfBirth = dateOfBirth;
        this.bookBorrowDate = bookBorrowDate;
        this.bookReturnDate = bookReturnDate;
    }

    public Person() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullname() {
        return fullName;
    }

    public void setFullname(String fullname) {
        this.fullName = fullName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getBookBorrowDate() {
        return bookBorrowDate;
    }

    public void setBookBorrowDate(Date bookBorrowDate) {
        this.bookBorrowDate = bookBorrowDate;
    }

    public Date getBookReturnDate() {
        return bookReturnDate;
    }

    public void setBookReturnDate(Date bookReturnDate) {
        this.bookReturnDate = bookReturnDate;
    }
        public void addPerson(){
            Scanner scanner=new Scanner(System.in);
        System.out.print("ID:");
        id=scanner.nextLine();
        System.out.print("FullName:");
        fullName=scanner.nextLine();
        System.out.println("Enter Date:");
  String dateOfBirthString = scanner.nextLine();
        try {
           SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            dateOfBirth = sdf.parse(dateOfBirthString);
        } catch (ParseException e) {
            System.out.println("Invalid.");
        }
        scanner.nextLine();
        System.out.println("Date borrow:");
        String dateborrow = scanner.nextLine();
        try {
           SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            bookBorrowDate = sdf.parse(dateborrow);
        } catch (ParseException e) {
            System.out.println("Invalid.");
        }
        scanner.nextLine();
        System.out.println("Date return:");
        String dateReturn = scanner.nextLine();
        try {
           SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            bookReturnDate = sdf.parse(dateReturn);
        } catch (ParseException e) {
            System.out.println("Invalid.");
        }
        scanner.nextLine();
    }
        public void  updatePerson(String id){
            addPerson();
        }
        public void display(){
            System.out.println("ID:"+id);
            System.out.println("Date Of Birth:"+dateOfBirth);
            System.out.println("Book Borrow Date:"+bookBorrowDate);
            System.out.println("Book return Date:"+bookReturnDate);
        }
public boolean isBookOverdue(){
   return false;
}
}