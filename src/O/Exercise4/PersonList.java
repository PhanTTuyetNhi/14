/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package O.Exercise4;
import java.util.ArrayList;

public class PersonList {
    ArrayList<Person> personList=new ArrayList<>();
    public void addPerson(Person person){
        personList.add(person);
    }
    public void updatePerson(String id){
        for(Person person:personList){
            if(person.id.equals(id))
                person.updatePerson(id);
        }
    }
    public void deletePersonById(String id){
        for(Person person:personList){
            if(person.id.equals(id))
                personList.remove(id);
        }}
        public void findPersonById(String id){
            for(Person person:personList){
                if(person.id.equals(id))
                    person.display();
            }
    }
    public void display(){
        for(Person person:personList){
            person.display();
        }
    }
    public void findTopStudent(){
        float max=0;
        String Name = null;
        for(Person person:personList){
            if(person instanceof Student ){
                Student s=(Student) person;
                if(s.gpa>max){
                max=s.gpa;
                 Name=s.fullName;
        }
    }
}
        System.out.println(Name);
    }
    public void findTeacherByDepartment(String department){
        for(Person person:personList){
            if(person instanceof Teacher){
                if(((Teacher) person).department.equals(department))
                    person.display();
            }
        }
    }
    public void checkBookBorrowing(){
        
    }
}
