package Assignment7;

import java.util.ArrayList;
import java.util.Random;

public class EX12 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        int Sum = 0;
        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(100) + 1;
            numbers.add(randomNumber);
            Sum += numbers.get(i);
        }
        System.out.println("List:" + numbers);
        System.out.println("Sum list: " + Sum);
    }
}
