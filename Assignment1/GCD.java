
import java.util.Scanner;

class GCDCalculator {

    public int calculateGCD(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}

public class GCD {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        GCDCalculator calc = new GCDCalculator();
        int gcd = calc.calculateGCD(num1, num2);
        System.out.println("The GCD is: " + gcd);
    }
}
