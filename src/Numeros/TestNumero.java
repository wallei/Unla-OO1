package Numeros;


public class TestNumero {

	public static void main(String[] args) {

		Numero nro1 = new Numero(5);
		
		System.out.println("Valor de nro1: "+ nro1.getNumero());
		
		System.out.println("----------------------------------");
		System.out.println("Sumar: "+nro1.sumar(10));
		System.out.println("----------------------------------");
		System.out.println("Multiplicar: "+nro1.multiplicar(10));
		System.out.println("----------------------------------");
		System.out.println("El nro: " + nro1.getNumero() + " esPrimo: "+nro1.esPrimo());
		System.out.println("----------------------------------");
		
		System.out.println("+convertirAString(): String"); 
		System.out.println(nro1.convertirAString());
		System.out.println("----------------------------------");
		
		System.out.println("nro1 es de tipo " +  ((Object)nro1).getClass().getSimpleName());
		System.out.println("nro1 es de tipo " +  ((Object)nro1.convertirAString()).getClass().getSimpleName());
		System.out.println("----------------------------------");
		
		System.out.println("+convertirDouble():(): double");
		System.out.println(nro1.convertirDouble());
		System.out.println("----------------------------------");
		
		System.out.println("nro1 es de tipo " +  ((Object)nro1.convertirDouble()).getClass().getSimpleName());
		System.out.println("Calcular Potencia: " + nro1.calcularPotencia(2));
		System.out.println("----------------------------------");
		
		System.out.println("pasarBase2 (): String");
		System.out.println("NRO: " + nro1.getNumero() + " BINARIO: " + (nro1.pasarBase2()));
		System.out.println("----------------------------------");
		
		System.out.println("+calcularFactorial(): int");
		System.out.println("El factorial de: " + nro1.getNumero() + " es: " + nro1.calcularFactorial());
		

		

	}

}
