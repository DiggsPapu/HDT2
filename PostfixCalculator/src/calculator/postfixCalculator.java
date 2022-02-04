package calculator;

public class postfixCalculator<N> implements IPostfixCalc<N> {
	
	int result;
	@Override
	public int addition(N value1, N value2) {
		// TODO Auto-generated method stub
		int val1=(Integer) value1;
		int val2=(Integer) value2;
		return sendResult(val2+val1);
			
	}

	@Override
	public int substract(N value1, N value2) {
		// TODO Auto-generated method stub
		int val1=(Integer) value1;
		int val2=(Integer) value2;
		return sendResult(val2-val1);
		
		
	}

	@Override
	public int divide(N value1, N value2) {
		// TODO Auto-generated method stub
		int val1=(Integer) value1;
		int val2=(Integer) value2;
		if (val1==0) {
			System.out.print("Es infinito el resultado, operación indefinida");
			return 0;
		}
		else {
			return sendResult(val2/val1);	
		}
		
	}

	@Override
	public int multiplication(N value1, N value2) {
		int val1=(Integer) value1;
		int val2=(Integer) value2;
		return sendResult(val2*val1);
	}

	@Override
	public int sendResult(int value) {
		// TODO Auto-generated method stub
		return value;
	}

	
}
