import java.util.*;

class Sequence {
    public void sequ() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter sequence: ");
        int range = scanner.nextInt(); 
        int x = 0;
        int y = 2;
        int z = 1;

        System.out.print("Sequence: ");
        
        for (int i = 0; x <= range; i++) {
            System.out.print(x+", ");
            
    
            //if (x + 1 <= range) {
              //  System.out.print(", ");
            //}

            if (i % 2 == 0) {
                x = y;      
                y *= 2;     
            } else {
                x = z;      
                z += 1;      
            }
        }
        
        scanner.close();
    }
}

public class Q4 {
    public static void main(String[] args) {
        Sequence ob = new Sequence();
        ob.sequ();
    }
}

