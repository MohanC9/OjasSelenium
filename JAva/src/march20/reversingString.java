package march20;

public class reversingString {
	public static void main(String[] args) {
		String s ="Mohan";
		int n = s.length();
		
		System.out.println("Length of String = "+n);
		System.out.println("String before Reverse - "+s);
		for(int i=n-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
	}
}
