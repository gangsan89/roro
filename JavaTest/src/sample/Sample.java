package sample;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="dag";
		String s2="dab";
		String s3;
		char c1='d';
		char c2='a';
		int a= c1-c2;
		System.out.println(a+ "  "+ (c1>c2)+" "+('F'-'f')+" "+('d'-'a'));
		int temp;
		int res=0;
		char[] s1array=s1.toCharArray();
		char[] s2array=s2.toCharArray();
		// 1 첫글자비교시 d - a > 0 바꿔야한다 . 
		// 2 "dg" ,"db"  d - d == 0 X ==> 두번째 문자 비교 ,
		// "dg", "DG"  'd'-'D' ==  32 32 대소문자 차이값
		// s1의 길이 2, s2의 길이 3
		int s1Size = s1.length();
		int s2Size = s2.length();
		int limit = (s1Size <= s2Size)?s1Size:s2Size;
		System.out.println(s1+"   "+ s2+"\n");
		for(int i=0; i < limit ; i++) {
			temp=s1array[i]- s2array[i];
			if(temp > 0) {//1
				System.out.println("교체:"+s1array[i]+"-"+ s2array[i]+"= "+temp);
				s3=s1;
				s1=s2;
				s2=s3;
				break;
			}else {
				System.out.println("no교체:"+s1array[i]+"-"+ s2array[i]+"= "+temp);
				continue; /* if(  ) {//  처음 자리는 같은 문자이고 두번째자리 비교 
				}
				}*/
			}
		}
		
		System.out.println(s1+"   "+ s2);
	}

}
