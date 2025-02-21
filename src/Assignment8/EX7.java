
package Assignment8;
import java.util.Scanner;

public class EX7 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi:");
        String N = scanner.nextLine();
        for(int i=0;i<N.length();i++){
            if(N.charAt(i)>='0' && N.charAt(i)<='9')
                System.out.print(N.charAt(i));
        }
    }
}
