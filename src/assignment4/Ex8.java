
package assignment4;
import java.util.*;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
         int[] numbers = new int[100];
         int max=0;
         Scanner scanner=new Scanner(System.in);
         System.out.println("Enter number:");
         int N=scanner.nextInt();
         System.out.println("Enter"+N+"number:");
         for(int i=0;i<N;i++)
            numbers[i]=scanner.nextInt();
         for(int i=0;i<N;i++){
             if(numbers[i]>max)
                 max=numbers[i];
         }
         System.out.println("Largest="+max);
    }
}
