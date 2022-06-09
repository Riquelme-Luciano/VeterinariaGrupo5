  package model;

import java.util.Date;

public class Mascota {
    private int codigo;
    private String alias;
    private char sexo;
    private TipoMascota especie;
    private String raza;
    private String colorPelaje;
    private Date nacimiento;
    private boolean  activo;
    private double pesoActual;
    private Cliente cliente; 

    public Mascota() {
    }

    public Mascota(String alias, char sexo, TipoMascota especie, String colorPelaje, Date nacimiento, boolean activo, Cliente cliente) {
        this.alias = alias;
        this.sexo = sexo;
        this.especie = especie;
        this.colorPelaje = colorPelaje;
        this.nacimiento = nacimiento;
        this.activo = activo;
        this.cliente = cliente;
    }

    public Mascota(int codigo, String alias, char sexo, TipoMascota especie, String raza, String colorPelaje, Date fechaNac, double pesoActual, double pesoPromedio, boolean activo, Cliente cliente) {
        this.codigo = codigo;
        this.alias = alias;
        this.sexo = sexo;
        this.especie = especie;
        this.raza = raza;
        this.colorPelaje = colorPelaje;    
        this.activo = activo;
        this.cliente = cliente;
    }
    
    public static TipoMascota validarTipoMascota(String especie) {
        switch (especie) {
            case "Perro":
                return TipoMascota.PERRO;
            case "Gato":
                return TipoMascota.GATO;
            case "Hamster":
                return TipoMascota.HAMSTER;
            case "Loro":
                return TipoMascota.LORO;
        }
        return null;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public TipoMascota getEspecie() {
        return especie;
    }

    public void setEspecie(TipoMascota especie) {
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
    
    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public double getPesoActual() {
        return pesoActual;
    }

    public void setPesoActual(double pesoActual) {
        this.pesoActual = pesoActual;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public Cliente getDueño() {
        return cliente;
    }

    public void setDueño(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Mascota{" + "codigo=" + codigo + ", alias=" + alias + ", sexo=" + sexo + ", especie=" + especie + '}';
    }   
    
}
