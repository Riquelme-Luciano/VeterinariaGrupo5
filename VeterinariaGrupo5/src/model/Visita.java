package model;

import java.util.Date;

public class Visita {

    private int idConsulta;
    private Mascota mascota;
    private Tratamiento tratamiento;
    private Date fecha;
//    private double cobro;
    private String detalle;
    private double pesoMedido;
    
    public Visita() {
    }

    public Visita(int idConsulta, Mascota mascota, Tratamiento tratamiento, Date fecha, String detalle, double pesoMedido) {
        this.idConsulta = idConsulta;
        this.mascota = mascota;
        this.tratamiento = tratamiento;
        this.fecha = fecha;
        this.detalle = detalle;
        this.pesoMedido = pesoMedido;
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
/*
    public double getCobro() {
        return cobro;
    }

    public void setCobro(double cobro) {
        this.cobro = cobro;
    }
*/
    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    @Override
    public String toString() {
        return idConsulta + ", tratamiento=" + tratamiento + ", fecha=" + fecha + ", mascota=" + mascota;
    }
}
