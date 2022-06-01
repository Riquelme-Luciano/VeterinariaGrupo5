
package Veterinaria.modelo;

import java.time.LocalDate;

public class Mascota {
    private int idMascota;
    private String alias;
    private String sexo;
    private String especie;
    private String raza;
    private String colorPelaje;
    private LocalDate fechaNac;
    private double pesoActual;
    private double pesoPromedio;
    private boolean  activo;
    private Cliente cliente; //idCliente database

    public Mascota() {
    }

    public Mascota(String alias, String sexo, String especie, String raza, String colorPelaje, LocalDate fechaNac, double pesoActual, double pesoPromedio, boolean activo, Cliente cliente) {
        this.alias = alias;
        this.sexo = sexo;
        this.especie = especie;
        this.raza = raza;
        this.colorPelaje = colorPelaje;
        this.fechaNac = fechaNac;
        this.pesoActual = pesoActual;
        this.pesoPromedio = pesoPromedio;
        this.activo = activo;
        this.cliente = cliente;
    }
    
    public Mascota(int idMascota, String alias, String sexo, String especie, String raza, String colorPelaje, LocalDate fechaNac, double pesoActual, double pesoPromedio, boolean activo, Cliente cliente) {
        this.idMascota = idMascota;
        this.alias = alias;
        this.sexo = sexo;
        this.especie = especie;
        this.raza = raza;
        this.colorPelaje = colorPelaje;
        this.fechaNac = fechaNac;
        this.pesoActual = pesoActual;
        this.pesoPromedio = pesoPromedio;
        this.activo = activo;
        this.cliente = cliente;
    }

    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColorPelaje() {
        return colorPelaje;
    }

    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public double getPesoActual() {
        return pesoActual;
    }

    public void setPesoActual(double pesoActual) {
        this.pesoActual = pesoActual;
    }

    public double getPesoPromedio() {
        return pesoPromedio;
    }

    public void setPesoPromedio(double pesoPromedio) {
        this.pesoPromedio = pesoPromedio;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Cliente getDueño() {
        return cliente;
    }

    public void setDueño(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "idMascota=" + idMascota + ", alias=" + alias + ", sexo=" + sexo + ", especie=" + especie + ", raza=" + raza + ", colorPelaje=" + colorPelaje + ", fechaNac=" + fechaNac + ", pesoActual=" + pesoActual + ", pesoPromedio=" + pesoPromedio + ", activo=" + activo + " dueño: " + cliente;
    }
    
    
}
