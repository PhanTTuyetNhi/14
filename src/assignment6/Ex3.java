
package assignment6;
    import java.util.ArrayList;
import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<String> productNames = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();
        for(int i=0;i<5;i++){
            System.out.print("Name product"+(i+1)+":");
            String Name=scanner.nextLine();
            productNames.add(i,Name);
            System.out.print("Price:");
            Double Price=scanner.nextDouble();
            prices.add(i,Price);
            scanner.nextLine();
        }
        System.out.println("List product:");
        for (int i = 0; i < 5; i++) {
            System.out.println(productNames.get(i) + ": " + prices.get(i));
        }
    }
}
