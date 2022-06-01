
package Veterinaria.modelo;

import java.time.LocalDate;

public class Consulta {
    private int idConsulta;
    private Tratamiento tratamiento; //importe y idTratamiento
    private LocalDate fecha;
    private double pesoMedido;
    private Mascota mascota; //idMascota

    public Consulta() {
    }

    public Consulta(Tratamiento tratamiento, LocalDate fecha, Mascota mascota) {
        this.tratamiento = tratamiento;
        this.fecha = fecha;
        this.mascota = mascota;
    }
    
    public Consulta(int idConsulta, Tratamiento tratamiento, LocalDate fecha, Mascota mascota) {
        this.idConsulta = idConsulta;
        this.tratamiento = tratamiento;
        this.fecha = fecha;
        this.mascota = mascota;
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public Tratamiento getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(Tratamiento tratamiento) {
        this.tratamiento = tratamiento;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    @Override
    public String toString() {
        return "idConsulta=" + idConsulta + ", tratamiento=" + tratamiento + ", fecha=" + fecha + ", mascota=" + mascota;
    }
    
    
}
