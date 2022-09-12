package programa;

public class Cancion implements Recaudacion {
	
	private String cancion;
	private String cantante;
	private double visiones;
	private double recaudacion;

	
	public String getCancion() {
		return cancion;
	}
	public void setCancion(String cancion) {
		this.cancion = cancion;
	}
	public String getCantante() {
		return cantante;
	}
	public void setCantante(String cantante) {
		this.cantante = cantante;
	}
	public double getVisiones() {
		return visiones;
	}
	public void setVisiones(double visiones) {
		this.visiones = visiones;
	}
	public double getRecaudacion() {
		return recaudacion;
	}
	public void setRecaudacion(double recaudacion) {
		this.recaudacion = recaudacion;
	}
	
	
	@Override
	public String toString() {
		return "Cancion [cancion=" + cancion + ", cantante=" + cantante + ", visiones=" + visiones + ", recaudacion="
				+ recaudacion + "]";
	}
	
	
	public Cancion (String cancion, String cantante, double visiones) {
		super();
		this.cancion = cancion;
		this.cantante = cantante;
		this.visiones = visiones;
	}
	
	
	public void recaudacion() {
		this.recaudacion = this.visiones*2;
		
	}
}
