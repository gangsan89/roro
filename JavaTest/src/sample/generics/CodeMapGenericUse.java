package sample.generics;
public class CodeMapGenericUse {
	public static void main(String[] args) {
		Person p1=new Person("Kim123", "김말자", "서울");
		CodeMap<Integer, Person> codeMap = new CodeMap<Integer, Person>();
		codeMap.put(1, p1);
	
		Person person=null;
		try {
			person = codeMap.get(2);
			System.out.println("codeMap.get(2)==>"+person);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		CodeMap<Integer, Person> codeMap2 = new CodeMap<Integer, Person>();
		codeMap2.put(1,p1);
		System.out.println(codeMap2);
		
		boolean res=CodeMap.valueCompare(codeMap, codeMap2);
		System.out.println(res);
	}
}
