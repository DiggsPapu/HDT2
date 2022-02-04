package calculator;
/**
 * 
 * @author Diego Andr�s Alonzo Medinilla 20172
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
	/***
	 * Al inicio pens� en crear dos clases constructoras de nodos, 
	 * la primera para cuando est� null y otra para cuando haya al menos 1 valor.
	 * Sin embargo, eso ser�a lo mismo que usar los getters y setters as� que para qu�? 
	 * por lo que decid� cambiarlo en mi diagrama de clases.
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
	 * Aqu� es donde est� la chicha y la limonada, dado que aqu� es donde tengo que lograr eliminar
	 * un nodo para que sea realmente un vector variable. Aqu� es donde yace el problema dado que 
	 * a diferencia del ejercicio donde simplemente se intercambian referencias yo debo lograr eliminarlo.
	 * Pero a�n no se me ocurre como liberar ese espacio ocupado por ese nodo, lo �nico que se me ocurre
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
