
package assignment4;
import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number:");
        int N=scanner.nextInt();
        int total=0;
        for(int i=1;i<=N;i++)
            total=total+i;
        System.out.println("Total:"+total);
    }
}
