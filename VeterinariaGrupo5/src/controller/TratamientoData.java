package controller;

import model.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Tratamiento;

public class TratamientoData {

    private Connection con = null;

    public TratamientoData(Conexion conexion) {
        this.con = conexion.getConexion();
    }

    public int insertarTratamiento(Tratamiento tr) {
        String instruccion = "INSERT INTO tratamiento (tipo, descripcion, medicamento, importe, activo) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(instruccion);

            ps.setString(1, tr.getTipo());
            ps.setString(2, tr.getDescripcion());
            ps.setString(3, tr.getMedicamento());
            ps.setDouble(4, tr.getImporte());
            ps.setBoolean(5, true);
            ps.executeUpdate();

            System.out.println("tratamiento insertado");
            return 1;
        } catch (SQLException e) {
            System.out.println("Error al insertar tratamiento\n" + e);
            return 0;
        }

    }

    public int actualizarTratamiento(Tratamiento tr) {
        String instruccion = "UPDATE tratamiento SET tipo=?,descripcion=?,medicamento=?,importe=?,activo=? WHERE id=?";
        try {
            PreparedStatement ps = con.prepareStatement(instruccion);
            ps.setString(1, tr.getTipo());
            ps.setString(2, tr.getDescripcion());
            ps.setString(3, tr.getMedicamento());
            ps.setDouble(4, tr.getImporte());
            ps.setBoolean(5, tr.isActivo());
            ps.setInt(6, tr.getIdTratamiento());
            ps.executeUpdate();
            return 1;
        } catch (SQLException e) {
            System.out.println("Error en actualizar tratamiento\n" + e);
            return 0;
        }
    }

    public void eliminarTratamiento(int id) {
        try {
            String sql = "UPDATE tratamiento SET activo=0 WHERE id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("error al eliminar tratamiento\n" + e);
        }

    }

    public List listar() {
        List<Tratamiento> datos = new ArrayList();
        String sql = "SELECT * FROM tratamiento WHERE activo = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Tratamiento tr = new Tratamiento();
                tr.setIdTratamiento(rs.getInt(1));
                tr.setTipo(rs.getString(2));
                tr.setDescripcion(rs.getString(3));
                tr.setMedicamento(rs.getString(4));
                tr.setImporte(rs.getDouble(5));
                tr.setActivo(rs.getBoolean(6));

                datos.add(tr);
            }
        } catch (SQLException e) {
            System.out.println("Error al listar mascotas\n" + e);
        }

        return datos;
    }

    public List medicamentos() {
        List<String> medicamentos = new ArrayList();
        String sql = "SELECT DISTINCT medicamento FROM tratamiento";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                medicamentos.add(rs.getString(1));
            }
        } catch (SQLException e) {
            System.out.println("Error al listar medicamentos\n" + e);
        }

        return medicamentos;
    }

    public List tipos() {
        List<String> tipos = new ArrayList();
        String sql = "SELECT DISTINCT tipo FROM tratamiento WHERE activo = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                tipos.add(rs.getString(1));
            }
        } catch (SQLException e) {
            System.out.println("Error al listar tipos de tratamientos\n" + e);
        }

        return tipos;
    }
}
