
public class CapitalProvincia{

	@Override
	public String toString() {
		return "CapitalProvincia [nombre_capital=" + nombre_capital + "]";
	}


	String nombre_capital;

	public String getNombre_capital() {
		return nombre_capital;
	}

	public void setNombre_capital(String nombre_capital) {
		this.nombre_capital = nombre_capital;
	}
	
	
	public CapitalProvincia (String nombre_capital) {
		
		super();
		this.nombre_capital=nombre_capital;
		
	}
	
	
}
