package Assignment8;
import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi:");
        String N = scanner.nextLine();
        for (int i = N.length() - 1; i >= 0; i--) {
            System.out.print(N.charAt(i)); 
        }
        System.out.println();
    }
}