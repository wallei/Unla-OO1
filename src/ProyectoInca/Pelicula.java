package ProyectoInca;

public class Pelicula {
	private int idPelicula;
	private String pelicula;
	
	public Pelicula(int idPelicula, String pelicula) {
		this.idPelicula = idPelicula;
		this.pelicula = pelicula;
	}

	public int getIdPelicula() {
		return idPelicula= idPelicula +1;
	}

	@Override
	public String toString() {
		return "Pelicula [idPelicula=" + idPelicula + ", pelicula=" + pelicula + "]";
	}

	public void setIdPelicula(int idPelicula) {
		this.idPelicula = idPelicula;
	}

	public String getPelicula() {
		return pelicula;
	}

	public void setPelicula(String pelicula) {
		this.pelicula = pelicula;
	}
	
	
	


}
