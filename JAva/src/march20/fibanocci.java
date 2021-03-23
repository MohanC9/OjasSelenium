package march20;

public class fibanocci {

	public static void main(String[] args) {
		int a, b, c;
		
		a =0;
		b =1;
		c = a+b;
		System.out.println(a);
		System.out.println(b);
		/*for (int i=1; c<90; i++) {
			//System.out.println(a+b);
			//System.out.println(i);
			System.out.print(c+",");
			a=b;
			b=c;
			c=a+b;
			*/
			
		while (c<90) {
			System.out.print(c+",");
			a=b;
			b=c;
			c=a+b;
			

		}	
		
		}
		
		
	}
	
	