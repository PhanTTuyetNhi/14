
package Assignment8;
import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi:");
        String N = scanner.nextLine();
        for(int i=0;i<N.length();i++){
            if(N.charAt(i)==' '&& N.charAt(i+1)!=' ')
                System.out.print(N.charAt(i));
            else if(N.charAt(i)==' ')
                continue;
            else
                System.out.print(N.charAt(i));
        }
    }
}
