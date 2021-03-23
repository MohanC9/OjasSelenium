package march19;

public class javaStatements2 {
	
	
	 
	public static void main(String[] args) {
		int age  = 22;
		String s ;
		
		switch (age) {
		case (16): s = "Your not Eligible for Vote";
		break;
		
		case (22): s = "Your Eligible for Vote";
		break;
		
		case (60): s = "Your are Senor Citizen";
		break;

		default:s = "Invalid Entry";
			break;
		}
		
		System.out.println(s);
		
	}

}
