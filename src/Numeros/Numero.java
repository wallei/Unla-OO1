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

}
