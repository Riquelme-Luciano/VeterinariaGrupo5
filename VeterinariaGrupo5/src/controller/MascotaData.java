package controller;

import model.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Cliente;
import model.Mascota;
import model.TipoMascota;

public class MascotaData {

    private Connection con = null;
    ClienteData dataCliente;

    public MascotaData(Conexion conexion) {
        dataCliente = new ClienteData(conexion);
        this.con = conexion.getConexion();
    }

    public int insertarMascota(Mascota m) {
        String instruccion = "INSERT INTO mascota(alias,sexo,especie,raza,color,nacimiento,documentoCliente,activo) VALUES (?,?,?,?,?,?,?,?)";
        try {
            //this.con = conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(instruccion);
            ps.setString(1, m.getAlias());
            ps.setString(2, String.valueOf(m.getSexo()));
            ps.setString(3, m.getEspecie().toString());
            ps.setString(4, m.getRaza());
            ps.setString(5, m.getColorPelaje());
            
            //hago la conversion para que me inserte fecha de tipo date.sql
            //long d = m.getNacimiento().getTime();
            //java.sql.Date fechaNacimiento = new java.sql.Date(d);
            
            ////Hago esta conversion para que me ande en el main//
            //porque si no, me devuelve null la fecha y lanza error//
            java.util.Date date = new java.util.Date();
            java.sql.Date sqlDate = new java.sql.Date(date.getTime());
            ps.setDate(6,sqlDate);
            //------
            ps.setLong(7, m.getDueño().getDni());
            ps.setBoolean(8, true);

            System.out.println("mascota insertada");
            ps.executeUpdate();
            return 1;
        } catch (SQLException e) {
            System.err.println("Error al insertar mascota a la bd" + e);
            return 0;
        }
    }

    public int actualizarMascota(Mascota m) {
        String instruccion = "UPDATE mascota SET alias=?,sexo=?,especie=?,raza=?,color=?,nacimiento=?,documentoCliente=?,activo=? WHERE codigo=?";
        try {
            PreparedStatement ps = con.prepareStatement(instruccion);
            ps.setString(1, m.getAlias());
            ps.setString(2, String.valueOf(m.getSexo()));
            ps.setString(3, m.getEspecie().toString());
            ps.setString(4, m.getRaza());
            ps.setString(5, m.getColorPelaje());
            //hago la conversion para que me inserte fecha de tipo date.sql
            long d = m.getNacimiento().getTime();
            java.sql.Date fechaNacimiento = new java.sql.Date(d);
            ps.setDate(6, fechaNacimiento);
            //------
            ps.setLong(7, m.getDueño().getDni());
            ps.setBoolean(8, m.isActivo());
            ps.setInt(9, m.getCodigo());
            ps.executeUpdate();

            return 1;
        } catch (Exception e) {
            System.out.println("Error al querer actualizar mascota en data" + e);
            return 0;
        }
    }

    public void eliminarMascota(int codigo) {
        String instruccion = "UPDATE mascota SET activo=false WHERE codigo=?";
        try {
            PreparedStatement ps = con.prepareStatement(instruccion);
            ps.setInt(1, codigo);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al querer cambiar a estado inactivo a mascota en data" + e);
        }
    }

    public List listar() {
        List<Mascota> datos = new ArrayList<>();
        String instruccion = "SELECT * FROM mascota WHERE activo=1";
        try {
            PreparedStatement ps = con.prepareStatement(instruccion);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Mascota m = new Mascota();
                m.setCodigo(rs.getInt(1));
                m.setAlias(rs.getString(2));
                m.setSexo(rs.getString(3).charAt(0));
                m.setEspecie(Mascota.validarTipoMascota(rs.getString(4)));
                m.setRaza(rs.getString(5));
                m.setColorPelaje(rs.getString(6));

                m.setNacimiento(rs.getDate(7));

                m.setCliente(dataCliente.buscarCliente(rs.getInt(8)));
                m.setActivo(rs.getBoolean(9));
                datos.add(m);
            }
        } catch (SQLException e) {
            System.out.println("Error al listar mascotas " + e);
        }

        return datos;
    }


}
