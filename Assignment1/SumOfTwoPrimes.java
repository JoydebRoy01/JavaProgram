//Java Program to Check Whether a Number can be Expressed as Sum of Two Prime
//Numbers.
public class SumOfTwoPrimes {

   static boolean checkPrime(int num) {
       if (num <= 1) {
           return false;
       }
       for (int i = 2; i * i <= num; ++i) {
           if (num % i == 0) {
               return false;
           }
       }
       return true;
   }

   public static void main(String[] args) {
       int number = 34;
       boolean found = false;
       for (int i = 2; i <= number / 2; ++i) {
           if (checkPrime(i) && checkPrime(number - i)) {
               System.out.printf("%d = %d + %d\n", number, i, number - i);
               found = true;
           }
       }

       if (!found) {
           System.out.println(number + " cannot be expressed as the sum of two prime numbers.");
       }
   }
}