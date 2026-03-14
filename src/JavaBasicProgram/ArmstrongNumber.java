package JavaBasicProgram;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num=154;
		int original=num;
		int sum=0;
		
		while(num>0)
		{
			int digit=num%10;
			sum=sum+digit*digit*digit;
			num=num/10;
		}
		if(original==sum) {
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not a Armstrong");
		}
	}

}
