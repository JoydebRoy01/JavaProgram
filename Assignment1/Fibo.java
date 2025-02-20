class Fib {
    int n = 0, n1 = 1, n2, sum = 0;

    void fibo(int f) {
        System.out.print(n + " " + n1 + " ");  
        sum = n + n1;  

        for (int i = 3; i <= f; i++) {
            n2 = n + n1;
            System.out.print(n2 + " "); 
            sum += n2;
            n = n1;
            n1 = n2;
        }
        System.out.println("\nThe sum is: " + sum); 
    }
}

class Fibo {
    public static void main(String[] args) {
        Fib a1 = new Fib(); 
        a1.fibo(10);  
    }
}
