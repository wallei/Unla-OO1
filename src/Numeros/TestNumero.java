package Numeros;


public class TestNumero {

	public static void main(String[] args) {

		Numero nro1 = new Numero(3);
		
		System.out.println("Valor de nro1: "+ nro1.getNumero());
		
		System.out.println("Sumar: "+nro1.sumar(10));
		System.out.println("Multiplicar: "+nro1.multiplicar(10));
		

	}

}
