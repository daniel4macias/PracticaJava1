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
import org.json.JSONObject;


public class Principal extends Chocolate implements ProduccionActiva {
	

	public int produccionActiva(int temperatura) {
		
		if(temperatura > 40) 
		{
			return 0;
		}else 
		{
			return 1;
		}
		
	}
	
	

	public static void main(String[] args) {
		
		
		StringBuilder sb = new StringBuilder();
		int temperaturaMax = 0;
		
		
		
		try
		{
		
			URL url = new URL ("https://www.el-tiempo.net/api/json/v2/provincias/41"); //Declaro la URL
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
					JSONObject respuesta = new JSONObject(sb.toString()) ;
					JSONObject temperaturas = respuesta.getJSONArray("ciudades").getJSONObject(0).getJSONObject("temperatures");
					temperaturaMax = temperaturas.getInt("max"); 
				}
				sc.close();
				//System.out.println(sb);	
				//System.out.println(temperaturaMax);
				
			}
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		Chocolate Blanco = new Chocolate();
		Blanco.nombre = "Chocolate Blanco";
		Blanco.cantidad = 1000;
		Blanco.calorias = 350;
		
		Chocolate Negro = new Chocolate();
		Negro.nombre = "Chocolate Negro";
		Negro.cantidad = 1500;
		Negro.calorias = 400;
		
		Chocolate Almendrado = new Chocolate();
		Almendrado.nombre = "Chocolate con Almendras";
		Almendrado.cantidad = 1200;
		Almendrado.calorias = 120;
		
		Chocolate Castanias = new Chocolate();
		Castanias.nombre = "Chocolate con Castanias de Caju";
		Castanias.cantidad = 1300;
		Castanias.calorias = 500;
		
		Chocolate Rama = new Chocolate();
		Rama.nombre = "Chocolate en Rama";
		Rama.cantidad = 100;
		Rama.calorias = 248;
		
		Chocolate Cacao = new Chocolate();
		Cacao.nombre = "Chocolate con 70% de Cacao";
		Cacao.cantidad = 1500;
		Cacao.calorias = 550;		
		
		
		if(temperaturaMax > 40) 
		{
			System.out.println("Lo siento mucho!! Pero debido a las altas temperaturas actuales, es imposible fabricar chocolate");
		}
		else
		{
			System.out.println("Se le muestra en el txt los distintos tipos de chocolate y las cantidades fabricadas. ¡Un saludo!");
			String nombreArchivo = "salida_"+LocalDate.now()+".txt"; 
			try
			{
			File archivo = new File(nombreArchivo);
				if(!archivo.exists())
				{
					System.out.println("El archivo no existe, se crea uno nuevo");
					Path file = Paths.get(nombreArchivo);				
					List<String> lineas = Arrays.asList("Nombre: " + Blanco.nombre + ";" + "Cantidad Producida: " + Blanco.cantidad,"Nombre: " + Negro.nombre + ";" + "Cantidad Producida: " + Negro.cantidad,
							"Nombre: " + Almendrado.nombre + ";" + "Cantidad Producida: " + Almendrado.cantidad,"Nombre: " + Castanias.nombre + ";" + "Cantidad Producida: " + Castanias.cantidad,
							"Nombre: " + Rama.nombre + ";" + "Cantidad Producida: " + Rama.cantidad,"Nombre: " + Cacao.nombre + ";" + "Cantidad Producida: " + Cacao.cantidad);
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

}
