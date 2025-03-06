import java.util.Scanner;

class hat{
		int fact = 1;
		void fac(int n)
		{
			while(n!=0)
			{
				fact =  fact * n;
				n--;
			}
			
		}
		void print()
		{
			System.out.println("The fact "+fact);
		}
}

class factorial{

	public static void main(String args[])
	{
	  Scanner sc = new Scanner(System.in);
	  int  n;
	  System.out.println("Enter the number to cal fact");
	  n=sc.nextInt();
	  hat obj = new hat();
	  obj.fac(n);	
	  obj.print();	
	
	}
}