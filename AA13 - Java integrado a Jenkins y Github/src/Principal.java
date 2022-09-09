import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Principal {
	
	
	public static void main (String [] args) throws IOException {
		
		Peliculas peli1 = new Peliculas("Avatar", "284739733");
		Peliculas peli2 = new Peliculas("Avengers: Endgame", "279750132");
		Peliculas peli3 = new Peliculas("Titanic", "220164726");
		Peliculas peli4 = new Peliculas("Star Wars", "2069521700");
		Peliculas peli5 = new Peliculas("Avengers: Infinity War", "2048359754");
		Peliculas peli6 = new Peliculas("Spider-Man", "1910675428");
		Peliculas peli7 = new Peliculas("Jurassic World", "1671537444");
		Peliculas peli8 = new Peliculas("The Lion King", "1663250487");
		Peliculas peli9 = new Peliculas("The Avengers", "1518815515");
		Peliculas peli10 = new Peliculas("Furious 7", "1515341399");
		
		
		String nombreArchivo = "Peliculas_1_10.txt"; 
		try
		{
		File archivo = new File(nombreArchivo);
			if(!archivo.exists())
			{
				System.out.println("El archivo no existe, se crea uno nuevo");
				Path file = Paths.get(nombreArchivo);				
				List<String> lineas = Arrays.asList(peli1.getNombre() + "    " + ";" + peli1.getRecaudacion(),peli2.getNombre() + "    " + ";" + peli2.getRecaudacion(),peli3.getNombre() + "    " + ";" + peli3.getRecaudacion(),
						peli4.getNombre() + "    " + ";" + peli4.getRecaudacion(),peli5.getNombre() + "    " + ";" + peli5.getRecaudacion(),peli6.getNombre() + "    " + ";" + peli6.getRecaudacion(),peli7.getNombre() + "    " + ";" + peli7.getRecaudacion(),
						peli8.getNombre() + "    " + ";" + peli8.getRecaudacion(),peli9.getNombre() + "    " + ";" + peli9.getRecaudacion(),peli10.getNombre() + "    " + ";" + peli10.getRecaudacion());
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
		
		
	
		
		List<String> listaPelis = new ArrayList<String>();
        List<File> ficheros = new ArrayList<>();
        int numero = 2;
        ficheros.add(new File("Peliculas_1_10.txt"));
        ficheros.add(new File("Peliculas_11_20.txt"));
        try {
            for (int i = 0; i < numero; i++) {
                Scanner sc = new Scanner(ficheros.get(i));
                while (sc.hasNext()) {
                    String linea = sc.nextLine();
                    String[] division = linea.split(";");
                    listaPelis.add(division[0]);
                    listaPelis.add(division[1]);
                }
                sc.close();
            }
            System.out.println(listaPelis);
        } catch (FileNotFoundException e) {
            System.out.println("Excepcion en listapelis");
            e.printStackTrace();
        }
        
        
        
        String nombreArchivo2 = "top20_mejores_peliculas.txt"; 
		try
		{
		File archivo = new File(nombreArchivo2);
			if(!archivo.exists())
			{
				System.out.println("El archivo no existe, se crea uno nuevo");
				Path file = Paths.get(nombreArchivo2);	
				List<String> lineas = Arrays.asList(listaPelis.get(0) + listaPelis.get(1) + "\n",listaPelis.get(2) + listaPelis.get(3) + "\n",listaPelis.get(4) + listaPelis.get(5) + "\n",listaPelis.get(6) + listaPelis.get(7) + "\n",listaPelis.get(8) + listaPelis.get(9) + "\n",listaPelis.get(10) + listaPelis.get(11) + "\n",
						listaPelis.get(12) + listaPelis.get(13) + "\n",listaPelis.get(14) + listaPelis.get(15) + "\n",listaPelis.get(16) + listaPelis.get(17) + "\n",listaPelis.get(18) + listaPelis.get(19) + "\n",listaPelis.get(20) + listaPelis.get(21) + "\n",listaPelis.get(22) + listaPelis.get(23) + "\n",listaPelis.get(24) + listaPelis.get(25) + "\n",listaPelis.get(26) + listaPelis.get(27) + "\n",listaPelis.get(28) + listaPelis.get(29) + "\n",
						listaPelis.get(30) + listaPelis.get(31) + "\n",listaPelis.get(32) + listaPelis.get(33) + "\n",listaPelis.get(34) + listaPelis.get(35) + "\n",listaPelis.get(36) + listaPelis.get(37) + "\n",listaPelis.get(38) + listaPelis.get(39) + "\n");
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


