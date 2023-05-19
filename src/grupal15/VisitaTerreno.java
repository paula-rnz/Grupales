package grupal15;

import java.time.LocalDate;
import java.time.LocalTime;

public class VisitaTerreno {

	int id;
	LocalDate dia;
	LocalTime hora;
	String lugar;
	String comentarios;
	
	public VisitaTerreno() {
		
	}
	
	public VisitaTerreno(int id, LocalDate dia, LocalTime hora, String lugar, String comentarios) {
		this.id = id;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.comentarios = comentarios;
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
	    
	    public String getComentarios() {
	        return comentarios;
	    }
	    
	    public void setComentarios(String comentarios) {
	        this.comentarios = comentarios;
	    }
	
}
