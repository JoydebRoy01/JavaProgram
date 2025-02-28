//Q5 Write a program following Seqquence 0,-1,1,-4,1,-7
import java.util.*;
import java.io.*;

class Sequence {
    public void sequ() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the range: ");
        int range = scanner.nextInt();

        int evenValue = 0;
        int oddValue = -1;

        System.out.print("Sequence: ");

        for (int i = 0; i < range; i++) {
            if (i % 2 == 0) {
                System.out.print(evenValue + ", ");
                evenValue+=1;
            } else {
                System.out.print(oddValue + ", ");
                oddValue-=3;
                
            }
        }

        scanner.close();
    }
}

public class Q5 {
    public static void main(String[] args) {
        Sequence ob = new Sequence();
        ob.sequ();
    }
}

