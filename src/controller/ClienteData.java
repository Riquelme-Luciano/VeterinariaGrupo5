package controller;

import java.sql.*;
import model.Cliente;
import model.Conexion;

public class ClienteData {

    private Connection con = null;
    private Conexion conexion;

    public ClienteData(Conexion conexion) {
        this.conexion = conexion;
        //this.con=conexion.getConexion();
    }

    public int insertarCliente(Cliente cliente) {
        String instruccion = "INSERT INTO cliente(documento,nombre,apellido,telefono,direccion,personaAlternativa) VALUES (?,?,?,?,?,?)";
        try {
            this.con = conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(instruccion);
            ps.setLong(1, cliente.getDni());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getApellido());
            ps.setLong(4, cliente.getTelefono());
            ps.setString(5, cliente.getDireccion());
            ps.setString(6, cliente.getAlternativa());

            ps.executeUpdate();
            this.con.close();
            return 1;
        } catch (Exception e) {
            System.out.println("Error al insertar cliente a la bd" + e);
            return 0;
        }
    }

    public int actualizarCliente(Cliente cliente) {
        String instruccion = "UPDATE cliente SET nombre=?, apellido=?, telefono=?, direccion=? , personaAlternativa=? WHERE documento=?";
        try {
            this.con = conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(instruccion);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getApellido());
            ps.setLong(3, cliente.getTelefono());
            ps.setString(4, cliente.getDireccion());
            ps.setString(5, cliente.getAlternativa());
            ps.setLong(6, cliente.getDni());

            ps.executeUpdate();

            this.con.close();
            return 1;
        } catch (Exception e) {
            System.out.println("Error al querer actualizar cliente en data" + e);
            return 0;
        }
    }

    public void eliminarCliente(int documento) {
        String instruccion = "DELETE FROM cliente WHERE documento=?";
        try {
            this.con = conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(instruccion);
            ps.setInt(1, documento);
            ps.executeUpdate();
            this.con.close();
        } catch (Exception e) {
            System.out.println("Error al querer eliminar cliente en data" + e);
        }
    }
}
