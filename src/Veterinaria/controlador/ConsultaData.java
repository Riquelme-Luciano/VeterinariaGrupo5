
package Veterinaria.controlador;

import Veterinaria.modelo.Conexion;
import java.sql.Connection;
import java.sql.SQLException;

public class ConsultaData {
    private Connection con=null;
    
    public ConsultaData(Conexion conexion) {
        try {
            this.con = conexion.getConexion();
            
        } catch (SQLException e) {
            System.out.println("Error de conexion en ConsultaData");
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
 
    
}
