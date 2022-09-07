import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Principal implements MontoVideojuegos {
	
	public int montoVideojuegos(int cantidad, int precio_unitario) {
		
		return cantidad*precio_unitario;
	}

	
	public static void main(String[] args) {
		
		Videojuego juego1 = new Videojuego("DAR SOULS 3", 10000, 5);
		Principal obj1 = new Principal();
		juego1.monto_total = obj1.montoVideojuegos(10000, 5);
		
		Videojuego juego2 = new Videojuego("THE LAST OF US", 50000, 10);
		Principal obj2 = new Principal();
		juego2.monto_total = obj2.montoVideojuegos(50000, 10);
		
		Videojuego juego3 = new Videojuego("FIFA 2022", 60000, 15);
		Principal obj3 = new Principal();
		juego3.monto_total = obj3.montoVideojuegos(60000, 15);
		
		Videojuego juego4 = new Videojuego("MARIO BROSS", 45000, 1);
		Principal obj4 = new Principal();
		juego4.monto_total = obj4.montoVideojuegos(45000, 1);
		
		Videojuego juego5 = new Videojuego("DOOM 2", 100000, 1);
		Principal obj5 = new Principal();
		juego5.monto_total = obj5.montoVideojuegos(100000, 1);
		
		Videojuego juego6 = new Videojuego("HORIZON", 50000, 5);
		Principal obj6 = new Principal();
		juego6.monto_total = obj6.montoVideojuegos(50000, 5);
		
		
		
		String nombreArchivo = "informacion_videojuegos.txt"; 
		try
		{
		File archivo = new File(nombreArchivo);
			if(!archivo.exists())
			{
				System.out.println("El archivo no existe, se crea uno nuevo");
				Path file = Paths.get(nombreArchivo);				
				List<String> lineas = Arrays.asList(juego1.toString()+juego1.monto_total+"euros", juego2.toString()+juego2.monto_total+"euros",juego3.toString()+juego3.monto_total+"euros",juego4.toString()+juego4.monto_total+"euros",juego5.toString()+
						juego5.monto_total+"euros",juego6.toString()+juego6.monto_total+"euros");
				Files.write(file, lineas, StandardCharsets.UTF_8);
			}
			else
			{
				System.out.println("El archivo ya existe.");
			}
			
		}
	
		catch (IOException e)
		{
			System.out.println("Ocurrio un error");
			e.printStackTrace();
		}


	}

}
