
package Assignment8;
import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi:");
        String N = scanner.nextLine();
        System.out.println("Nhap chu:");
        char Y=scanner.next().charAt(0);
        int dem=0;
        for(int i=0;i<N.length();i++){
            if(Y==N.charAt(i))
                dem++;
    }
        System.out.println("So lan xuat hien trong chuoi:"+dem);
}}
