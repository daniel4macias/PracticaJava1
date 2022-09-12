package spring;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.springframework.stereotype.Service;

import programa.Cancion;
import programa.Usuario;

@Service
public class Servicio {
	
	public void generaArchivo() throws IOException {
		
		File art2020 = new File("C:\\Users\\danie\\Desktop\\Curso2Java\\Artistas_2020.txt");
		File art2021 = new File("C:\\Users\\danie\\Desktop\\Curso2Java\\Artistas_2021.txt");
		File can2020 = new File("C:\\Users\\danie\\Desktop\\Curso2Java\\Canciones_2020.txt");
		File can2021 = new File("C:\\Users\\danie\\Desktop\\Curso2Java\\Canciones_2021.txt");
		File salida_AA16 = new File("salida_topMusica.txt");
		
		if(salida_AA16.exists()) {  //Si existe el nuevo archivo lo borra para crear uno nuevo
			salida_AA16.delete();
		}
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(salida_AA16,true));
		Scanner sc1 = new Scanner(art2020);
		Scanner sc2 = new Scanner(art2021);
		Scanner sc3 = new Scanner(can2020);
		Scanner sc4 = new Scanner(can2021);
		
		Usuario yo = new Usuario("Daniel Castro", 125);
		bw.write("Mi nombre es " + yo.getNombre() + " y mi id es " + yo.getId());
		bw.newLine();
		
		while(sc3.hasNext()) {
			String linea = sc3.nextLine();
			
			String[] Cancion = linea.split("-");
			String NombreCancion=Cancion[0];
			String CantanteYRecaudo = Cancion[Cancion.length-1];
			String[] Cantantes = CantanteYRecaudo.split(";");
			String Cantantes2 = Cantantes[0];
			double num = 0;
			if(!Cantantes[Cantantes.length-1].isEmpty()) {
				String numero = Cantantes[Cantantes.length-1];
				num = Double.parseDouble(numero);
				Cancion cancion = new Cancion(NombreCancion,Cantantes2,num);
				cancion.recaudacion();
				bw.write("Nombre Cancion: "+ cancion.getCancion() + " Cantantes: "+ cancion.getCantante()+
						 "  Recaudacion " + cancion.getRecaudacion());	
				bw.newLine();
			}
			
		}
		
		sc3.close();
		
		
		while(sc4.hasNext()) {
			String linea = sc4.nextLine();
			
			String[] Cancion = linea.split("-");
			String NombreCancion=Cancion[0];
			String CantanteYRecaudo = Cancion[Cancion.length-1];
			String[] Cantantes = CantanteYRecaudo.split(";");
			String Cantantes2 = Cantantes[0];
			double num = 0;
			if(!Cantantes[Cantantes.length-1].isEmpty()) {
				String numero = Cantantes[Cantantes.length-1];
				num = Double.parseDouble(numero);
				Cancion cancion = new Cancion(NombreCancion,Cantantes2,num);
				cancion.recaudacion();
				bw.write("Nombre Cancion: "+ cancion.getCancion() + " Cantantes: "+ cancion.getCantante()+
						 "  Recaudacion " + cancion.getRecaudacion());
				bw.newLine();
			}
			
		}
		
		sc4.close();
		
		
		while(sc1.hasNext()) {
			String linea = sc1.nextLine();
			
			bw.write("Cantante: " + linea);
			bw.newLine();
		}
		
		sc1.close();
		
		
		while(sc2.hasNext()) {
			String linea = sc2.nextLine();
			
			bw.write("Cantante: " + linea);
			bw.newLine();
		}
		
		sc2.close();
		
		
		bw.close();
		
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}

