package march20;

public class factorialUsingRecursion {
	
	static int s =1;
	private static int factorial(int n) {
		s = s*n;
		if (n<=1) {
			return s;
		}
		else {
			return factorial(n-1);
		}
	}
	public static void main(String[] args) {
		System.out.println(factorial(5));
	}
}
