package Numeros;

public class Numero {
	private int numero;

	public Numero(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Numero [numero=" + numero + "]";
	}

	public int sumar(int n1) {
		return n1 + this.numero;
	}

	public int multiplicar(int n1) {
		return n1 * this.numero;
	}

	public boolean esPar() {
		boolean esPar = false;

		if (this.numero % 2 == 1) {
			esPar = false;
		} else {
			esPar = true;
		}
		return esPar;
	}

	public boolean esPrimo() {
		// El 0, 1 y 4 no son primos
		if (this.numero == 0 || this.numero == 1 || this.numero == 4) {
			return false;
		}
		for (int x = 2; x < this.numero / 2; x++) {
			// Si es divisible por cualquiera de estos números, no
			// es primo
			if (this.numero % x == 0)
				return false;
		}
		// Si no se pudo dividir por ninguno de los de arriba, sí es primo
		return true;
	}

	// +convertirAString(): String //Ver String.valueOf

	public String convertirAString() {
		return String.valueOf(this.getNumero());
	}

	public double convertirDouble() {
		return Double.parseDouble(this.convertirAString());
	}

	public double calcularPotencia(int exp) {
		double calcularPotencia = Math.pow(this.getNumero(), exp);
		return calcularPotencia;
	}

	public String pasarBase2() {

		int numero = this.getNumero();
		String base2 = "";
		while (numero > 0) {
			base2 = (numero % 2) + base2;
			numero /= 2;
		}
		return base2;
	}
	
	
	public int calcularFactorial() {
		int aux =1;
		for(int i = 2; i <=this.getNumero(); i++){
			aux = aux * i; // lo mismo: aux *=i;
		}
		return aux;
	}
	
	// numeroCombinatorio(int n1): int
	
	public int numeroCombinatorio(int n1) {
		int numeroCombinatorio = 0;
		
		return numeroCombinatorio;
	}
	

}
