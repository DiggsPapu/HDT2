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
				System.out.print("El caractér ingresado no es válido para una operación");
				return val;
			}
		}
		return val;
			
	}
	public void operationVerification() {
		if(getCounterNumber()==1||getCounterNumber()==0) {
			System.out.print("Es inválida la operación postfix dado que no hay suficientes números para realizar dicha operación");
		}
		else {
			getHead().getValue();
			pop();
			getHead().getValue();
			pop();
		}
	}
}
