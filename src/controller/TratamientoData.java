
package controller;

import model.Conexion;
import java.sql.Connection;
import java.sql.SQLException;

public class TratamientoData {
     private Connection con=null;
    
    public TratamientoData(Conexion conexion) {
        try {
            this.con = conexion.getConexion();
            
        } catch (SQLException e) {
            System.out.println("Error de conexion en TratamientoData");
        }
    }
    
    
    
    
    
    
    
}
