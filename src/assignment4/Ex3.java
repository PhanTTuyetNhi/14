
package assignment4;
import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number:");
        int N=scanner.nextInt();
        int factorial=1;
        for(int i=1;i<=N;i++)
            factorial=factorial*i;
        System.out.println("Factorial:"+factorial);
    }
}
