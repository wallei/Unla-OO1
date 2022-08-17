package ProyectoInca;

import java.util.ArrayList;

public class TestIncaa {

	public static void main(String[] args) {

		ArrayList<Pelicula> miCatalogo = new ArrayList<>();

		Pelicula pelicula1 = new Pelicula(0, "Los Extermineitors I.");
		Pelicula pelicula2 = new Pelicula(0, "Los Extermineitors II. ");
		Pelicula pelicula3 = new Pelicula(0, "Las Tortugas Pinjas I.");

		miCatalogo.add(pelicula1);
		miCatalogo.add(pelicula2);
		miCatalogo.add(pelicula3);

		System.out.println(miCatalogo.size());
		// System.out.println(miCatalogo + );

		System.out.println("CATALOGO PELICULAS Incaa:");
		for (Pelicula s : miCatalogo) {
			System.out.println(s);
		}
	}

}