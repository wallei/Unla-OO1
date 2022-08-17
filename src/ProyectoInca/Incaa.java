package ProyectoInca;

import java.util.ArrayList;
import java.util.List;

public class Incaa {
	// private int n;
	private List<Pelicula> catalogo;

	public Incaa(List<Pelicula> catalogo) {
		this.catalogo = catalogo;
	}

	public List<Pelicula> getCatalogo() {
		return catalogo;
	}

	public void setCatalogo(List<Pelicula> catalogo) {
		this.catalogo = catalogo;
	}

	@Override
	public String toString() {
		return "Incaa [catalogo=" + catalogo + "]";
	}

	// Inicializamos un objeto lista de tipo String
	// List<String> lista = new ArrayList<String>();

	/*
	 * Por último la clase Incaa con el atributo catalogo del tipo List<Pelicula>
	 * donde se van a realizar Altas, Modificaciones y Bajas de objetos. Por lo
	 * tanto existe una relación de agregación entre Incaa y Pelicula de uno a
	 * muchos, la objeto Incaa va tener muchos objetos Pelicula en la lista.
	 * 
	 * 
	 */

	public boolean agregarPelicula(String pelicula) {
		boolean agregarPelicula = false;
		String aux = pelicula;

		for (int p = 0; p < catalogo.size(); p++) {
			if (catalogo().contains(pelicula)) {
				System.out.println("pelicula encontrada");
			} else {
				catalogo.add(pelicula);
			}

			return agregarPelicula;
		}

	}
}