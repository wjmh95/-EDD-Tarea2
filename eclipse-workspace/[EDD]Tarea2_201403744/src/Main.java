import java.util.*;
public class Main {
	
	



	public static void main(String[] args) {
			
		Scanner s = new Scanner(System.in);
		Bolsa bolsa = new Bolsa();
		Dato data, data1, data2, data3;
		
		System.out.println("Ingrese un elemento a lista: ");
		int elemento = s.nextInt();
		data = new Dato(elemento);
		bolsa.insertar(data);
		
		System.out.println("Ingrese un elemento a lista: ");
		int elemento1 = s.nextInt();
		data1 = new Dato(elemento1);
		bolsa.insertar(data1);
		
		System.out.println("Ingrese un elemento a lista: ");
		int elemento2 = s.nextInt();
		data2 = new Dato(elemento2);
		bolsa.insertar(data2);
		
		System.out.println("Ingrese un elemento a lista: ");
		int elemento3 = s.nextInt();
		data3 = new Dato(elemento3);
		bolsa.insertar(data3);
		
		bolsa.RecorrerCircular();

	}
	
	
}
