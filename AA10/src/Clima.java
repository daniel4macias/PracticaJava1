import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Clima {

	public static void main(String[] args) {
		
		System.out.println("Hola! Bienvenid@!!");
		System.out.println("Introduce tu nombre, por favor: ");
		try (Scanner nombre = new Scanner(System.in)) {
			nombre.nextLine();
		}
		System.out.println("¿Te apetece ver el tiempo actual? :)");
		System.out.println("A continuacion lo veremos!!\n");
		
		try  //tarda un pelin en compilar puesto que la api tiene muchos datos
		{
		
			URL url = new URL ("https://www.el-tiempo.net/api/json/v2/home"); 
			HttpURLConnection conn = (HttpURLConnection) url.openConnection(); 
			conn.connect(); //Abro la conexion
		
			int tiempoRespuesta = conn.getResponseCode(); 
														
			
			if(tiempoRespuesta != 200)
			{
				throw new RuntimeException("HttpResponse" + tiempoRespuesta);
			}
			else
			{
				StringBuilder informacionString = new StringBuilder();
				Scanner sc = new Scanner(url.openStream());
				while(sc.hasNext())
				{
					informacionString.append(sc.nextLine());
				}
				sc.close();
				System.out.println(informacionString);				
			}				

			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
