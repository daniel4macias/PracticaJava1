package programa;

public class Artista extends Persona {
	

	@Override
	public String toString() {
		return "Artista [artista=" + artista + "]";
	}

	private String artista;

	
	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}
	
	public Artista(String nombre, String artista) {
		super(nombre);
		this.artista = artista;
	}
	
}
