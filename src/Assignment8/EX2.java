
package Assignment8;
import java.util.Scanner;
public class EX2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap chuoi:");
        String N=scanner.nextLine();
        int dem=1;
        for(int i=0;i<N.length();i++){
            if(N.charAt(i)==' ')
                dem++;
        }
        System.out.println("So tu cua chuoi:"+dem);
    }
}
