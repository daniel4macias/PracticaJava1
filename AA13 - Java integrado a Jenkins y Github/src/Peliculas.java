
public class Peliculas {
	
    private String nombre;
    private String recaudacion;
    
    
    @Override
    public String toString() {
        return "Pelicula [Nombre=" + nombre + ", Recaudacion=" + recaudacion + "]";
    }
    

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getRecaudacion() {
        return recaudacion;
    }
    public void setRecaudacion(String recaudacion) {
        this.recaudacion = recaudacion;
    }
    
    
    
    public Peliculas(String nombre, String recaudacion) {
        super();
        this.nombre = nombre;
        this.recaudacion = recaudacion;
    }

}