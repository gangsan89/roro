package sample.sort;

public class BubbleSort {
	public static void main(String[] args) {
		char [] alphas = { 'A', 'B', 'C', 'D', 'E', 'F'};
		int size = alphas.length;
		int limit = size-1;
		System.out.println(size+", "+limit);
		char temp;
		
		for(int i=1; i<=limit; i++) {
			System.out.println(i+ " 번째");
			for( int j=0; j<limit; j++ ) {
				if( alphas[j] < alphas[j+1]) {
					temp=alphas[j];
					alphas[j]=alphas[j+1];
					alphas[j+1]=temp;
				}
			}
			for( char c : alphas) {
				System.out.print(c+ "  ");
			}
			System.out.println();
		}
	}
}
