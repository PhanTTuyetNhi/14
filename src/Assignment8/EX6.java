
package Assignment8;
import java.util.Scanner;
public class EX6 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi:");
        String N = scanner.nextLine();

        System.out.println("Nhap tu can thay the:");
        String T = scanner.nextLine();
        
        System.out.println("Nhap tu thay the:");
        String TT = scanner.nextLine();
        
        N = N.replace(T, TT);
        System.out.println("Chuoi moi: " + N);
    }
    }
