package calculator;
/**
 * 
 * @author Diego Andrés Alonzo Medinilla 20172
 *
 * @param <N> Generics
 */
public class StackVector<N> implements IStack<N> {
	private node<N> head;
	private int counterNumber;
	/**
	 *Es para definir el vector en su nacimiento.
	 * @param nodo
	 */
	public StackVector() {
		head=null;
	}
	
	public node<N> getHead() {
		return head;
	}
	public void setHead(node<N> head) {
		this.head = head;
	}
	public int getCounterNumber() {
		return counterNumber;
	}
	public void setCounterNumber(int counterNumber) {
		this.counterNumber = counterNumber;
	}

	
	public void operationVerification(N value) {
		// TODO Auto-generated method stub
		if(getCounterNumber()==1||getCounterNumber()==0) {
			System.out.print("Es inválida la operación postfix dado que no hay suficientes números para realizar dicha operación");
		}
		else {
			N value1=getHead().getValue();
			pop();
			N value2=getHead().getValue();
			pop();
			if (value=="+") {
				postfixCalculator<N> operation = new postfixCalculator<N>();
				operation.addition(value1, value2);
			}
			else if (value=="-") {
				postfixCalculator<N> operation = new postfixCalculator<N>();
				operation.substract(value1, value2);
			}
			else if (value=="*") {
				postfixCalculator<N> operation = new postfixCalculator<N>();
				operation.substract(value1, value2);
			}
			else {
				postfixCalculator<N> operation = new postfixCalculator<N>();
				operation.divide(value1, value2);
			}
		}
	}
	

	
	public N validateValue(N val) {
		try {
			
			Integer.valueOf((String)val);
			push(val);
		}
		catch (Exception e) {
			if (val=="*"|| val=="+"||val=="-"||val=="/") {
				operationVerification(val);
			}
			else {
				System.out.print("El caractér ingresado no es válido para una operación");
				return val;
			}
		}
		return val;
			
	}
	

	/***
	 * Al inicio pensé en crear dos clases constructoras de nodos, 
	 * la primera para cuando esté null y otra para cuando haya al menos 1 valor.
	 * Sin embargo, eso sería lo mismo que usar los getters y setters así que para qué? 
	 * por lo que decidí cambiarlo en mi diagrama de clases.
	 */
	@Override
	public void push(N value) {
		// TODO Auto-generated method stub
		node<N> nodo=new node<N>(value);
		if (isEmpty()) {
			nodo.setNext(null);
			setHead(nodo);
			
		}
		else {
			nodo.setNext(getHead());
			setHead(nodo);
		}
		setCounterNumber(getCounterNumber()+1);
	}

	/***
	 * Aquí es donde está la chicha y la limonada, dado que aquí es donde tengo que lograr eliminar
	 * un nodo para que sea realmente un vector variable. Aquí es donde yace el problema dado que 
	 * a diferencia del ejercicio donde simplemente se intercambian referencias yo debo lograr eliminarlo.
	 * Pero aún no se me ocurre como liberar ese espacio ocupado por ese nodo, lo único que se me ocurre
	 * es como darle un valor null.
	 */
	@Override
	public	N pop() {
		if(getCounterNumber()==0) {
			return null;
		}
		else if(getCounterNumber()==1) {
			node<N> nodopop=getHead();
			setHead(null);
			setCounterNumber(getCounterNumber()-1);
			return nodopop.getValue();
			
		}
		else {
			node<N> nodopop=getHead();
			setHead(nodopop.getNext());
			setCounterNumber(getCounterNumber()-1);
			return nodopop.getValue();
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return getCounterNumber();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (getCounterNumber()==0) {
			return true;
		}
		else {
			return false;			
		}
		
	}

	@Override
	public N peek() {
		// TODO Auto-generated method stub
		return getHead().getValue();
	}
	

}
