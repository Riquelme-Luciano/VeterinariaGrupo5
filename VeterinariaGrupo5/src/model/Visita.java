package model;

import java.util.Date;

public class Visita {

    private int idConsulta;
    private Date fecha;
    private Mascota mascota;
    private Tratamiento tratamiento;
    private double pesoMedido;
    private double cobro;
    private String detalle;
    private String formaPago;
    
    public Visita() {
    }

    public Visita(Date fecha, Mascota mascota, Tratamiento tratamiento, double pesoMedido, double cobro, String detalle) {
        this.fecha = fecha;
        this.mascota = mascota;
        this.tratamiento = tratamiento;
        this.pesoMedido = pesoMedido;
        this.cobro = cobro;
        this.detalle = detalle;
    }

    public Visita(int idConsulta, Date fecha, Mascota mascota, Tratamiento tratamiento, double pesoMedido, double cobro, String detalle) {
        this.idConsulta = idConsulta;
        this.fecha = fecha;
        this.mascota = mascota;
        this.tratamiento = tratamiento;
        this.pesoMedido = pesoMedido;
        this.cobro = cobro;
        this.detalle = detalle;
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

    public double getCobro() {
        return cobro;
    }

    public void setCobro(double cobro) {
        this.cobro = cobro;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }    

    @Override
    public String toString() {
        return idConsulta + ", tratamiento=" + tratamiento + ", fecha=" + fecha + ", mascota=" + mascota;
    }
}
