package march20;

public class reversingString {
	public static void main(String[] args) {
		String s ="Mohan";
		Object m=null;
		int n = s.length();
		
		System.out.println("Length of String = "+n);
		System.out.println(s);
		for(int i=n-1;i>=0;i--) {
			 m =s.charAt(i);
			
			 System.out.print(m);
		}
		
	}
}
