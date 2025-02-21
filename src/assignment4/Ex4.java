
package assignment4;
import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number:");
        int N=scanner.nextInt();
        int reverse=0;
        for(;N>0;N/=10){
            reverse=reverse*10+(N%10);
        }
        System.out.println("Reverse:"+reverse);
    }
}
