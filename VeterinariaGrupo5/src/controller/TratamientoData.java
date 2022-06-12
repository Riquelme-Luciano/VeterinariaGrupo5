package controller;

import model.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Tratamiento;

public class TratamientoData {

    private final Connection con;

    public TratamientoData(Conexion conexion) {
        this.con = conexion.getConexion();
    }

    public int insertarTratamiento(Tratamiento tr) {
        String sql;
        PreparedStatement ps;
        try {
            sql = "INSERT INTO tratamiento ( tipo, descripcion, medicamento, importe, activo) VALUES (?, ?, ?, ?, ?)";
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, tr.getTipo());
            ps.setString(2, tr.getDescripcion());
            ps.setString(3, tr.getMedicamento());
            ps.setDouble(4, tr.getImporte());
            ps.setBoolean(5, tr.isActivo());
            ps.executeUpdate();

            System.out.println("tratamiento insertado");
            return 1;
        } catch (SQLException e) {
            System.out.println("Error al insertar tratamiento\n" + e);
            return 0;
        }

    }

    public void eliminarTratamiento(int id) {
        try {
            String sql = "UPDATE tratamiento SET activo=0 WHERE id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("tratamiento eliminado");
        } catch (SQLException e) {
            System.out.println("error al eliminar tratamiento\n" + e);
        }

    }

     public void activarTratamiento(int id) {
        try {
            String sql = "UPDATE tratamiento SET activo=1 WHERE id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("tratamiento activado");
        } catch (SQLException e) {
            System.out.println("error en actualizar tratamiento\n" + e);
        }

    }
    
    public int actualizarTratamiento(Tratamiento tr) {
        String sql;
        try {
            sql = "UPDATE tratamiento SET tipo=?,descripcion=?,medicamento=?,importe=?,activo=? WHERE id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, tr.getTipo());
            ps.setString(2, tr.getDescripcion());
            ps.setString(3, tr.getMedicamento());
            ps.setDouble(4, tr.getImporte());
            ps.setBoolean(5, tr.isActivo());
            ps.setInt(6, tr.getIdTratamiento());
            ps.executeUpdate();
            System.out.println("tratamiento actualizado");
            return 1;
        } catch (SQLException e) {
            System.out.println("Error en actualizar tratamiento\n" + e);
            return 0;
        }
    }

    
    public Tratamiento consultarTratamiento(int id) {
        Tratamiento tr = new Tratamiento();
        try {
            String sql="SELECT tipo, descripcion, medicamento, importe, activo FROM tratamiento WHERE id=? AND activo=1";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet rs= ps.executeQuery();
            if (rs.next()) {
                tr.setIdTratamiento(id);
                tr.setTipo(rs.getString("tipo"));
                tr.setDescripcion(rs.getString("descripcion"));
                tr.setMedicamento(rs.getString("medicamento"));
                tr.setImporte(rs.getDouble("importe"));
                tr.setActivo(rs.getBoolean("activo"));
                
                System.out.println(tr.toString());
            } 
            else System.out.println("No se encontro el tratamiento");
            
        } catch (SQLException e) {
            System.out.println("Error en consultar tratamiento\n"+e);
        }
        
        return tr;
        
    }
    
    public List listarActivos() {
        List<Tratamiento> datos = new ArrayList();
        try {
            String sql = "SELECT id, tipo, descripcion, medicamento, importe FROM tratamiento WHERE activo = 1";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Tratamiento tr = new Tratamiento();
                tr.setIdTratamiento(rs.getInt("id"));
                tr.setTipo(rs.getString("tipo"));
                tr.setDescripcion(rs.getString("descripcion"));
                tr.setMedicamento(rs.getString("medicamento"));
                tr.setImporte(rs.getDouble("importe"));
                datos.add(tr);
            }
            
            System.out.println("lista de tratamientos activos creada");
            
        } catch (SQLException e) {
            System.out.println("Error al listar mascotas\n" + e);
        }
        
        return datos;
    }

}
