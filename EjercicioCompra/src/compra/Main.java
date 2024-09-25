package compra;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
	        
	  
	        System.out.println("Introduce el tipo de cliente (Normal, Socio, VIP):");
	        String cliente = entrada.next(); 


	        System.out.println("Introduzca el importe de la compra:");
	        double importe = entrada.nextDouble();  
	        double totalPagar = importe;
	        
	        if (cliente.equalsIgnoreCase("Normal")) {
	          
	            System.out.println("El total a pagar por cliente Normal es: " + totalPagar);
	        } else if (cliente.equalsIgnoreCase("Socio")) {
	          
	            totalPagar = importe - (importe * 0.05); 
	            System.out.println("El total a pagar por ser Socio es: " + totalPagar);
	        } else if (cliente.equalsIgnoreCase("VIP")) {
	          
	            totalPagar = importe - (importe * 0.20); 
	            System.out.println("El total a pagar por ser VIP es: " + totalPagar);
	        } else {
	            
	            System.out.println("Tipo de cliente no válido. Introduzca 'Normal', 'Socio' o 'VIP'.");
	        }

	       
	        entrada.close();
	    }
	


	}


