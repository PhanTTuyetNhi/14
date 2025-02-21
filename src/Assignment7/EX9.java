package Assignment7;

import java.util.Scanner;
import java.util.ArrayList;

public class EX9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int N = scanner.nextInt();
            numbers.add(i, N);
        }
        int Max = 0, Min = 10000;
        for (int i = 0; i < 5; i++) {
            if (numbers.get(i) > Max) {
                Max = numbers.get(i);
            }
            if (numbers.get(i) < Min) {
                Min = numbers.get(i);
            }
        }
        System.out.println("Max:" + Max);
        System.out.println("Min:" + Min);
    }
}
