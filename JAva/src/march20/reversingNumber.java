package march20;

public class reversingNumber {
	public static void main(String[] args) {
		int Num = 21191, RevNum = 0, reminder, OrgNum; 
		System.out.println("Before Reversing The Number - "+Num);
		OrgNum = Num;
	 for( ;Num != 0 ;Num /=10 ){
		 
		 reminder = Num%10;
		 RevNum = RevNum*10+reminder;
		 }
	 System.out.println("After Reversing The Number - "+RevNum);
	
	}
}

