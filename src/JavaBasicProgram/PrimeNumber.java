package JavaBasicProgram;

public class PrimeNumber {
	
	public static void main(String[] args) {
		int num=23;
		boolean isprime=true;

		
	if(num <=0)
		
	{
		isprime=false;
	}
	for(int i=2;i<num;i++)
	{
		if(num %i==0) {
			isprime=false;
			break;
		}
	}
	if(isprime)
	{
		System.out.println("PrimeNumber");
	}
	else
	{
		System.out.println("Not a primeNumber");
	}
		
		
			
		}
	}

