package Assignment7;

import java.util.ArrayList;
import java.util.Scanner;

public class EX10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the " + (i + 1) + " name: ");
            String F = scanner.nextLine();
            names.add(F);
        }

        ArrayList<String> same = new ArrayList<>();

        for (int i = 0; i < names.size(); i++) {
            boolean test = false;

            for (int j = 0; j < same.size(); j++) {
                if (names.get(i)==same.get(j)) {
                    test = true;
                    break;
                }
            }

            if (!test) {
                same.add(names.get(i));
            }
        }
        System.out.println("List: " + same);
    }
}
