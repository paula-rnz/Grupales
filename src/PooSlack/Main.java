package PooSlack;

import java.util.Scanner;

public class Main {

	
	// Para cada ejercicio Crear una clase Main que contenga un método main donde se creen al menos dos objetos usando los metodos y constructores.
	
	
	public static void main(String[] args) {
		
			
		Scanner entrada = new Scanner(System.in);
		
		String tipo,evaluacionTipo,nombre;
		int edad, numeroEstudiante;
		
		do {
			System.out.print("Ingrese la Clase con la que quiera trabajar, "
					+ "las opciones son Estudiante, circulo, Libro, Rectangulo: ");
			tipo = entrada.next();
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
					case "profesional": {
						
				System.out.print("Ingrese direccion del Profesional: ");
				direccion = entrada.next();
				System.out.print("Ingrese años de experiencia Profesional: ");
				anioExperiencia = entrada.nextInt();
				System.out.print("Ingrese departamento del Profesional: ");
				departamento = entrada.next();
						
				break;
			}
			case "administrativo": {
					
				System.out.print("Ingrese funcion del Administrativo: ");
				funcion = entrada.next();
				System.out.print("Ingrese nombre del Superior del Administrativo: ");
				nombreSuperior = entrada.next();
						
				break;
			}
			
	   }
}
