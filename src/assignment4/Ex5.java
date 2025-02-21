
package assignment4;
import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number:");
        int N=scanner.nextInt();
        int count=0;
        for(;N>0;N/=10)
            count++;
        System.out.println("Count:"+count);
    }
}
