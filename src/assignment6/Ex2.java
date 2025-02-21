
package assignment6;
import java.util.ArrayList;
import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        ArrayList<String> Text = new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            String color=scanner.nextLine();
            Text.add(color);
        }
        Text.add(1,"Yellow");
        System.out.println(" ArrayList: " + Text);
    }
    }
