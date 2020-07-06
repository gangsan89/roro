package sample.sort;

public class SortUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 원본데이터가 수정되도 되나? 원본데이터 남겨야 하나?
		CharBubbleSort sort= new CharBubbleSort();
		char [] ch1 ={'F','E','D','C','B','A'};
		char [] ch2 ={'A','B','C','D','F','E'};
		char [] ch3 ={'A','B','C','D','E','F'};
		System.out.println("{'F','E','D','C','B','A'}");
		for(char c : ch1) {
			System.out.print(c+" ");
		}
		System.lineSeparator();
		
		char[] rest= sort.charCopySort(ch1);
		//char [] ch = ch1;
		// char[] rest=ch;
		System.out.println("ch1:"+ch1+"  rest:"+rest);
		for(char c : ch1) {
			System.out.print(c+" ");
		}
		System.out.println("////");
		for(char c : rest) {
			System.out.print(c+" ");
		}
		
	/*	System.out.println("{'A','B','C','D','F','E'}");
		System.lineSeparator();
		sort.charSort(ch2);
		
		System.out.println("{'A','B','C','D','E','F'}");
		System.lineSeparator();
		sort.charSort(ch3);*/
		//D:/sts4-work\\tavaTest\\src\\sample
	}

}
