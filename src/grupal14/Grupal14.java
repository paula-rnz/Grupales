package grupal14;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Grupal14 {

	
	public static void main(String[] args) throws ParseException {
		

				
		// Instancias de la clase Cliente
		Cliente cliente1 = new Cliente(12345678, "Juan", "Pérez", 912345678, "AFP Provida", 1, "Av. Libertador 123", "Providencia", 30);
		Cliente cliente2 = new Cliente(87654321, "María", "González", 987654321, "AFP Cuprum", 2, "Calle Los Pinos 456", "Las Condes", 35);
		
		System.out.println(cliente1.toString());
		System.out.println(cliente1.obtenerNombre());
		System.out.println(cliente1.obtenerSistemaSalud());
		System.out.println(cliente2.toString());
		System.out.println(cliente2.obtenerNombre());
		System.out.println(cliente2.obtenerSistemaSalud());
		
		System.out.println("");
		
		
		// Instancias de la clase Capacitacion
		Capacitacion capacitacion1 = new Capacitacion(1234, 12345678, LocalDate.now(), LocalTime.of(9, 0), "Sala de reuniones", 30, 10);
		Capacitacion capacitacion2 = new Capacitacion(5678, 87654321, LocalDate.now(), LocalTime.of(14, 0), "Auditorio", 60, 20);

		System.out.println(capacitacion1.toString());
		System.out.println(capacitacion1.mostrarDetalle());
		System.out.println(capacitacion2.toString());
		System.out.println(capacitacion2.mostrarDetalle());
		
		System.out.println("");
		
		// Instancias de la clase Usuario
		Usuario usuario1 = new Usuario("Pedro", LocalDate.of(1999, 5, 10), 12345678);
		Usuario usuario2 = new Usuario("Ana", LocalDate.of(2001, 12, 25), 23456789);

		System.out.println(usuario1.toString());
		System.out.println(usuario1.mostrarEdad());
		System.out.println(usuario2.toString());
		System.out.println(usuario2.mostrarEdad());

	
	}
}
