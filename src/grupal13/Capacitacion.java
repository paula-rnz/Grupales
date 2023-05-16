package grupal13;

import java.time.LocalDate;
import java.time.LocalTime;

public class Capacitacion {
    private int identificador;
    private String rutCliente;
    private LocalDate dia;
    private LocalTime hora;
    private String lugar;
    private int duracion;
    private int cantidadAsistentes;

    public Capacitacion(int identificador, String rutCliente, LocalDate dia, LocalTime hora, String lugar, int duracion, int cantidadAsistentes) {
        this.identificador = identificador;
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.cantidadAsistentes = cantidadAsistentes;
    }
    
    @Override
    public String toString() {
        return "Capacitacion{" +
                "identificador=" + identificador +
                ", rutCliente='" + rutCliente + '\'' +
                ", dia=" + dia +
                ", hora=" + hora +
                ", lugar='" + lugar + '\'' +
                ", duracion=" + duracion +
                ", cantidadAsistentes=" + cantidadAsistentes +
                '}';
    }
}
