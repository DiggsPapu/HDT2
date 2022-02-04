package calculator;

public interface IPostfixCalculator <N> {
	validateValue();
	int addition(N value1, N value2);
	int substract(N value1, N value2);
	int divide(N value1, N value2);
	int sendResult();
}
