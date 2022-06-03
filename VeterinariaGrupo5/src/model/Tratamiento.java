
package model;

public class Tratamiento {
    private int idTratamiento;
    private String tipo;
    private String descripcion;
    private String medicamento;
    private double importe;
    private boolean activo;

    public Tratamiento() {
    }

    public Tratamiento(String tipo, String descripcion, String medicamento, double importe, boolean activo) {
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.medicamento = medicamento;
        this.importe = importe;
        this.activo = activo;
    }
    
    public Tratamiento(int idTratamiento, String tipo, String descripcion, String medicamento, double importe, boolean activo) {
        this.idTratamiento = idTratamiento;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.medicamento = medicamento;
        this.importe = importe;
        this.activo = activo;
    }  
    
    public int getIdTratamiento() {
        return idTratamiento;
    }

    public void setIdTratamiento(int idTratamiento) {
        this.idTratamiento = idTratamiento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return idTratamiento + ", tipo=" + tipo + ", descripcion=" + descripcion + ", medicamento=" + medicamento + ", importe=" + importe + ", activo=" + activo;
    }
    
    
}
