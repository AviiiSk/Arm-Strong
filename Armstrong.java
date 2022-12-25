import java.util.Scanner;

public class Armstrong {

  
         
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		System.out.println("Enter the Number to Check ArmStrong");
		
		Scanner sd = new Scanner(System.in);
		int arm=0;
		int n = sd.nextInt();
		  int c = n;
		while (n>0)
		{
			int rem;
			rem= n%10;
			
			arm= (rem*rem*rem)+arm;
			n=n/10;
		}
		 
		
		if(c==arm)
		{
			System.out.println("Number is ArmStrong");
		}
		else
		{
			System.out.println("Number is Not ArmStrong");
		}
	}

}
