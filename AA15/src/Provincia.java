
public class Provincia extends CapitalProvincia{
	
	
	String nombre_provincia;

	public String getNombre_provincia() {
		return nombre_provincia;
	}

	public void setNombre_provincia(String nombre_provincia) {
		this.nombre_provincia = nombre_provincia;
	}
	
	
	public Provincia (String nombre_capital, String nombre_provincia) {
		
		super(nombre_capital);
		this.nombre_provincia = nombre_provincia;
		
	}

}
