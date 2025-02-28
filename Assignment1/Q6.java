//6. Write a java program to print Factorial of a given number. Use any loop.

import java.util.*;

class Fact {

    public int sequ() {
        Scanner scanner = new Scanner(System.in);
        int f = 1;

        System.out.print("Enter the Number: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            f *= i;
        }

        return f;
    }
}

public class Q6 {

    public static void main(String[] args) {
        Fact fact = new Fact();

        int result = fact.sequ();

        System.out.println("Factorial is: " + result);
    }
}

