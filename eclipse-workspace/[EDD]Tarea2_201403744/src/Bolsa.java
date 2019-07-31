import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Bolsa {
	
	nodoBolsa inicio = null;
	nodoBolsa fin = null;
	Dato data;
	
	public void insertar(Dato data) {
		
		nodoBolsa nuevo = new nodoBolsa(data);
		if(esVacio()) {
			
			inicio = nuevo;
			inicio.siguiente = inicio;
			fin = inicio;
		}else {
			
			fin.siguiente = nuevo;
			nuevo.siguiente = inicio;
			fin = nuevo;
		}
	}
	
	public boolean esVacio() {
		
		return inicio == null;
	}
	
	public void RecorrerCircular () {
			
			nodoBolsa aux = inicio;
			int contador = 0;
			do {
				
				System.out.println("Elemento: " + aux.elemento.elemento);
				contador ++;
				aux = aux.siguiente;
				
			}while (aux != inicio ) ;
			
			System.out.println("Numero de elementos en lista: "+ contador);
			
		}
	}
	
	