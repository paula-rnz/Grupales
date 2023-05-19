package grupal15;

public class Revision {
	
	int id;
	String nombre;
	String detalle;
	int estado;
	
	public Revision() {
		
	}
	
	public Revision(int id, String nombre, String detalle, int estado) {
		this.id = id;
		this.nombre = nombre;
		this.detalle = detalle;
		this.estado = estado;
		
	}
	
	   public int getId() {
	        return id;
	    }
	    
	    public void setId(int id) {
	        this.id = id;
	    }
	    
	    public String getNombre() {
	        return nombre;
	    }
	    
	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }
	    
	    public String getDetalle() {
	        return detalle;
	    }
	    
	    public void setDetalle(String detalle) {
	        this.detalle = detalle;
	    }
	    
	    public int getEstado() {
	        return estado;
	    }
	    
	    public void setEstado(int estado) {
	        this.estado = estado;
	    }

}
