
package Veterinaria.controlador;

import Veterinaria.modelo.Conexion;
import java.sql.Connection;
import java.sql.SQLException;

public class MascotaData {
     private Connection con=null;

    public MascotaData(Conexion conexion) {
        try {
            this.con = conexion.getConexion();
            
        } catch (SQLException e) {
            System.out.println("Error de conexion en MascotaData");
        }
    }
    
    
    
    
    
}
