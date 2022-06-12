package controller;

import model.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.Mascota;
import model.Tratamiento;
import model.Visita;

public class ConsultaData {
    private final Connection con;
    private final Conexion conexion;
            
    public ConsultaData(Conexion conexion) {
        con = conexion.getConexion();
        this.conexion=conexion;
    }
    
    public int insertarVisita(Visita v){
        String sql;
        try {
            sql="INSERT INTO visita (idVisita, idMascota, idTratamiento, fecha, detalle, pesoMedido) VALUES(?,?,?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, v.getIdConsulta());
            ps.setInt(2, v.getMascota().getCodigo());
            ps.setInt(3, v.getTratamiento().getIdTratamiento());
            
            long f=v.getFecha().getTime();
            java.sql.Date fechaSql= new java.sql.Date(f);
            
            ps.setDate(4, fechaSql);
            ps.setString(5,v.getDetalle());
            ps.setDouble(6,v.getPesoMedido());
            ps.executeUpdate();
            System.out.println("visita insertada");
            return 1;
        } catch (SQLException e) {
            System.err.println("error en insertar visita\n"+e);
            return 0;
        }   
    }
    
    public void eliminarVisita(int idMascota,int idTratamiento){
        String sql;
        PreparedStatement ps;
        try {
            sql="DELETE FROM visita WHERE idMascota=? AND idTratamiento=?";
            ps= con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idMascota);
            ps.setInt(2, idTratamiento);
            ps.executeUpdate();
            ps.close();
            System.out.println("visitas eliminadas");
        } catch (SQLException e) {
            System.err.println("ERROR en eliminar visita\n"+e);
        }
    } 
    
    public int actualizarVisita(int idM, int idT,Date date,String detalle,double peso) {
        String  sql;
        PreparedStatement ps;
        try {
            sql="UPDATE visita SET fecha=?,detalle=?,pesoMedido=? WHERE idMascota=? AND idTratamiento=?";
            ps=con.prepareStatement(sql);
            date = new java.util.Date();
            java.sql.Date sqlDate = new java.sql.Date(date.getTime());
            ps.setDate(1, sqlDate);
            ps.setString(2,detalle);
            ps.setDouble(3,peso);
            ps.setInt(4,idM);
            ps.setInt(5,idT);
            ps.executeUpdate();
            ps.close();
            System.out.println("Visita actualizada");
            return 1;
        } catch (SQLException e) {
            System.err.println("error en actualizar visita\n"+e);
            return 0;
        } 
    }
    
    public List visitasDeUnaMascota(int idMascota, int idTratamiento){
        List<Visita> visitas = new ArrayList();
        String sql;
        PreparedStatement ps;
        ResultSet rs;
        try {
            sql="SELECT idTratamiento,fecha,detalle,pesoMedido FROM visita WHERE idMascota=? AND idTratamiento=? ORDER BY fecha DESC";
            ps= con.prepareStatement(sql);
            ps.setInt(1, idMascota);
            ps.setInt(2, idTratamiento);
            rs = ps.executeQuery();
            while (rs.next()) {
                Visita v = new Visita(); 
                Tratamiento tr = buscarTratamiento(rs.getInt("idTratamiento"));
                v.setTratamiento(tr);
                v.setFecha(rs.getDate("fecha"));
                v.setDetalle(rs.getString("detalle"));
                v.setPesoMedido(rs.getDouble("pesoMedido"));
                visitas.add(v);
            }
            ps.close();
            
            System.out.println("visitas de una mascota");
            for (Visita v : visitas) {
                System.out.println(v);
            }
            
        } catch (SQLException e) {
            System.err.println("error en listar visitas De Una Mascota\n"+e);
        }
        
        return visitas;
    }
    
    
    public List visitasDeUnTratamiento(int idTratamiento){
        String sql;
        PreparedStatement ps;
        List<Visita> visitas = new ArrayList();
        try {
            sql="SELECT idVisita, idMascota,fecha, detalle, pesoMedido FROM visita WHERE idTratamiento=? ORDER BY fecha DESC";
            ps=con.prepareStatement(sql);
            ps.setInt(1, idTratamiento);
            ResultSet rs=ps.executeQuery();
            
            while (rs.next()) {
                Visita v = new Visita();
                v.setIdConsulta(rs.getInt("idVisita"));
                
                Mascota m =buscarMascota(rs.getInt("idMascota"));
                v.setMascota(m);
                
                v.setFecha(rs.getDate("fecha"));
                v.setDetalle(rs.getString("detalle"));
                v.setPesoMedido(rs.getDouble("pesoMedido"));
            }
            
        } catch (SQLException e) {
            System.err.println("error en listar visitas de un tratamiento\n"+e);
        }
        return visitas;
    }
    
    public Tratamiento buscarTratamiento(int id) {
        TratamientoData td = new TratamientoData(conexion);
        return td.consultarTratamiento(id);
    }
    
    public Mascota buscarMascota(int id) {
        MascotaData md = new MascotaData(conexion);
        return md.buscarMascota(id);
    }
    
    
    
    
    
    
    
    
    
    
    
 
    
}
