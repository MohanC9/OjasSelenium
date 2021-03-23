package march20;

import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args){
		
	
	Scanner scan = new Scanner(System.in);
	 int n =scan.nextInt();
		Boolean x = true;
 
		 for (int i=2; i<n/2; i++) {
			
			 if (n%i==0) {
				x=false;
				break;
			}
			 
			 
		}
		 if (x) {
			System.out.println("prime");
		}
		 else {
			System.out.println("Not Prime");
		}
	 }
	 
	}
	