
package Veterinaria.model;

import java.time.LocalDate;

public class Visita {
    private int idConsulta;
    private LocalDate fecha;
    private double pesoMedido;
    private Tratamiento tratamiento; //importe y idTratamiento
    private Mascota mascota; //idMascota

    public Visita() {
    }
    
    public Visita(Tratamiento tratamiento, LocalDate fecha, Mascota mascota) {
        this.tratamiento = tratamiento;
        this.fecha = fecha;
        this.mascota = mascota;
    }
    
    public Visita(int idConsulta, Tratamiento tratamiento, LocalDate fecha, Mascota mascota) {
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
        return idConsulta + " " + fecha +" "+ tratamiento.getImporte() + " " + fecha + " " + mascota.getIdMascota()+ tratamiento.getIdTratamiento();
    }
    
    
}
