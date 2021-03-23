package march20;

public class palindromeNumberOrNot {

	public static void main(String[] args) {
		
		int Num = 12321, RevNum = 0, reminder, OrgNum; 
		OrgNum = Num;
	 for( ;Num != 0 ;Num /=10 ){
		 
		 reminder = Num%10;
		 RevNum = RevNum*10+reminder;
		 }
	 if ( OrgNum == RevNum) {
		System.out.println("Palindrome");
	 	}
	 else {
		 System.out.println("Not a Palindrome");
	 }
	}
	
	
}
