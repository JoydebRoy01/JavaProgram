import java.util.Scanner;
class white
{
	void pow(int base, int exponent)
	{
		long result = 1;

   		 while (exponent != 0) 
		{
      			result *= base;
      			--exponent;
    		}

    		System.out.println("Answer = " + result);
	}
}

class power {
  public static void main(String[] args) 
{
	
    int base, exponent;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter  base ");
	base = sc.nextInt();
	System.out.println("Enter  exponent ");
	exponent = sc.nextInt();
	
	white obj = new white();
	obj.pow(base, exponent);	
	
    
  }
}