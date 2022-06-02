
package Veterinaria.controller;


import Veterinaria.model.Cliente;
import Veterinaria.model.Conexion;
import Veterinaria.model.Mascota;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class MascotaData {
     private Connection con=null;

    public MascotaData(Conexion conexion) {
        try {
            this.con = conexion.getConexion();
            
        } catch (SQLException e) {
            System.out.println("Error de conexion en MascotaData");
        }
    }
    
    
    
    
        /*
     public List<Mascota> listarMascotasActivas() {
        List<Mascota> lista= new ArrayList();
        
        try {
            String sql="SELECT * FROM mascota WHERE activo=1;";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()) {
                Mascota m = new Mascota();
                Cliente c = buscarCliente(rs.getInt("idCliente"));
                m.setIdMascota(rs.getInt("idMascota"));
                m.setAlias(rs.getString("alias"));
                m.setSexo(rs.getString("sexo"));
                m.setEspecie(rs.getString("especie"));
                m.setRaza(rs.getString("raza"));
                m.setColorPelaje(rs.getString("ColorPelaje"));
                m.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                m.setActivo(rs.getBoolean("activo"));
                m.setCliente(c);
                lista.add(m);  
            }
            ps.close();
            System.out.println("Lista de mascotas activas creada");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al listar mascotas activas");
        }
        
        return lista;
    }
    
    public  List<Cliente> buscarListarClientes() {
        ClienteData cd = new ClienteData(conexion);
        return cd.buscarCliente();
    }
    */
}
