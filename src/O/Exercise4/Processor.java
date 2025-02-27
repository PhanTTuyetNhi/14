/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package O.Exercise4;
import java.util.Scanner;
public class Processor {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        PersonList personList = new PersonList();
        int choice;
        do{
            System.out.println("1.Add student");
            System.out.println("2.Add teacher");
            System.out.println("3.Update by ID");
            System.out.println("4.Delete by ID");
            System.out.println("5.Display");
            System.out.println("6.Find student highest GPA");
            System.out.println("7.find teacher by department");
            System.out.println("8.Exit");
            System.out.println("Your choice:");
            choice=scanner.nextInt();
            switch(choice){
                case 1:
                    Student student =new Student();
                    student.addPerson();
                    personList.addPerson(student);
                    break;
                case 2:
                    Teacher teacher=new Teacher();
                    teacher.addPerson();
                    personList.addPerson(teacher);
                    break;
                case 3:
                    System.out.println("Enter ID want update:");
                    String id=scanner.nextLine();
                    personList.updatePerson(id);
                    break;
                case 4:
                    System.out.println("Enter ID want delete:");
                    id=scanner.nextLine();
                    personList.deletePersonById(id);
                    break;
                case 5:
                    personList.display();
                    break;
                case 6:
                    personList.findTopStudent();
                    break;
                case 7:
                    System.out.println("Enter department of teacher want find:");
                    String department=scanner.nextLine();
                    personList.findTeacherByDepartment(department);
            }}
        while(choice !=8);
    }
}
