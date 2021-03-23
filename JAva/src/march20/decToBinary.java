package march20;

public class decToBinary {

	public static void main(String[] args) {
		int bin[] = new int[40];
		int m =0;
		int dec =15,num;
		num=dec;
		while(num>0) {
			int i = num%2;
			num /=2;
			bin[m]=i;
			m++;
			//System.out.print(i);
		}
		for(int j=m-1;j>=0;j--) {
		System.out.print(bin[j]);
		}
	}
}
