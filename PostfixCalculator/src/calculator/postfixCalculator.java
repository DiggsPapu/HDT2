package calculator;

public class postfixCalculator<N> implements IPostfixCalculator<N> {
	public N validateValue(N val) {
		try {
			
			Integer.valueOf((String)val);
			push(val);
		}
		catch (Exception e) {
			if (val=="*"|| val=="+"||val=="-"||val=="/") {
				operationVerification();
				
			}
			else {
				System.out.print("El caractér ingresado no es válido para una operación");
				return val;
			}
		}
		return val;
			
	}
	public void operationVerification(StackVector vector) {
		if(vector.getCounterNumber()==1||vector.getCounterNumber()==0) {
			System.out.print("Es inválida la operación postfix dado que no hay suficientes números para realizar dicha operación");
		}
		else {
			vector.getHead().getValue();
			vector.pop();
			vector.getHead().getValue();
			vector.pop();
		}
	}
	@Override
	public int addition(N value1, N value2) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int substract(N value1, N value2) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int divide(N value1, N value2) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int sendResult() {
		// TODO Auto-generated method stub
		return 0;
	}
}
