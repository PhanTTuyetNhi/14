package assignment6;

import java.util.ArrayList;
import java.util.Random;

public class Ex5 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(100) + 1;
            numbers.add(randomNumber);
        }
        System.out.println("List before update: " + numbers);
        numbers.remove(3);

        System.out.println("List after update: " + numbers);
    }
}
