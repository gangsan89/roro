package sample.sort;

import java.util.List;

public class CharBubbleSort {
	/**
	 * 단순한 문자정렬  원본데이타가 정렬된다.
	 *   {'F','E','D','C','B','A'}==>
	 *    {'A','B','C','D','E','F'}
	 */
	public char[] charSort(char[] ch) {//call-by-reference
		System.out.println("ch:"+ch);
		int size=ch.length;
		int limit = size-1;
		char temp;
		boolean isChange=false;
		for(int i=0,count=0; i<limit ; i++) {
			System.out.println(i+"번째");
			for( int j=0; j<limit-i ; j++  ) {
				//System.out.println(j+":"+(j+1));
				if(ch[j] > ch[j+1]) {
					temp=ch[j] ;
					ch[j]=ch[j+1];
					ch[j+1]=temp;
					isChange=true;
				}
				System.out.println(count++);  
			}//if , for  end
			for(  char c : ch ) {
				System.out.print(c +" ");
			}
			System.out.println();
			if(!isChange)break;
			else isChange=false;
		}// 바깥for
		
		return ch;
	}
	/**
	 * 단순한 문자정렬  원본데이타가 정렬않된다.
	 * 정렬된 데이타를 리턴
	 *   {'F','E','D','C','B','A'}==>
	 *    {'A','B','C','D','E','F'}
	 */
	public char[] charCopySort(char[] source) {//call-by-reference
		
		//char []ch =source; //  XXXXXXXX
		//복제 하려면 ????
		//source 배열의 크기와 같은 배열준비
		int arraySize=source.length;
		char []target = new  char[arraySize];
		//source 0번째 방부터  데이타를 target배열의 해당 번째 방에 대입한다
		for(int i=0 ; i<arraySize ; i++) {
			target[i]=source[i];
		}
		System.out.println("ch:"+target);
		int size=target.length;
		int limit = size-1;
		char temp;
		boolean isChange=false;
		for(int i=0,count=0; i<limit ; i++) {
			System.out.println(i+"번째");
			for( int j=0; j<limit-i ; j++  ) {
				//System.out.println(j+":"+(j+1));
				if(target[j] > target[j+1]) {
					temp=target[j] ;
					target[j]=target[j+1];
					target[j+1]=temp;
					isChange=true;
				}
				System.out.println(count++);  
			}//if , for  end
			for(  char c : target ) {
				System.out.print(c +" ");
			}
			System.out.println();
			if(!isChange)break;
			else isChange=false;
		}// 바깥for
		
		return target;
	}	
	/**
	 * 이름순으로 정렬 
	 * "꽃님이","베니","밤비","큐핏","재롱이","람보"
	 * ==>"꽃님이", "람보","밤비","베니","재롱이","큐핏"
	 */
	public List<String> strSort(List<String>list){
		return null;
	}
}
