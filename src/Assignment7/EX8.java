
package Assignment7;
import java.util.Scanner;
import java.util.ArrayList;
public class EX8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> Fruits = new ArrayList<>();
        ArrayList<String> Copy = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the " + (i + 1) + " fruit:");
            String F=scanner.nextLine();
            Fruits.add(i,F);
        }
        for(int i=0;i<5;i++){
            Copy.add(i,Fruits.get(i));
        }
        System.out.println("Array Copy Fruits:"+ Copy);
    }
}
