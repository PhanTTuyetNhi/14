package Assignment7;

import java.util.ArrayList;
import java.util.Random;

public class EX6 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        int odd = 0;
        int even = 0;
        for (int i = 0; i < 15; i++) {
            int number = random.nextInt(50) + 1;
            numbers.add(number);
            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("List"+numbers);
        System.out.println("Even : " + even);
        System.out.println("Odd: " + odd);
    }
}
