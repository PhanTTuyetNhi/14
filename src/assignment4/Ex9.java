package assignment4;

import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {
        System.out.println("Enter number:");
        Scanner scanner=new Scanner(System.in);
        int N = scanner.nextInt();
        int reverse = 0;
        for (int i = N; i > 0; i /= 10) {
            reverse = reverse * 10 + (i % 10);
        }
        if (reverse == N) {
            System.out.println("Palindrome:Yes");
        } else {
            System.out.println("Palindrome:No");
        }
    }
}
