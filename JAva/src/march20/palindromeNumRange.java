package march20;

public class palindromeNumRange
  {
		public static void main(String[] args)
		{
			
			int Num, RevNum=0, reminder, OrgNum; 
			
			for(Num=51; Num>=100;Num++ )
			{
				OrgNum = Num;	
				while(Num>0){
					 
					 reminder = Num%10;
					 RevNum = RevNum*10+reminder;
					 Num /= 10;
					 }
				 if ( OrgNum == RevNum) {
					System.out.println("Palindrome");
				 	}
			}
}
  }
