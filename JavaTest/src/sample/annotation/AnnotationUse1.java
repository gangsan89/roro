package sample.annotation;

public class AnnotationUse1 {
	@InsertIntData(data = 30)
	private int myAge;
	
	@InsertIntData
	private int defaultAge;
	
	public AnnotationUse1() {
		this.myAge = -1;
		this.defaultAge = -1;
	}

	public int getMyAge() {
		return myAge;
	}

	public void setMyAge(int myAge) {
		this.myAge = myAge;
	}

	public int getDefaultAge() {
		return defaultAge;
	}

	public void setDefaultAge(int defaultAge) {
		this.defaultAge = defaultAge;
	}

	@Override
	public String toString() {
		return "AnnotationUse1 [myAge=" + myAge + ", defaultAge=" + defaultAge + "]";
	}
}
