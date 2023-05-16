package grupales;

import java.util.ArrayList;
import java.util.Scanner;



public class Grupal_9 {
	
	    
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        ArrayList<String> empresas = new ArrayList<>();
	        ArrayList<String> capacitaciones = new ArrayList<>();
	        String rutEmpresa;
	        String nombreEmpresa;
	        String direccionEmpresa;
	        String comunaEmpresa;
	        String telefonoEmpresa;
	        	        
	        // Ingreso de datos de la empresa
	        
	        do {
		        System.out.println("Ingrese RUT de la empresa:");
		        rutEmpresa = sc.nextLine();
	        }while (rutEmpresa.isEmpty());
	        empresas.add("Rut Empresa: "+ rutEmpresa);

	        do {
		        System.out.println("Ingrese nombre de la empresa:");
		        nombreEmpresa = sc.nextLine();
	        }while (nombreEmpresa.isEmpty());
	        empresas.add("Nombre Empresa: "+ nombreEmpresa);
	        
	        do {
		        System.out.println("Ingrese dirección de la empresa:");
		        direccionEmpresa = sc.nextLine();
	        }while (direccionEmpresa.isEmpty());
	        empresas.add("Direccion Empresa: "+ direccionEmpresa);
	        
	        do {
		        System.out.println("Ingrese comuna de la empresa:");
		        comunaEmpresa = sc.nextLine();
	        }while (comunaEmpresa.isEmpty());
	        empresas.add("Comuna Empresa: "+ comunaEmpresa);
	        
	        do {
		        System.out.println("Ingrese número de teléfono de la empresa:");
		        telefonoEmpresa = sc.nextLine();
	        }while (telefonoEmpresa.isEmpty());
	        empresas.add("Telefono Empresa: "+ telefonoEmpresa);
	        
   
	        
	        // Ingreso de datos de la capacitación
	        String diaCapacitacion;
	        String horaCapacitacion;
	        String lugarCapacitacion;
	        double duracionCapacitacion;
	        int cantidadAsistentes;
	        
	        
	        do {
		        System.out.println("\nIngrese día de la capacitación:");
		        diaCapacitacion = sc.nextLine();
	        }while (diaCapacitacion.isEmpty());
	        capacitaciones.add("Dia Capacitacion: "+ diaCapacitacion);
	        
	        do {
		        System.out.println("Ingrese hora de la capacitación:");
		        horaCapacitacion = sc.nextLine();
	        }while (horaCapacitacion.isEmpty());
	        capacitaciones.add("Hora Capacitacion: "+ horaCapacitacion);
       
	        do {
		        System.out.println("Ingrese lugar de la capacitación:");
		        lugarCapacitacion = sc.nextLine();
	        }while (lugarCapacitacion.isEmpty());
	        capacitaciones.add("Lugar Capacitacion: "+ lugarCapacitacion);
	        
	        do {
		        System.out.println("Ingrese duración de la capacitación (en horas):");
		        duracionCapacitacion = sc.nextDouble();
	        }while (duracionCapacitacion<0);
	        capacitaciones.add("Duracion Capacitacion: "+ duracionCapacitacion);
        	
	        do {
		        System.out.println("Ingrese cantidad de asistentes:");
		        cantidadAsistentes = sc.nextInt();
	        }while (cantidadAsistentes < 0 );
	        capacitaciones.add("Cantidad Asistentes: "+ cantidadAsistentes);
	        

	        String nombreAsistentes;
	        int edadAsistentes;
	        int menores25 = 0;
	        int entre26a35 = 0;
	        int mayor35 = 0;
	        
	        for(int i = 1; i <= cantidadAsistentes ; i++){
	        	
		        do {
			        System.out.println("\nIngrese Nombre del Asistente:");
			        nombreAsistentes = sc.nextLine();
		        }while (nombreAsistentes.isEmpty());
		        capacitaciones.add("Nombre Asistente: "+ nombreAsistentes);
	        
		        do {
			        System.out.println("Ingrese la edad del asistente:");
			        edadAsistentes = sc.nextInt();
			        System.out.println(edadAsistentes);
			        if (edadAsistentes<=25) {
			        	menores25++;
			        }
		        	if(edadAsistentes>=26 && edadAsistentes<=35) {
		        		entre26a35++;
		        	}
		        	if (edadAsistentes>35) {
		        		mayor35++;
		        	}
			        
		        }while ( edadAsistentes < 0 );
		        capacitaciones.add("Edad Asistente: "+ edadAsistentes);
			    }
	        
	        // Datos de empresa 
			System.out.println("");
			
			for(String empresa : empresas) {
				System.out.println(empresa);
			}
	        System.out.println("");
			
			for(String capacitacion : capacitaciones) {
				System.out.println(capacitacion);
			}

			System.out.println("\nLos menores de 25 son: " + menores25);
			System.out.println("Entre 26 y 35 son: " + entre26a35);
			System.out.println("Los mayores de 35 son: " + mayor35);


	    }
}
