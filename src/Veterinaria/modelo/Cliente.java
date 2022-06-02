
package Veterinaria.modelo;

public class Cliente {
    private int idCliente;
    private long dni;
    private String nombre;
    private String apellido;
    private String direccion;
    private long telefono;
    private String contactoAlternativo;

    public Cliente() {
    }

    public Cliente(long dni, String nombre, String apellido, long telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono= telefono;
    }
    
    public Cliente(long dni, String nombre, String apellido, String direccion, long telefono, String alternativa) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        contactoAlternativo = alternativa;
    }

    public Cliente(int idCliente, long dni, String nombre, String apellido, String direccion, long telefono, String alternativa) {
        this.idCliente = idCliente;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        contactoAlternativo = alternativa;
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

    public String getAlternativa() {
        return contactoAlternativo;
    }

    public void setAlternativa(String alternativa) {
        this.contactoAlternativo = alternativa;
    }

    @Override
    public String toString() {
        return idCliente + ", dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", telefono=" + telefono + ", alternativa=" + contactoAlternativo;
    }
    
    
}
