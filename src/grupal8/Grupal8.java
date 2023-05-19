package grupal8;

import java.util.Scanner;

public class Grupal8 {


	public static void main(String[] args) {
		//datos basicos
		String nombre,fechaNacimiento,run,tipo;
		
		//datos perfil Cliente
		String direccion,telefono,empresa;
		int cantidadEmpleados;
		
		//datos perfil Profesional
		int anioExperiencia;
		String departamento;
		
		//datos perfil Administrativo
		String funcion,nombreSuperior;
		String evaluacionTipo;
	
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingrese el tipo de usuario para completar los datos, las opciones son Cliente, Profesional, Administrativo: ");
		tipo = entrada.next();
		evaluacionTipo = tipo.toLowerCase();
				
		
		
		switch (evaluacionTipo) {
		case "cliente": {
			
			String datosUsuarios= registrarUsuario();
			
			System.out.println("Ingrese direccion del Cliente: ");
			direccion = entrada.next();
			System.out.println("Ingrese telefono del Cliente: ");
			telefono = entrada.next();
			System.out.println("Ingrese cantidad de empleados: ");
			cantidadEmpleados = entrada.nextInt();
			entrada.close();
			
			System.out.println("\nLos datos del Cliente son: \n");
			System.out.println(datosUsuarios);
			System.out.println("Direccion: " + direccion + "\nTelefono:  " + telefono + "\nCantidadEmpleados: " + cantidadEmpleados );
			
			break;
		}
		case "profesional": {
			
			String datosUsuarios= registrarUsuario();
			
			System.out.println("Ingrese direccion del Profesional: ");
			direccion = entrada.next();
			System.out.println("Ingrese años de experiencia Profesional: ");
			anioExperiencia = entrada.nextInt();
			System.out.println("Ingrese departamento del Profesional: ");
			departamento = entrada.next();
			
			System.out.println("\nLos datos del Profesional son: \n");
			System.out.println(datosUsuarios);
			System.out.println("Direccion: " + direccion + "\nAños Experiencia:  " + anioExperiencia + "\nDepartamento: " + departamento );

			
			break;
		}
		case "administrativo": {
			
			String datosUsuarios= registrarUsuario();
			
			System.out.println("Ingrese funcion del Administrativo: ");
			funcion = entrada.next();
			
			System.out.println("Ingrese nombre del Superior del Administrativo: ");
			nombreSuperior = entrada.next();
			
			System.out.println("\nLos datos del Administrativo son: \n");
			System.out.println(datosUsuarios);
			System.out.println("Funcion: " + funcion + "\nNombre del Superior:  " + nombreSuperior);

			
			break;
		}
		default:
			System.out.println("\ntipo no encontrado");
		}
		
		System.out.println("fin");
	
	}
	
	
	public static String registrarUsuario() {
		String nombre,fechaNacimiento,run,tipo;
		
		Scanner entrada = new Scanner(System.in);
				
		System.out.println("Ingrese datos básicos del usuario\n");
		
		System.out.println("Ingrese nombre del usuario: ");
		nombre = entrada.next();
		nombre += entrada.nextLine();
		
		System.out.println("Ingrese fecha de naciemiento del usuario: ");
		fechaNacimiento = entrada.next();
		
		System.out.println("Ingrese run del usuario: ");
		run = entrada.next();
		
		
		return "Nombre: " + nombre + "\nFecha de Nacimiento:  " + fechaNacimiento + "\nRun: " + run ;
	}
	
	
	
}
