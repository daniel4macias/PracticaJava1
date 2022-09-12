import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Principal implements GeneraArchivo {
	
	
	public void generaArchivo(List<String> informacion) {
		
		String nombreArchivo = "Capitales_Provincias.txt";
		try
		{
		File archivo = new File(nombreArchivo);
			if(!archivo.exists())
			{
				System.out.println("El archivo no existe, se crea uno nuevo");
				Path file = Paths.get(nombreArchivo);				
				Files.write(file, informacion, StandardCharsets.UTF_8);
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
	
	
	
	
	
	
	public static void main (String [] args) throws IOException {
		
		StringBuilder sb = new StringBuilder();	
		
		
		try
		{
		
			URL url = new URL ("https://public.opendatasoft.com/api/records/1.0/search/?dataset=provincias-espanolas&q=&rows=0&sort=-provincia&facet=ccaa&facet=provincia\r\n"
					+ ""); //Declaro la URL
			HttpURLConnection conn = (HttpURLConnection) url.openConnection(); //Declaro la conexion
			conn.connect(); //Abro la conexion
			
			int tiempoRespuesta = conn.getResponseCode(); //Para manejo de 
														  //Situaciones
						
			if(tiempoRespuesta != 200)
			{
				throw new RuntimeException("HttpResponse" + tiempoRespuesta);
			}
			else
			{
				
				Scanner sc = new Scanner(url.openStream());
				while(sc.hasNext())
				{
					sb.append(sc.nextLine());
				}
				sc.close();
				
				
			}
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		
		String linea2 = sb.toString();
		
		
		Usuario Daniel= new Usuario(3,"Daniel",LocalDate.now());
		String linea1 = Daniel.toString();
		
		List<String> linea_final = Arrays.asList(linea1+"\n"+linea2);
		
		Principal obj1 = new Principal();
		
		obj1.generaArchivo(linea_final);
		
		
	}

}
