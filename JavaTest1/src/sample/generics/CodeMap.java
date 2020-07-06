package sample.generics;

public class CodeMap<K, V> {
	private K key;
	private V value;
	
	public CodeMap(int i, Person p1) {
		// TODO Auto-generated constructor stub
	}
	public CodeMap() {
		// TODO Auto-generated constructor stub
	}
	public void put(K key, V value) {
		this.key = key;
		this.value = value;
	}
	public V get(K key) throws Exception {
		if(this.key==key) return value;
		else throw new Exception("원하는 데이터가 없음요");
	}
	public static <K,V> boolean valueCompare(CodeMap<K, V> c1,CodeMap<K, V> c2 ) {
		return c1.key.equals(c2.key) && c1.value.equals(c2.value);
	}	
//생성자 , setter , getter 
	@Override
	public String toString() {
		return "CodeMap [key=" + key + ", value=" + value + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((key == null) ? 0 : key.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CodeMap other = (CodeMap) obj;
		if (key == null) {
			if (other.key != null)
				return false;
		} else if (!key.equals(other.key))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}
	
}
