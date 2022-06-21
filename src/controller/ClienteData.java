package controller;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.Cliente;
import model.Conexion;

public class ClienteData {

    private Connection con = null;

    public ClienteData(Conexion conexion) {
        this.con = conexion.getConexion();
    }

    public int insertarCliente(Cliente cliente) {
        String instruccion = "INSERT INTO cliente(documento,nombre,apellido,telefono,direccion,personaAlternativa,activo) VALUES (?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(instruccion);
            ps.setLong(1, cliente.getDni());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getApellido());
            ps.setLong(4, cliente.getTelefono());
            ps.setString(5, cliente.getDireccion());
            ps.setString(6, cliente.getAlternativa());
            ps.setBoolean(7, true);

            ps.executeUpdate();

            return 1;
        } catch (Exception e) {
            System.out.println("Error al insertar cliente a la bd" + e);
            return 0;
        }
    }

    public int actualizarCliente(Cliente cliente) {
        String instruccion = "UPDATE cliente SET nombre=?, apellido=?, telefono=?, direccion=? , personaAlternativa=? WHERE documento=?";
        try {
            PreparedStatement ps = con.prepareStatement(instruccion);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getApellido());
            ps.setLong(3, cliente.getTelefono());
            ps.setString(4, cliente.getDireccion());
            ps.setString(5, cliente.getAlternativa());
            ps.setLong(6, cliente.getDni());

            ps.executeUpdate();
            return 1;
        } catch (Exception e) {
            System.out.println("Error al querer actualizar cliente en data" + e);
            return 0;
        }
    }

    public void eliminarCliente(int documento) {
        String instruccion = "UPDATE cliente INNER JOIN mascota "
                + "ON cliente.documento=mascota.documentoCliente SET cliente.activo=false,mascota.activo=false "
                + "WHERE cliente.documento=? AND mascota.documentoCliente=?";
        try {
            PreparedStatement ps = con.prepareStatement(instruccion);
            ps.setInt(1, documento);
            ps.setInt(2, documento);
            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println("Error al querer eliminar cliente en data" + e);
        }
    }

    public void eliminarClienteSinMascota(int documento) {
        String instruccion = "UPDATE cliente SET activo=0 WHERE documento=?";
        try {
            PreparedStatement ps = con.prepareStatement(instruccion);
            ps.setInt(1, documento);
            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println("Error al querer eliminar cliente en data" + e);
        }
    }

    public List listar() {

        List<Cliente> datos = new ArrayList<>();
        String instruccion = "SELECT * FROM cliente WHERE activo=true";
        try {
            PreparedStatement ps = con.prepareStatement(instruccion);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Cliente c = new Cliente();
                c.setDni(rs.getInt(1));
                c.setNombre(rs.getString(2));
                c.setApellido(rs.getString(3));
                c.setTelefono(rs.getLong(4));//convertir de date a LocalDate
                c.setDireccion(rs.getString(5));
                c.setAlternativa(rs.getString(6));
                datos.add(c);
            }

        } catch (SQLException e) {
            System.out.println("Error al listar clientes " + e);
        }

        return datos;
    }

    public List listarEliminados() {

        List<Cliente> datos = new ArrayList<>();
        String instruccion = "SELECT * FROM cliente WHERE activo=false";
        try {
            PreparedStatement ps = con.prepareStatement(instruccion);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Cliente c = new Cliente();
                c.setDni(rs.getInt(1));
                c.setNombre(rs.getString(2));
                c.setApellido(rs.getString(3));
                c.setTelefono(rs.getLong(4));//convertir de date a LocalDate
                c.setDireccion(rs.getString(5));
                c.setAlternativa(rs.getString(6));
                datos.add(c);
            }

        } catch (SQLException e) {
            System.out.println("Error al listar clientes " + e);
        }

        return datos;
    }

    public int activarCliente(int dni) {
        String instruccion = "UPDATE cliente SET activo=true WHERE documento=?";
        try {
            PreparedStatement ps = con.prepareStatement(instruccion);
            ps.setLong(1,dni);

            ps.executeUpdate();
            return 1;
        } catch (Exception e) {
            System.out.println("Error al querer activar cliente en data" + e);
            return 0;
        }
    }

    public Cliente buscarCliente(int dni) {
        Cliente c = new Cliente();
        String sql = "SELECT nombre, apellido, telefono,direccion,personaAlternativa FROM cliente WHERE documento=?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql); // Tener el string con la sentencia sql
            ps.setInt(1, dni); // seteo al sql el parametro dinamico el id
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                c.setNombre(rs.getString("nombre"));
                c.setApellido(rs.getString("apellido"));
                c.setTelefono(rs.getLong("telefono"));//convertir de date a LocalDate
                c.setDireccion(rs.getString("direccion"));
                c.setAlternativa(rs.getString("personaAlternativa"));

            }
            ps.close();

        } catch (SQLException ex) {
            System.out.println("Error de conexion con base de datos en buscar cliente" + ex);
        }

        return c;
    }
}
