package sample.annotation;

public class AnnotationUse2 {
	
	@InsertIntData(data=40)
	private int x;
	
	@InsertIntData(data=25)
	private int y;
	
	private int noUseAnno;
	
	public AnnotationUse2() {
		this.x = -1;
		this.y = -1;
		this.noUseAnno = -1;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getNoUseAnno() {
		return noUseAnno;
	}

	public void setNoUseAnno(int noUseAnno) {
		this.noUseAnno = noUseAnno;
	}

	@Override
	public String toString() {
		return "AnnotationUse2 [x=" + x + ", y=" + y + ", noUseAnno=" + noUseAnno + "]";
	}
	
}
