package assignment4;

public class Ex6 {

    public static void main(String[] args) {
        boolean bool;
        for (int i = 2; i<= 100; i++) {
            bool= true;
            for (int j = 2; j <i; j++) {
                if (i % j == 0) {
                    bool= false;
                    break;
                }
            }
            
            if(bool)
            System.out.println(i + ",");

        }
    }
}
