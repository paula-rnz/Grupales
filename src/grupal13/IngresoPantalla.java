package grupal13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class IngresoPantalla {

	public static void main(String[] args) throws ParseException {
				
		String evaluacionTipo;
			
		Scanner entrada = new Scanner(System.in);
		/*
		do {
			System.out.print("Ingrese el tipo de usuario para completar los datos, "
					+ "las opciones son Cliente, Usuario, Capacitacion: ");
			String tipo = entrada.next();
			evaluacionTipo = tipo.toLowerCase();
					
		}while((!evaluacionTipo.equals("cliente"))||(!evaluacionTipo.equals("usuario"))
				||(!evaluacionTipo.equals("capacitacion")));
		*/
		
		System.out.print("Ingrese el tipo de usuario para completar los datos, "
				+ "las opciones son Cliente, Usuario, Capacitacion: ");
		String tipo = entrada.next();
		evaluacionTipo = tipo.toLowerCase();                 
		
		
		switch (evaluacionTipo) {
			case "cliente": {
				
				System.out.print("Ingrese Rut del Cliente, sin puntos ni guion: ");
				int run = entrada.nextInt();
				
				System.out.print("Ingrese Nombre del Cliente: ");
				String nombres = entrada.next();
				nombres += entrada.nextLine();
				
				System.out.print("Ingrese Apellidos del Cliente: ");
				String apellidos = entrada.nextLine();
				
				System.out.print("Igrese telefono del Cliente: ");
				int telefono = entrada.nextInt();
				
				System.out.print("Ingrese afp del Cliente: ");
				String afp = entrada.nextLine();
				
				System.out.print("Ingrese Sistema de salud: 1 (Fonasa) o 2 (Isapre): ");
				int sistemaSalud = entrada.nextInt();
				
				System.out.print("Ingrese direccion del Cliente: ");
				String direccion = entrada.nextLine();
				
				System.out.print("Ingrese comuna del Cliente: ");
				String comuna = entrada.nextLine();
				
				System.out.print("Igrese edad del Cliente: ");
				int edad = entrada.nextInt();
				
				
				Cliente cliente = new Cliente(run, nombres, apellidos, telefono, afp, sistemaSalud,direccion, comuna, edad);
				
				System.out.print(cliente.toString());
						
				break;
					}
			case "usuario": {
						
				System.out.print("Ingrese Rut del Usuario, sin puntos ni guion: ");
				int run = entrada.nextInt();
				
				System.out.print("Ingrese Nombre del Usuario: ");
				String nombres = entrada.next();
				nombres += entrada.nextLine();
				
				System.out.print("Ingrese fecha de nacimiento del usuario (DD/MM/AAAA): ");
				String fechaString = entrada.next();
				DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
				LocalDate fechaNacimiento = LocalDate.parse(fechaString, formatter);

				Usuario usuario = new Usuario(nombres, fechaNacimiento, run);	
				
				System.out.print(usuario.toString());
				
				break;
			}
			
			case "capacitacion": {
					
				System.out.print("Ingrese identificcion de la capacitacion: ");
				int id = entrada.nextInt();
				
				System.out.print("Ingrese Rut del Cliente, sin puntos ni guion: ");
				int run = entrada.nextInt();
				
				System.out.print("Ingrese fecha de la Capacitacion (DD/MM/AAAA): ");
				String dateString = entrada.next();
				//convert String to LocalDate
				DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
				LocalDate diaCapacitacion = LocalDate.parse(dateString, formatter);
				
				System.out.print("Ingrese hora de la capacitacion (HH:MM): ");
				String horaString = entrada.next();
		        String[] partes = horaString.split(":");
		        String hora = partes[0];
		        String minuto = partes[1];
		        LocalTime horaCapacitacion = LocalTime.of(Integer.parseInt(hora), Integer.parseInt(minuto),0);
		        
		        System.out.print("Ingrese lugar de la Capacitacion: ");
				String lugar = entrada.nextLine();
				
				System.out.print("Ingrese duracion en horas de la Capacitacion: ");
				int duracion = entrada.nextInt();
				
				System.out.print("Ingrese cantidad de asistentes a la Capacitacion: ");
				int cantidadAsistentes = entrada.nextInt();
				
				 Capacitacion capacitacion= new Capacitacion(id, run, diaCapacitacion, horaCapacitacion,
						 lugar, duracion,  cantidadAsistentes); 
					   
				System.out.print(capacitacion.toString());
				
				break;
				

			}
			
	   }
	
	}
}
