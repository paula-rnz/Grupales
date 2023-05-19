package grupal15;

import java.time.LocalDate;
import java.time.LocalTime;

public class Accidente {
	
	int id;
	LocalDate dia;
	LocalTime hora;
	String lugar;
	String origen;
	String consecuencias;
	
	public Accidente() {
	}
	
	public Accidente(int id, LocalDate dia, LocalTime hora, String lugar, String origen, String consecuencias) {
		this.id = id;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.origen = origen;
		this.consecuencias =  consecuencias;
	}
	
	
	 public int getId() {
	        return id;
	    }
	    
	    public void setId(int id) {
	        this.id = id;
	    }
	    
	    public LocalDate getDia() {
	        return dia;
	    }
	    
	    public void setDia(LocalDate dia) {
	        this.dia = dia;
	    }
	    
	    public LocalTime getHora() {
	        return hora;
	    }
	    
	    public void setHora(LocalTime hora) {
	        this.hora = hora;
	    }
	    
	    public String getLugar() {
	        return lugar;
	    }
	    
	    public void setLugar(String lugar) {
	        this.lugar = lugar;
	    }
	    
	    public String getOrigen() {
	        return origen;
	    }
	    
	    public void setOrigen(String origen) {
	        this.origen = origen;
	    }
	    
	    public String getConsecuencias() {
	        return consecuencias;
	    }
	    
	    public void setConsecuencias(String consecuencias) {
	        this.consecuencias = consecuencias;
	    }
	
	
}
