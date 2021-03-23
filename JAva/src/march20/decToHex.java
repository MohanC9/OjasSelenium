package march20;

public class decToHex {
	public static void main(String[] args) {
		int rem;
		String Hex ="";
		int Dec=109;
		System.out.println("Input as a Decimal Number - "+ Dec);
		char Hexchar[] ={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		while(Dec>0) {
		rem=Dec%16;
		Hex = Hexchar[rem]+Hex;
		Dec=Dec/16;
		}
		System.out.println("Output as a Hexadecimal - "+Hex);		
	}
	
}
