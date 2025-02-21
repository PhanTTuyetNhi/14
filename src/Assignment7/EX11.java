
package Assignment7;
   import java.util.ArrayList;
import java.util.Random;

public class EX11 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(100) + 1; 
            numbers.add(randomNumber); 
        }

        int max = 0;
        int min = 1000;
        System.out.println("List:"+numbers);
        for (int i=0;i<10;i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i); 
            }
            if (numbers.get(i)< min) {
                min = numbers.get(i);
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
