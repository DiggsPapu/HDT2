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
				System.out.print("El caract�r ingresado no es v�lido para una operaci�n");
				return val;
			}
		}
		return val;
			
	}
	public void operationVerification(StackVector vector) {
		if(vector.getCounterNumber()==1||vector.getCounterNumber()==0) {
			System.out.print("Es inv�lida la operaci�n postfix dado que no hay suficientes n�meros para realizar dicha operaci�n");
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
