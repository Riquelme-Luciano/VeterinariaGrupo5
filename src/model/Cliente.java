package model;

import java.util.List;

public class Cliente {

    private long dni;
    private String nombre;
    private String apellido;
    private long telefono;
    private String direccion;
    private String contactoAlternativo;
    private List<Mascota> mascotas;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, long telefono, String direccion, String alternativa) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public Cliente(long dni, String nombre, String apellido, long telefono, String direccion, String alternativa) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        contactoAlternativo = alternativa;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getAlternativa() {
        return contactoAlternativo;
    }

    public void setAlternativa(String alternativa) {
        this.contactoAlternativo = alternativa;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido;
    }

}
