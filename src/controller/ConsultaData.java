package controller;

import model.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Mascota;
import model.Tratamiento;
import model.Visita;

public class ConsultaData {

    private Connection con = null;
    MascotaData dataMascota;
    TratamientoData dataTratamiento;

    public ConsultaData(Conexion conexion) {
        this.con = conexion.getConexion();
        dataMascota = new MascotaData(conexion);
        dataTratamiento = new TratamientoData(conexion);
    }

    public int insertarVisita(Visita v) {
        String sql;
        try {
            sql = "INSERT INTO visita (idMascota, idTratamiento, fecha, detalle, pesoMedido, formaPago) VALUES(?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, v.getMascota().getCodigo());
            ps.setInt(2, v.getTratamiento().getIdTratamiento());
            //hago la conversion para que me inserte fecha de tipo date.sql
            long d = v.getFecha().getTime();
            java.sql.Date fecha = new java.sql.Date(d);
            ps.setDate(3, fecha);
            //------
            ps.setString(4, v.getDetalle());
            ps.setDouble(5, v.getPesoMedido());
            ps.setString(6, v.getFormaPago());
            ps.executeUpdate();
            return 1;
        } catch (SQLException e) {
            System.out.println("error en insertar visita\n" + e);
            return 0;
        }
    }

    public List listar() {
        List<Visita> datos = new ArrayList<>();
        String instruccion = "SELECT * FROM visita";
        try {
            PreparedStatement ps = con.prepareStatement(instruccion);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Visita v = new Visita();
                v.setIdConsulta(rs.getInt(1));
                v.setMascota(dataMascota.buscarMascota(rs.getInt(2)));
                v.setTratamiento(dataTratamiento.buscarTratamiento(rs.getInt(3)));
                v.setFecha(rs.getDate(4));
                v.setDetalle(rs.getString(5));
                v.setPesoMedido(rs.getInt(6));
                v.setFormaPago(rs.getString(7));
                datos.add(v);
            }
        } catch (SQLException e) {
            System.out.println("Error al listar visitas " + e);
        }
        return datos;
    }

    public int ultimaVisitaId() {
        String instruccion = "SELECT idVisita FROM visita ORDER BY idVisita DESC LIMIT 1";
        int id = 0;
        try {
            PreparedStatement ps = con.prepareStatement(instruccion);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                id = rs.getInt("idVisita");
            }
        } catch (SQLException e) {
            System.out.println("Error al querer obtener id de la ultima visita" + e);
        }
        return id;
    }

    public void eliminarVisita(int id) {
        String instruccion = "DELETE FROM visita WHERE idVisita=?";
        try {
            PreparedStatement ps = con.prepareStatement(instruccion);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al querer eliminar visita" + e);
        }
    }

    public List listarPorMascota(Mascota masc) {
        List<Visita> datos = new ArrayList<>();
        String instruccion = "SELECT * FROM visita WHERE idMascota=?";
        try {
            PreparedStatement ps = con.prepareStatement(instruccion);
            ps.setInt(1, masc.getCodigo());

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Visita v = new Visita();
                v.setIdConsulta(rs.getInt(1));
                v.setMascota(dataMascota.buscarMascota(rs.getInt(2)));
                v.setTratamiento(dataTratamiento.buscarTratamiento(rs.getInt(3)));
                v.setFecha(rs.getDate(4));
                v.setDetalle(rs.getString(5));
                v.setPesoMedido(rs.getInt(6));
                v.setFormaPago(rs.getString(7));
                datos.add(v);
            }
        } catch (SQLException e) {
            System.out.println("Error al listar visitas con filtro de mascota " + e);
        }
        return datos;
    }

    public List listarPorTratamiento(Tratamiento trat) {
        List<Visita> datos = new ArrayList<>();
        String instruccion = "SELECT * FROM visita WHERE idTratamiento=?";
        try {
            PreparedStatement ps = con.prepareStatement(instruccion);
            ps.setInt(1, trat.getIdTratamiento());

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Visita v = new Visita();
                v.setIdConsulta(rs.getInt(1));
                v.setMascota(dataMascota.buscarMascota(rs.getInt(2)));
                v.setTratamiento(dataTratamiento.buscarTratamiento(rs.getInt(3)));
                v.setFecha(rs.getDate(4));
                v.setDetalle(rs.getString(5));
                v.setPesoMedido(rs.getInt(6));
                v.setFormaPago(rs.getString(7));
                datos.add(v);
            }
        } catch (SQLException e) {
            System.out.println("Error al listar visitas con filtro de tratamiento " + e);
        }
        return datos;
    }
}
