package scanner;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca un nombre de un alumno:");
		String nombre = entrada.next();
		
		System.out.println("Introduce nota 1:");
		Double nota1= entrada.nextDouble();
		System.out.println("Introduce nota 2:");
		Double nota2= entrada.nextDouble();
		System.out.println("Introduce nota 3:");
		Double nota3= entrada.nextDouble();
		System.out.println("Introdcue nota 4:");
		Double nota4= entrada.nextDouble();
		System.out.println("Introduce nota 5:");
		Double nota5= entrada.nextDouble();
		
		System.out.println("Introduce la nota media de los alumnos:");
		
		Double media=(nota1+nota2+nota3+nota4+nota5/5);
		
		if(nota1>=5 && nota2>=5 && nota3>=5 && nota4>=5 && nota5>=5) {
			System.out.println("El alumno"+nombre+ " tiene una media de"+media+ "y es apto.");
	}
		
	else {
		System.out.println("El alumno"+nombre+ "tiene una media de "+media+ "y no es apto.");
	}
	}

}
