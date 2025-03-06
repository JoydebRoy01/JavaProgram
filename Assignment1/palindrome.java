//Write a java program to check whether a given number is palindrome number or not.

import java.util.Scanner;

class Codee {

    void pal(int num) {
        int cpy = num, rev = 0, rem;

        while (cpy != 0) {
            rem = cpy % 10;       
            rev = rev * 10 + rem;    
            cpy = cpy / 10;      
        }


        if (rev == num)
            System.out.println("The number is palindrome");
        else
            System.out.println("The number is not a palindrome");
    }
}

public class palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to check palin");
        int num = sc.nextInt();

    
        Codee obj = new Codee();
        obj.pal(num);

        sc.close();
    }
}
