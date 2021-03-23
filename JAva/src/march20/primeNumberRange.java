package march20;

import java.util.Scanner;

public class primeNumberRange {
	public static void main(String[] args) {
		int s1,s2;
		System.out.println("Enter Lower Limit");

		Scanner sc = new Scanner(System.in);
		s1 = sc.nextInt();
		System.out.println("Enter Upper Limit");

		s2 = sc.nextInt();
		System.out.println("Prime Numbers between "+s1+" and "+s2);
		int x = 0;
		for(int i=s1; i<=s2; i++) {
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					x=0;
					break;
				}
				else {
					x=1;
				}
			}
				if(x==1) {
					System.out.print(i+" ");
				}
			
		}
			}
		}