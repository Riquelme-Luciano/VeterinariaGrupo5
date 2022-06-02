package Veterinaria.controller;

import Veterinaria.model.Cliente;
import Veterinaria.model.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

        
public class ClienteData {
    private Connection con;

    public ClienteData(Conexion conexion) {
        try {
            this.con = conexion.getConexion();
            
        } catch (SQLException e) {
            System.out.println("Error de conexion en ClienteData");
        }
    }  
    
    public int insertarCliente(Cliente cliente) {
        String instruccion = "INSERT INTO cliente(documento,nombre,apellido,telefono,direccion,personaAlternativa) VALUES (?,?,?,?,?,?)";
        try {
            //this.con = conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(instruccion);
            ps.setLong(1, cliente.getDni());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getApellido());
            ps.setLong(4, cliente.getTelefono());
            ps.setString(5, cliente.getDireccion());
            ps.setString(6, cliente.getAlternativa());

            ps.executeUpdate();
            ps.close();
            //this.con.close();
             return 1;
        } catch (SQLException e) {
            System.out.println("Error al insertar cliente a la bd" + e);
            return 0;
        }
    }

    public int actualizarCliente(Cliente cliente) {
        String instruccion = "UPDATE cliente SET nombre=?, apellido=?, telefono=?, direccion=? , personaAlternativa=? WHERE documento=?";
        try {
            //this.con = conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(instruccion);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getApellido());
            ps.setLong(3, cliente.getTelefono());
            ps.setString(4, cliente.getDireccion());
            ps.setString(5, cliente.getAlternativa());
            ps.setLong(6, cliente.getDni());

            ps.executeUpdate();
            ps.close();
            //this.con.close();
            return 1;
        } catch (SQLException e) {
            System.out.println("Error al querer actualizar cliente en data" + e);
            return 0;
        }
    }

    public void eliminarCliente(int documento) {
        String instruccion = "DELETE FROM cliente WHERE documento=?";
        try {
           // this.con = conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(instruccion);
            ps.setInt(1, documento);
            ps.executeUpdate();
            this.con.close();
        } catch (SQLException e) {
            System.out.println("Error al querer eliminar cliente en data" + e);
        }
    }
    
    
    public List<Cliente> listarClientes() {
        List<Cliente> lista= new ArrayList();
        
        try {
            String sql="SELECT * FROM cliente";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()) {
                Cliente c = new Cliente();
                c.setIdCliente(rs.getInt("idCliente"));
                c.setDni(rs.getInt("dni"));
                c.setNombre(rs.getString("nombre"));
                c.setApellido(rs.getString("apellido"));
                c.setDireccion(rs.getString("direccion"));
                c.setTelefono(rs.getInt("telefono"));
                c.setAlternativa(rs.getString("contactoAlternativo"));
                lista.add(c);  
            }
            ps.close();
            System.out.println("Lista de clientes creada");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al buscar lista de clientes");
        }
        
        return lista;
        }
    
    
        
    }
    
  
    
    
    
    
    
    

