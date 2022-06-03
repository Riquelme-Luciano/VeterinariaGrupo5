package model;

import java.util.Date;

public class Visita {
    private int idConsulta;
    private Date fecha;
    private double pesoMedido;
    private Tratamiento tratamiento;
    private Mascota mascota; 

    public Visita() {
    }

    public Visita(Date fecha,Mascota mascota,Tratamiento tratamiento, double pesoMedido) {
        this.fecha = fecha;
        this.pesoMedido = pesoMedido;
        this.tratamiento = tratamiento;
        this.mascota = mascota;
    }

    public Visita(int idConsulta, Date fecha,Mascota mascota,Tratamiento tratamiento, double pesoMedido) {
        this.idConsulta = idConsulta;
        this.fecha = fecha;
        this.pesoMedido = pesoMedido;
        this.tratamiento = tratamiento;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public double getPesoMedido() {
        return pesoMedido;
    }

    public void setPesoMedido(double pesoMedido) {
        this.pesoMedido = pesoMedido;
    }    
    
    @Override
    public String toString() {
        return idConsulta + ", tratamiento=" + tratamiento + ", fecha=" + fecha + ", mascota=" + mascota;
    }
}
