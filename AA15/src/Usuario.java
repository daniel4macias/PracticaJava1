import java.time.LocalDate;

public class Usuario {
	

	int id;
	String nombre_usuario;
	LocalDate fecha;

	
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre_usuario=" + nombre_usuario + ", fecha=" + fecha + "]";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre_usuario() {
		return nombre_usuario;
	}
	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	
	public Usuario (int id, String nombre_usuario, LocalDate fecha) {
		
		this.id=id;
		this.nombre_usuario=nombre_usuario;
		this.fecha=fecha;
		
	}

}
