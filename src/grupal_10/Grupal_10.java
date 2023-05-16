package grupales;

import java.util.ArrayList;
import java.util.Scanner;

public class Grupal_10 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> empresas = new ArrayList<>();
        ArrayList<String> capacitaciones = new ArrayList<>();
       
        
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
        

        
        //Ingreso asistentes
        
        String nombreAsistentes;
        Double notaAsistentes;
        
        String [][] alumnos = new String[cantidadAsistentes][2];
        Double sumaNotas = 0.0;
        Double promedio = 0.0;
        Double calificacionMenor = 7.0;
        Double calificacionMayor = 0.0;
        
        for(int i = 0; i < cantidadAsistentes ; i++){
        	
	        do {
		        System.out.println("\nIngrese Nombre del Alumno:");
		        nombreAsistentes = sc.nextLine();
	        }while (nombreAsistentes.isEmpty());
	        alumnos [i][0] = nombreAsistentes;
        
	        do {
		        System.out.println("Ingrese la nota del alumno:");
		        notaAsistentes = sc.nextDouble();
		        System.out.println(notaAsistentes);		        
	        }while ( notaAsistentes < 1 || notaAsistentes > 7);
	        alumnos [i][1] = nombreAsistentes;
	        sumaNotas = sumaNotas + notaAsistentes;
	        
	        if (calificacionMenor>notaAsistentes) {
	        	calificacionMenor = notaAsistentes;
		    }

	        if (calificacionMayor<notaAsistentes) {
	        	calificacionMayor = notaAsistentes;
		    }
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
		
        System.out.println("");

        for(int i = 0; i < cantidadAsistentes ; i++){
        	
	        System.out.println("Nombre Alumno: "+alumnos [i][0]);
	        System.out.println("Nota Alumno: "+alumnos [i][1]);
	        
        }
        
        
		
		System.out.println("\nPromedio: " + sumaNotas/cantidadAsistentes);
		System.out.println("Nota mas baja: " + calificacionMenor);
		System.out.println("Nota mas alta: " + calificacionMayor);

    }
    
}

