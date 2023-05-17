package PooSlack;

import java.time.LocalDate;
import java.time.Month;

public class Main {

	
	// Para cada ejercicio Crear una clase Main que contenga un método main donde se creen al menos dos objetos usando los metodos y constructores.
	
	
	public static void main(String[] args) {
		
		//Estudiantes
		Estudiante estudiante1 = new Estudiante("Juan Pérez", 20, 12345);
		Estudiante estudiante2 = new Estudiante("María López", 19, 54321);

		System.out.println(estudiante1.toString());
		System.out.println(estudiante2.toString());
		
		
		
		//Libros
		Libro libro1 = new Libro("El señor de los anillos", "J.R.R. Tolkien", LocalDate.of(1954, Month.JULY, 29));
		Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", LocalDate.of(1967, Month.JUNE, 5));

		System.out.println(libro1.toString());
		System.out.println(libro2.toString());
		
		
		
		// Circulo
		Circulo circulo1 = new Circulo(5.0);
		Circulo circulo2 = new Circulo(7.0);
		
		System.out.println("El area del circulo 1 es: "+circulo1.obtenerArea());
		System.out.println("El area del circulo 2 es: "+circulo2.obtenerArea());
		System.out.println("");		
		System.out.println("El Perimetro del circulo 1 es: "+circulo1.obtenerPerimetro());
		System.out.println("El Perimetro del circulo 2 es: "+circulo2.obtenerPerimetro());
		
		
		
		// Rectangulo
		Rectangulo rectangulo1 = new Rectangulo(5,7);
		Rectangulo rectangulo2 = new Rectangulo(8,9);
		
		System.out.println("El area del rectangulo 1 es: "+rectangulo1.obtenerArea());
		System.out.println("El area del rectangulo 2 es: "+rectangulo2.obtenerArea());
		System.out.println("");		
		System.out.println("El Perimetro del rectangulo 1 es: "+rectangulo1.obtenerPerimetro());
		System.out.println("El Perimetro del rectangulo 2 es: "+rectangulo2.obtenerPerimetro());
		
		
	}
}