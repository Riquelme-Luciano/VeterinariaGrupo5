
package Veterinaria.model;

public class Cliente {
    private int idCliente;
    private long dni;
    private String nombre;
    private String apellido;
    private String direccion;
    private long telefono;
    private String contactoAlternativo;
    private boolean activo;

    public Cliente() {
    }

    public Cliente(long dni, String nombre, String apellido, long telefono, boolean activo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.activo = activo;
    }
    
    public Cliente(long dni, String nombre, String apellido, String direccion, long telefono, String contactoAlternativo, boolean activo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.contactoAlternativo = contactoAlternativo;
        this.activo = activo;
    }
    
    public Cliente(int idCliente, long dni, String nombre, String apellido, String direccion, long telefono, String contactoAlternativo, boolean activo) {
        this.idCliente = idCliente;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.contactoAlternativo = contactoAlternativo;
        this.activo = activo;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
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

    public String getContactoAlternativo() {
        return contactoAlternativo;
    }

    public void setContactoAlternativo(String contactoAlternativo) {
        this.contactoAlternativo = contactoAlternativo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return idCliente + " " + dni + " " + nombre + " " + apellido + " " + direccion + " " + telefono + " " + contactoAlternativo + " " + activo;
    }
  
    
    
}
