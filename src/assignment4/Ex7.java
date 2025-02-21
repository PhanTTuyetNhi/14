package assignment4;

import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {
        int a = 0, b = 1, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int N = scanner.nextInt();
        for (int i = 1; i <= N; i++) {
            if (i == 1) {
                System.out.print(a + ",");
            } else if (i == 2) {
                System.out.print(b + ",");
            } else {
                c = a + b;
                a = b;
                b = c;
                System.out.print(c + ",");
            }
        }
    }
}
