package sample.sort;

public class BubbleSort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] alphas= {'F','E','D','C','B','A'};
		int size=alphas.length;
		int limit = size-1;
		System.out.println(size+", "+limit);
		char temp;
		int count=0;
		boolean isChange=false;
		for(int i=1; i<=limit ; i++) {
			System.out.println(i+"번째");
			for( int j=0; j<limit ; j++  ) {
				//System.out.println(j+":"+(j+1));
				if(alphas[j] < alphas[j+1]) {
					temp=alphas[j] ;
					alphas[j]=alphas[j+1];
					alphas[j+1]=temp;
					isChange=true;
				}
				System.out.println(count++);  
				
			}//if , for  end
			for(  char c : alphas ) {
				System.out.print(c +" ");
			}
			if(!isChange)break;
			
			System.out.println();
		}// 바깥for
		System.out.println("\n\n\n");
		
		char [] alphas2= {'F','E','D','C','B','A'};
		count=0;
		for(int i=0; i<limit ; i++) {
			System.out.println(i+"번째");
			for( int j=0; j<limit-i ; j++  ) {
				//System.out.println(j+":"+(j+1));
				if(alphas2[j] < alphas2[j+1]) {
					temp=alphas2[j] ;
					alphas2[j]=alphas2[j+1];
					alphas2[j+1]=temp;
				}
				//  ????  
				System.out.println(count++); 
			}//if , for  end
			for(  char c : alphas2 ) {
				System.out.print(c +" ");
			}
			System.out.println();
		}// 바깥for
		
	}

}









