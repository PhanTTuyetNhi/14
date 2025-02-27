/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package O.Exercise4;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Teacher extends Person{
    String department;
    String teachingSubject;

    public Teacher(String department, String teachingSubject, String id, String fullname, Date dateOfBirth, Date bookBorrowDate, Date bookReturnDate) {
        super(id, fullname, dateOfBirth, bookBorrowDate, bookReturnDate);
        this.department = department;
        this.teachingSubject = teachingSubject;
    }

    public Teacher() {
    }
    public void  addPerson(){
        Scanner scanner=new Scanner(System.in);
        super.addPerson();
        System.out.println("department:");
        department=scanner.nextLine();
        System.out.println("Teaching Subject:");
        teachingSubject=scanner.nextLine();
    }
    public void updatePerson(String id){
        addPerson();
    }
    public void display(){
        super.display();
        System.out.println("Department:"+department);
        System.out.println("Teaching Subject:"+teachingSubject);
    }
    
}
