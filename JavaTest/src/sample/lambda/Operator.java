package sample.lambda;

@FunctionalInterface
public interface Operator {
	/**
	 * 연산
	 * @param a
	 * @param b
	 * @return
	 */
	public int opFunc(int a, int b);
	
}
