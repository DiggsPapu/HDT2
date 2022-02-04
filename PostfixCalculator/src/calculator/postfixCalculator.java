package calculator;

public class postfixCalculator implements IPostfixCalculator {
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
	public void operationVerification() {
		if(getCounterNumber()==1||getCounterNumber()==0) {
			System.out.print("Es inv�lida la operaci�n postfix dado que no hay suficientes n�meros para realizar dicha operaci�n");
		}
		else {
			getHead().getValue();
			pop();
			getHead().getValue();
			pop();
		}
	}
}
