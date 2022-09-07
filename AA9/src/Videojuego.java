
public class Videojuego {
	
	
	@Override
	public String toString() {
		return "Videojuego [videojuego=" + videojuego + ", cantidad_registro=" + cantidad_registro
				+ ", precio_unitario=" + precio_unitario + "]";
	}
	
	
	
	public String getVideojuego() {
		return videojuego;
	}

	public void setVideojuego(String videojuego) {
		this.videojuego = videojuego;
	}

	public int getCantidad_registro() {
		return cantidad_registro;
	}

	public void setCantidad_registro(int cantidad_registro) {
		this.cantidad_registro = cantidad_registro;
	}

	public int getPrecio_unitario() {
		return precio_unitario;
	}

	public void setPrecio_unitario(int precio_unitario) {
		this.precio_unitario = precio_unitario;
	}



	
	
	public Videojuego(String videojuego, int cantidad_registro, int precio_unitario) {
		
		this.videojuego = videojuego;
		this.cantidad_registro = cantidad_registro;
		this.precio_unitario = precio_unitario;
		
	}
	
	

	private String videojuego;
	private int cantidad_registro;
	private int precio_unitario;
	int monto_total;

}
