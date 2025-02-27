
package O.Exercise4;

import java.util.Date;
import java.util.Scanner;
public class Student extends Person {
    float gpa;
    String major;

    public Student(float gpa, String major, String id, String fullname, Date dateOfBirth, Date bookBorrowDate, Date bookReturnDate) {
        super(id, fullname, dateOfBirth, bookBorrowDate, bookReturnDate);
        this.gpa = gpa;
        this.major = major;
    }

    public Student() {
    }
    @Override
    public void addPerson(){
        Scanner scanner=new Scanner(System.in);
    super.addPerson();
    System.out.println("GPA:");
    gpa=scanner.nextFloat();
    System.out.println("Major:");
    major=scanner.nextLine();
}
    public void updatePerson(String id){
        addPerson();
    }
    public void display(){
        super.display();
        System.out.println("GPA:"+gpa);
        System.out.println("Major:"+major);
    }
    
}
