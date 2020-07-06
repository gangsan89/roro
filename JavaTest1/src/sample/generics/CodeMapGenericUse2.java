package sample.generics;

public class CodeMapGenericUse2 {
	public static void main(String[] args) {
		Person p1=new Person("Kim123", "김말자", "서울");
		
		CodeMap<Integer, Person> codeMap = 
				new CodeMap<Integer, Person>(1, p1);
		
		CodeMap<Integer, Person> codeMap2 = 
				new CodeMap<Integer, Person>();
		codeMap2.put(1,p1);
		
		CodeMap<Integer, Person> codeMap3 = 
				new CodeMap<Integer, Person>(1, p1);
		
		boolean res=CodeMap.valueCompare(codeMap, codeMap2);
		System.out.println(res);
	}
}
