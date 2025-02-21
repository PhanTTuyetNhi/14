
package Assignment14;
import java.util.Scanner;
public class Processor {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        BookList bookList = new BookList();
        int choice;
        do{
            System.out.println("1.Add textbook");
            System.out.println("2.Add ReferenceBook");
            System.out.println("3.Update book by ID");
            System.out.println("4.Delete book by ID");
            System.out.println("5.Find book by ID");
            System.out.println("6.Display book by ID");
            System.out.println("7.Exit");
            System.out.println("Your choice:");
            choice=scanner.nextInt();
            switch(choice){
                case 1:
                    TextBook textbook=new TextBook();
                    textbook.addBook();
                    bookList.addBook(textbook);
                    break;
                    case 2:
                    ReferenceBook referencebook=new ReferenceBook();
                    referencebook.addBook();
                    bookList.addBook(referencebook);
                    break;
                case 3:
                    System.out.print("Enter ID to update: ");
                    String id = scanner.nextLine();
                    bookList.updateBook(id);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                case 4:
                    System.out.println("Enter ID want delete:");
                     id = scanner.nextLine();
                    bookList.deleteBookById(id);
                    break;
                case 5:
                    System.out.println("Enter ID want find:");
                    id=scanner.nextLine();
                    bookList.findBookById(id);
                   break;
                case 6:
                    bookList.displayAllBooks();
                    break;
            }}
            while(choice !=7);
        }
    }
