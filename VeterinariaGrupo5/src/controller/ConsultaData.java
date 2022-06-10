package controller;

import model.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import model.Visita;

public class ConsultaData {
    private final Connection con;
    
    public ConsultaData(Conexion conexion) {
        this.con = conexion.getConexion();
    }
    
    public int insertarVisita(Visita v){
        String sql;
        try {
            sql="INSERT INTO visita (idVisita, idMascota, idTratamiento, fecha, detalle, pesoMedido) VALUES(?,?,?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, v.getIdConsulta());
            ps.setInt(2, v.getMascota().getCodigo());
            ps.setInt(3, v.getTratamiento().getIdTratamiento());
            
            long f=v.getFecha().getTime()-1900;
            java.sql.Date fechaSql= new java.sql.Date(f);
            
            ps.setDate(4, fechaSql);
            ps.setString(5,v.getDetalle());
            v.setPesoMedido(calcularPeso(v.getMascota().getCodigo()));
            ps.setDouble(6,v.getPesoMedido());
             System.out.println("llego hasta aca");
            ps.executeUpdate();
            System.out.println("visita insertada");
            return 1;
        } catch (SQLException e) {
            System.out.println("error en insertar visita\n"+e);
            return 0;
        }   
    }
    
    public double calcularPeso(int idMascota){
        String sql;
        double pesoM=0;
        try {
            sql="SELECT AVG(pesoMedido) FROM visita WHERE idMascota=?";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1,idMascota);
            ResultSet rs= ps.executeQuery();
            if(rs.next()) {
                pesoM=rs.getDouble("pesoMedido");
            }
            
        } catch (SQLException e) {
            
        }
        return pesoM;
    }
    
    public void eliminarVisita(){}
    
    public void buscarVisita(){}
    
    public void actualizarVisita(){}
    
    public void visitasDeUnaMascota(){}
    
    public void visitasDeUnTratamiento(){}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
 
    
}
