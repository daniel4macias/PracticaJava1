package spring;

import java.io.File;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component

public class AspectoLog {
	
	@Before("execution(* generaArchivo())")
	public void log() {
		System.out.println("Se va a generar un nuevo archivo.");
	}
	
	
	@After("execution(* generaArchivo())") 
	public void log1() {
		System.out.println("Se ha generado el nuevo archivo");
	}
	
	
	@Before("execution(* generaArchivo())") 
	public void log2() {
		System.out.println("Vamos a comprobar que los ficheros vengan en formato .txt");
		File art2020 = new File("C:\\Users\\danie\\Desktop\\Curso2Java\\AA16\\Artistas_2020.txt");
		File art2021 = new File("C:\\Users\\danie\\Desktop\\Curso2Java\\AA16\\Artistas_2021.txt");
		File can2020 = new File("C:\\Users\\danie\\Desktop\\Curso2Java\\AA16\\Canciones_2020.txt");
		File can2021 = new File("C:\\Users\\danie\\Desktop\\Curso2Java\\AA16\\Canciones_2021.txt");
		String artist2020 = art2020.getName();
		String artist2021 = art2021.getName();
		String cancio2020 = can2020.getName();
		String cancio2021 =can2021.getName();
		if(!artist2020.contains(".txt")) {
			System.out.println("Los artistas 2020 no vienen en formato .txt");
		}
		if(!artist2021.contains(".txt")) {
			System.out.println("Los artistas 2021 no vienen en formato .txt");
		}
		if(!cancio2020.contains(".txt")) {
			System.out.println("Las canciones 2020 no vienen en formato .txt");
		}
		if(!cancio2021.contains(".txt")) {
			System.out.println("Las canciones 2021 no vienen en formato .txt");
		}else {
			System.out.println("Vienen en formato .txt correctamente");
		}
	}

}
