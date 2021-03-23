package march20;

public class strongNumber {
	private static int factorial(int n) {
		if (n<=1) {
			return 1;
		}
		else {
			int fact1=n*factorial(n-1);
			return fact1;
		}
	}
	public static void main(String[] args) {
			int Num = 145, Sum = 0, reminder, OrgNum; 
			OrgNum = Num;
		while( Num>0){
			 
			 reminder = Num%10;
			 int fact = factorial(reminder);
			 //System.out.println(fact);
			 Sum = Sum+fact;
			 Num /=10;
			 }
		//System.out.println(Sum);
		if(Sum == OrgNum) {
			System.out.println("It is a Strong Number");
		}
	
		else {
			System.out.println("It is not a strong number");
		}
	}	
}
