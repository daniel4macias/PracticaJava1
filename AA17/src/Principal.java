import java.util.Random;
import java.util.Scanner;


public class Principal 
{
	
	public static void main (String [] args) 
	{
		
		NumeroAleatorio numAleat = (Random ran) ->  ran.nextInt(1000000) + 1;
		
		System.out.println("Hola! Has venido a jugar, ¿verdad?");
		System.out.println("Estas en el juego de las adivinanzas y tendras que adivinar un numero.");
		System.out.println("");
		
		juego(numAleat);
	}
	
	
	public static void juego (NumeroAleatorio num_ale) 
	{
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce tu nombre: ");
		String nombre = sc.nextLine();
		System.out.println("Introduce tu apellido: ");
		String apellido = sc.nextLine();
		System.out.println("Introduce tu edad: ");
		int edad = sc.nextInt();
		
		Usuario jugador = new Usuario(nombre,apellido,edad);
		System.out.println("DATOS DEL JUGADOR:");
		System.out.println("Nombre:" + jugador.getNombre());
		System.out.println("Apellido:" + jugador.getApellido());
		System.out.println("Edad:" + jugador.getEdad());

		
		Random ran = new Random();
		int n2 = num_ale.ejecutar(ran);
		
		
		for (int i=0; i<5; i++) 
		{
			System.out.println("Introduce un numero: ");
			double n1 = sc.nextDouble();

			if(n1 == n2)
			{
				System.out.println("Adivinaste, campeon ¡Enhorabuena!");
				i=6;
			}
			else if(n1 != n2 && i==4)
			{
				System.out.println("Lo siento mucho, pero has perdido el juego.");
				System.out.println("GAME OVER");
			}
			else 
			{
				System.out.println("No has acertado, sigue intentandolo");
			}
		}
		
		sc.close();
		
	}
		
	
}
