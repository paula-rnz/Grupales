package grupal13;

public class Cliente {
    private int rut;
    private String nombres;
    private String apellidos;
    private int telefono;
    private String afp;
    private int sistemaSalud;
    private String direccion;
    private String comuna;
    private int edad;
    
    public Cliente() {
        // constructor vacío
    }
    
    public Cliente(int rut, String nombres, String apellidos, int telefono, String afp, int sistemaSalud,
                   String direccion, String comuna, int edad) {
        this.rut = rut;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.afp = afp;
        this.sistemaSalud = sistemaSalud;
        this.direccion = direccion;
        this.comuna = comuna;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Cliente [rut=" + rut + ", nombres=" + nombres + ", apellidos=" + apellidos + ", telefono=" + telefono
                + ", afp=" + afp + ", sistemaSalud=" + sistemaSalud + ", direccion=" + direccion + ", comuna=" + comuna
                + ", edad=" + edad + "]";
    }
}
