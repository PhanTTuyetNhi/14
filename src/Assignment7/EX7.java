package Assignment7;

import java.util.Scanner;
import java.util.ArrayList;

public class EX7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the " + (i + 1) + " number:");
            int N=scanner.nextInt();
            numbers.add(i,N);
        }
        for(int i=0;i<5/2;i++){
            int temp=numbers.get(i);
            numbers.set(i,numbers.get(4-i));
            numbers.set(4-i,temp);
        }
        System.out.println("Resever:"+numbers);
    }
}
