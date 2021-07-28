package march20;

public class armstrongNumber {
	public static void main(String[] args) {
		
		int Num = 512,rem,ResNum =0;
		int num1 = Num;
		while(Num>0) {
			
			rem= Num %10; 
			ResNum = ResNum+rem*rem*rem;
			Num /= 10;
			
		}
		//System.out.println(ResNum);
		if (num1 == ResNum) {
			System.out.println(ResNum+" is an ArmStrong Number");
		}
		else {
			System.out.println(ResNum+" is not an ArmStrong Number");
		}
	}

}
