
public class nodoBolsa {
	
	Dato elemento;
	nodoBolsa siguiente;
	
	public nodoBolsa(Dato elemento) {
		
		this.elemento = elemento;
	}

	public Dato getElemento() {
		return elemento;
	}

	public void setElemento(Dato elemento) {
		this.elemento = elemento;
	}

	public nodoBolsa getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(nodoBolsa siguiente) {
		this.siguiente = siguiente;
	}
}
