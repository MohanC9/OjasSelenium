package march20;

import java.util.Scanner;

public class perfectNumber {
	
	public static void main(String[] args) {
		for(int j=0;j<=5;j++) {
		System.out.println("Enter the Number ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		
		for(int i=1; i<num;i++) {
			if(num%i==0) {
				sum=sum+i;
			}
			//System.out.println();
		}
		if(num == sum) {	
			System.out.println("Perfect Number");
		}
		else {
			System.out.println("Not a perfect Number");
		}
	}
	
	}
}
