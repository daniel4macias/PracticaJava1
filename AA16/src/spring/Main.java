package spring;

import java.io.IOException;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

	public static void main(String[] args) throws IOException {
		
		try (
AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigurarSpring.class)) {
			
			Servicio servicio = ctx.getBean(Servicio.class);
			
			servicio.generaArchivo();
			
		}catch (BeansException e) {
			e.printStackTrace();
		}
	
	
	}

}
