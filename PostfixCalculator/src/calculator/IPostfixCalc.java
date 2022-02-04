package calculator;

public interface IPostfixCalc <N> {
	public int addition(N value1, N value2);
	public int substract(N value1, N value2);
	public int multiplication(N value1, N value2);
	public int divide(N value1, N value2);
	public int sendResult(int value);
}
