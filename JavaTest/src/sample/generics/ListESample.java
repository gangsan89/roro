package sample.generics;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ListESample {

	public static void main(String[] args) {
	
		List list1 = new ArrayList();
		list1.add(new Date());
		list1.add(new Person("kim123","김말자","서울"));
		
		Person  p ;
		Object obj;
		for(int i=0; i<list1.size();i++) {
			obj=list1.get(i);
		
			if(obj instanceof Person) {
			    p=(Person)obj;
			    System.out.println(p.getName());
			}
			
			
			
			/*if(list1.get(i) instanceof Person) {
				System.out.println(list1.get(i));
			}*/
		}
	
		List<Person> list2 = new ArrayList<Person>();
		//error
		//The method add(Person) in the type List<Person> is not applicable for the arguments (Date)
		//list2.add(new Date());
		list2.add(new Person("kim123","김말자","서울"));
		list2.add(new Person("park123","박말자","울산"));
		for(int i=0; i<list2.size();i++) {
			//Person의 인스턴스인지 확인할 필요가 없이 원하는 데이터를 사용할 수있다
			Person person = list2.get(i);
			System.out.println(person.getAddr());
			
		}
		for( Person person : list2 ) {
			//Person의 인스턴스인지 확인할 필요가 없이 원하는 데이터를 사용할 수있다
			System.out.println(person.getAddr());
			
		}
		
		
		
		
	}
}


