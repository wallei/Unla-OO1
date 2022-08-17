package ProyectoInca;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TestLista {

	public static void main(String[] args) {

		/*
		*Tipo y subtipo. Tipo List, Sub-tipo: String, ejemplo: List<Persona> , List<Producto>.
		*ArrayList, la clase que vamos a instanciar no es de tipo List, es de tipo ArrayList
		*ArrayList<String>		
		*/
		
		Scanner in =new Scanner( System.in);
		System.out.println("Vamos a llenar un Arraylist del tipo STRING, el contenido de c/elemento es un String.");
		
		
		// Inicializamos un objeto lista de tipo String
		List<String> lista = new ArrayList<String>();
		
		//Entrada de las cadenas.
		String elem="";
		while(!((elem.equalsIgnoreCase("stop")))) {
			System.out.println("Para finalizar tipear stop");
			elem = in.next();
			if(!(elem.equals("stop")))
				lista.add(elem);
		}

		/*System.out.println("1) Impresion implementando foreach loop");
		for(String s: lista) {
			System.out.println(s);
		}*/
		
		System.out.println("2) Impresion implementando for loop with index");
		for(int p=0; p < lista.size(); p++) {
			System.out.println(lista.get(p));
		}
		
		

	}

}
