package PooSlack;

import java.util.Scanner;

public class Main {

	
	// Para cada ejercicio Crear una clase Main que contenga un método main donde se creen al menos dos objetos usando los metodos y constructores.
	
	
	public static void main(String[] args) {
		
			
		Scanner entrada = new Scanner(System.in);
		
		String evaluacionTipo,nombre;
		int edad, numeroEstudiante;
		
		do {
			System.out.print("Ingrese la Clase con la que quiera trabajar, "
					+ "las opciones son Estudiante, circulo, Libro, Rectangulo: ");
			String tipo = entrada.next();
			evaluacionTipo = tipo.toLowerCase();
					
		}while((!evaluacionTipo.equals("circulo"))||(!evaluacionTipo.equals("estudiante"))
				||(!evaluacionTipo.equals("libro")||(!evaluacionTipo.equals("rectangulo"))));
		
		switch (evaluacionTipo) {
			case "estudiante": {
				
				for (int i=1; i<=2 ; i++) {
			   		 do {
			   			 System.out.println("Ingrese Nombre del Estudiante:");
			   			nombre = entrada.nextLine();
			   		 }while (nombre.isEmpty());	
			   		 
			   		 do {
			   			 System.out.println("Ingrese edad del Estudiante:");
			   			 edad = entrada.nextInt();
			   		 }while (edad<0);	
			   		 
			   		 do {
			   			 System.out.println("Ingrese numero del Estudiante:");
			   			numeroEstudiante = entrada.nextInt();
			   		 }while (numeroEstudiante<0);
			   		 
			   		Estudiante estudiante = new Estudiante(nombre, edad,numeroEstudiante);
			
			        System.out.println("Nombre Estudiante: "+ estudiante.getNombre());
			        System.out.println("Edad Estudiante: "+ estudiante.getEdad());
			        System.out.println("Numero Estudiante: "+ estudiante.getNumeroEstudiante());
				}				
						
			break;
			}
					case "circulo": {
						
				System.out.print("Ingrese radio: ");
				Double radio = entrada.nextDouble();
				
				Circulo circulo = new Circulo(radio);
				
				System.out.println("El Area del circulo es: "+ circulo.obtenerArea());
				System.out.println("El Perimetro del circulo es: "+ circulo.obtenerPerimetro());
				

						
				break;
			}
			case "rectangulo": {
					
				System.out.print("Ingrese ancho: ");
				int ancho = entrada.nextInt();
				System.out.print("Ingrese longitud: ");
				int longitud = entrada.nextInt();
				
				Rectangulo rectangulo = new Rectangulo(longitud,ancho);
				System.out.println("El Area del rectangulo es: "+ rectangulo.obtenerArea());
				System.out.println("El Perimetro del rectangulo es: "+ rectangulo.obtenerPerimetro());
				
						
				break;
			}
			
	   }
	}
}