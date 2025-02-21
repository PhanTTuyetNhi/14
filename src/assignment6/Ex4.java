
package assignment6;
import java.util.Scanner;
import java.util.ArrayList;
public class Ex4 {
    public static void main(String[] args) {
        ArrayList<String> Text = new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 5 city(capital the first letter):");
        for (int i = 0; i <5; i++) {
            String city=scanner.nextLine();
            Text.add(city);
        }
        boolean test=false;
        for(int i=0;i<5;i++){
            if(Text.get(i)=="London"){
                test=true;
            break;}
        }
        if(test==true)
            System.out.println("Has London");
        else
            System.out.println("Has not London");
    }
}
